package de.mrvnndr.skadi.synthesis;

import de.mrvnndr.skadi.analysis.ActionLocator;
import de.mrvnndr.skadi.analysis.Quantifier;
import de.mrvnndr.skadi.analysis.SemanticAnalysisException;
import de.mrvnndr.skadi.analysis.antlr.SkadiRegexBaseListener;
import de.mrvnndr.skadi.analysis.antlr.SkadiRegexParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RegexNFABuilder extends SkadiRegexBaseListener {
    private final ParseTreeProperty<ThompsonNFA> nfaFragments = new ParseTreeProperty<>();
    private final ParseTreeProperty<Quantifier> quantifiers = new ParseTreeProperty<>();
    private final ParseTreeProperty<Set<Character>> chars = new ParseTreeProperty<>();

    private final ActionLocator currentLocator;
    private final Map<ActionLocator, ThompsonNFA> builtFragments;

    private ThompsonNFA result = null;

    public RegexNFABuilder(ActionLocator currentLocator, Map<ActionLocator, ThompsonNFA> builtFragments) {
        this.currentLocator = currentLocator;
        this.builtFragments = builtFragments;
    }

    public ThompsonNFA getResult() {
        Objects.requireNonNull(result);
        return result;
    }

    @Override
    public void exitRegex(SkadiRegexParser.RegexContext ctx) {
        var alternatives = ctx.alternative();
        var nfa = analyzeRegex(alternatives);
        nfaFragments.put(ctx, nfa);
        result = nfa;
    }

    @Override
    public void exitInner_regex(SkadiRegexParser.Inner_regexContext ctx) {
        var alternatives = ctx.alternative();
        var nfa = analyzeRegex(alternatives);
        nfaFragments.put(ctx, nfa);
    }

    private ThompsonNFA analyzeRegex(List<SkadiRegexParser.AlternativeContext> alternatives) {
        var iter = alternatives.iterator();
        var firstAlt = iter.next();
        ThompsonNFA currentNFA = nfaFragments.get(firstAlt);

        while (iter.hasNext()) {
            var alternative = iter.next();
            var nextNFA = nfaFragments.get(alternative);
            currentNFA = ThompsonNFA.alternation(currentNFA, nextNFA);
        }

        return currentNFA;
    }

    @Override
    public void exitAlternative(SkadiRegexParser.AlternativeContext ctx) {
        var terms = ctx.term();
        if (terms.isEmpty()) {
            nfaFragments.put(ctx, ThompsonNFA.empty());
            return;
        }

        var iter = terms.iterator();
        var firstTerm = iter.next();
        ThompsonNFA currentNFA = nfaFragments.get(firstTerm);

        while (iter.hasNext()) {
            var term = iter.next();
            var nextNFA = nfaFragments.get(term);
            currentNFA = ThompsonNFA.concatenation(currentNFA, nextNFA);
        }

        nfaFragments.put(ctx, currentNFA);
    }

    @Override
    public void exitAtomBase(SkadiRegexParser.AtomBaseContext ctx) {
        nfaFragments.put(ctx, nfaFragments.get(ctx.atom()));
    }

    @Override
    public void exitAtomQuantifier(SkadiRegexParser.AtomQuantifierContext ctx) {
        var baseNFA = nfaFragments.get(ctx.atom());
        var quantifier = quantifiers.get(ctx.quantifier());
        var low = quantifier.atLeast();
        var high = quantifier.atMost();

        ThompsonNFA result;

        if (low == 0 && high == -1) {
            result = ThompsonNFA.repetition(baseNFA, false);
        } else if (low == 1 && high == -1) {
            result = ThompsonNFA.repetition(baseNFA, true);
        } else if (low == 0 && high == 1) {
            result = ThompsonNFA.maybe(baseNFA);
        } else if (low == high) {
            result = baseNFA;
            for (int i = 1; i < low; i++) {
                result = ThompsonNFA.concatenation(result, baseNFA);
            }
        } else if (high == -1) {
            result = baseNFA;
            for (int i = 1; i < low - 1; i++) {
                result = ThompsonNFA.concatenation(result, baseNFA);
            }
            var loop = ThompsonNFA.repetition(baseNFA, true);
            result = ThompsonNFA.concatenation(result, loop);
        } else {
            result = baseNFA;
            for (int i = 1; i < low; i++) {
                result = ThompsonNFA.concatenation(result, baseNFA);
            }
            for (int i = 1; i <= high - low; i++) {
                result = ThompsonNFA.concatenation(result, ThompsonNFA.maybe(baseNFA));
            }
        }

        nfaFragments.put(ctx, result);
    }

    @Override
    public void exitAtomAssertion(SkadiRegexParser.AtomAssertionContext ctx) {
        throw new SemanticAnalysisException("Assertions not implemented!", ctx.start);
    }

    @Override
    public void exitQuantifier(SkadiRegexParser.QuantifierContext ctx) {
        quantifiers.put(ctx, quantifiers.get(ctx.quantifier_prefix()));
    }

    @Override
    public void exitQuantifierStar(SkadiRegexParser.QuantifierStarContext ctx) {
        quantifiers.put(ctx, new Quantifier(0, -1));
    }

    @Override
    public void exitQuantifierPlus(SkadiRegexParser.QuantifierPlusContext ctx) {
        quantifiers.put(ctx, new Quantifier(1, -1));
    }

    @Override
    public void exitQuantifierQuestionMark(SkadiRegexParser.QuantifierQuestionMarkContext ctx) {
        quantifiers.put(ctx, new Quantifier(0, 1));
    }

    @Override
    public void exitQuantifierExactly(SkadiRegexParser.QuantifierExactlyContext ctx) {
        var amount = assembleNumber(ctx.digit());

        if (amount == 0) {
            throw new SemanticAnalysisException("Quantifier 0!", ctx.start);
        }

        quantifiers.put(ctx, new Quantifier(amount, amount));
    }

    @Override
    public void exitQuantifierAtLeast(SkadiRegexParser.QuantifierAtLeastContext ctx) {
        var amount = assembleNumber(ctx.digit());
        quantifiers.put(ctx, new Quantifier(amount, -1));
    }

    @Override
    public void exitQuantifierBetween(SkadiRegexParser.QuantifierBetweenContext ctx) {
        var amountLow = assembleNumber(ctx.amtL);
        var amountHigh = assembleNumber(ctx.amtH);

        if (amountLow == 0 && amountHigh == 0) {
            throw new SemanticAnalysisException("Quantifier 0!", ctx.start);
        }

        if (amountLow > amountHigh) {
            throw new SemanticAnalysisException("Qualifier lower bound greater than upper bound!", ctx.start);
        }

        quantifiers.put(ctx, new Quantifier(amountLow, amountHigh));
    }

    private int assembleNumber(List<SkadiRegexParser.DigitContext> digits) {
        var string = digits.stream().map(RuleContext::getText).collect(Collectors.joining());
        return Integer.parseInt(string);
    }

    @Override
    public void exitAtomPatternChar(SkadiRegexParser.AtomPatternCharContext ctx) {
        var text = ctx.pattern_char().getText();

        if (text.length() != 1) {
            throw new SemanticAnalysisException("Char atom invalid!", ctx.start);
        }

        var c = text.charAt(0);

        if (c > 127) {
            throw new SemanticAnalysisException("Non-ASCII char!", ctx.start);
        }

        var result = ThompsonNFA.characterTransition(List.of(c));

        nfaFragments.put(ctx, result);
    }

    @Override
    public void exitAtomPeriod(SkadiRegexParser.AtomPeriodContext ctx) {
        var ascii = IntStream.range(0, 128)
                .mapToObj(i -> (char) i)
                .filter(c -> c != '\n' && c != '\r')
                .toList();

        var result = ThompsonNFA.characterTransition(ascii);

        nfaFragments.put(ctx, result);
    }

    @Override
    public void exitAtomAtomEscape(SkadiRegexParser.AtomAtomEscapeContext ctx) {
        var result = ThompsonNFA.characterTransition(chars.get(ctx.atom_escape()));
        nfaFragments.put(ctx, result);
    }

    @Override
    public void exitAtomCharacterClass(SkadiRegexParser.AtomCharacterClassContext ctx) {
        var result = ThompsonNFA.characterTransition(chars.get(ctx.character_class()));
        nfaFragments.put(ctx, result);
    }

    @Override
    public void exitAtomParenRegex(SkadiRegexParser.AtomParenRegexContext ctx) {
        nfaFragments.put(ctx, nfaFragments.get(ctx.inner_regex()));
    }

    @Override
    public void exitAtomRuleReference(SkadiRegexParser.AtomRuleReferenceContext ctx) {
        var ruleName = ctx.rule_reference().rule_name().getText();
        var ruleLocator = new ActionLocator(List.of(ruleName)).withPrefix(currentLocator);

        if (!builtFragments.containsKey(ruleLocator)) {
            throw new SemanticAnalysisException("Unknown rule " + ruleName + "!");
        }

        nfaFragments.put(ctx, builtFragments.get(ruleLocator));
    }

    @Override
    public void exitAtom_escape(SkadiRegexParser.Atom_escapeContext ctx) {
        if (ctx.decimal_escape() != null) {
            chars.put(ctx, chars.get(ctx.decimal_escape()));
        } else if (ctx.character_escape() != null) {
            chars.put(ctx, chars.get(ctx.character_escape()));
        } else {
            chars.put(ctx, chars.get(ctx.character_class_escape()));
        }
    }

    @Override
    public void exitCharacter_escape(SkadiRegexParser.Character_escapeContext ctx) {
        if (ctx.control_escape() != null) {
            chars.put(ctx, chars.get(ctx.control_escape()));
        } else if (ctx.control_letter() != null) {
            chars.put(ctx, chars.get(ctx.control_letter()));
        } else if (ctx.hex_escape_sequence() != null) {
            chars.put(ctx, chars.get(ctx.hex_escape_sequence()));
        } else {
            chars.put(ctx, chars.get(ctx.identity_escape()));
        }
    }

    @Override
    public void exitControl_escape(SkadiRegexParser.Control_escapeContext ctx) {
        char c = switch (ctx.getText()) {
            case "f" -> '\f';
            case "n" -> '\n';
            case "r" -> '\r';
            case "t" -> '\t';
            case "v" -> 11;
            default -> throw new IllegalStateException("Unexpected value: " + ctx.getText());
        };
        chars.put(ctx, Set.of(c));
    }

    @Override
    public void exitControl_letter(SkadiRegexParser.Control_letterContext ctx) {
        var esc = ctx.getText().toLowerCase().charAt(0);
        var offset = esc - 'a' + 1;
        chars.put(ctx, Set.of((char) offset));
    }

    @Override
    public void exitIdentity_escape(SkadiRegexParser.Identity_escapeContext ctx) {
        chars.put(ctx, Set.of(ctx.getText().charAt(0)));
    }

    @Override
    public void exitDecimal_escape(SkadiRegexParser.Decimal_escapeContext ctx) {
        var esc = Integer.parseInt(ctx.getText());
        if (esc > 127) {
            throw new SemanticAnalysisException("Non-ASCII char!", ctx.start);
        }
        chars.put(ctx, Set.of((char) esc));
    }

    @Override
    public void exitHex_escape_sequence(SkadiRegexParser.Hex_escape_sequenceContext ctx) {
        var str = ctx.hex_digit(0).getText() + ctx.hex_digit(1).getText();
        var esc = Integer.parseInt(str, 16);
        if (esc > 127) {
            throw new SemanticAnalysisException("Non-ASCII char!", ctx.start);
        }
        chars.put(ctx, Set.of((char) esc));
    }

    @Override
    public void exitCharacter_class_escape(SkadiRegexParser.Character_class_escapeContext ctx) {
        var digits = Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        var whitespace = Set.of('\n', '\r', '\t', '\f', (char) 11, ' ');
        var w = IntStream.range(0, 128)
                .mapToObj(i -> (char) i)
                .filter(c -> Character.isAlphabetic(c) || c == '_' || Character.isDigit(c))
                .toList();
        Set<Character> result = switch (ctx.getText()) {
            case "d" -> digits;
            case "D" -> invertSet(digits);
            case "s" -> whitespace;
            case "S" -> invertSet(whitespace);
            case "w" -> new HashSet<>(w);
            case "W" -> invertSet(w);
            default -> throw new IllegalStateException("Unexpected value: " + ctx.getText());
        };
        chars.put(ctx, result);
    }

    private Set<Character> invertSet(Collection<Character> input) {
        var ascii = IntStream.range(0, 128).mapToObj(i -> (char) i).filter(c -> !input.contains(c)).toList();
        return new HashSet<>(ascii);
    }

    @Override
    public void exitCharacter_class(SkadiRegexParser.Character_classContext ctx) {
        if (ctx.CIRCUMFLEX() == null) {
            chars.put(ctx, chars.get(ctx.class_ranges()));
        } else {
            var ascii = IntStream.range(0, 128).boxed()
                    .map(i -> Character.toChars(i)[0])
                    .toList();
            var excludedChars = chars.get(ctx.class_ranges());

            var result = new HashSet<>(ascii);
            result.removeAll(excludedChars);
            chars.put(ctx, result);
        }
    }

    @Override
    public void exitClass_ranges(SkadiRegexParser.Class_rangesContext ctx) {
        if (ctx.non_empty_class_ranges() == null) {
            chars.put(ctx, Collections.emptySet());
        } else {
            chars.put(ctx, chars.get(ctx.non_empty_class_ranges()));
        }
    }

    @Override
    public void exitNon_empty_class_ranges(SkadiRegexParser.Non_empty_class_rangesContext ctx) {
        if (ctx.non_empty_class_ranges_no_dash() != null) {
            var newChar = chars.get(ctx.class_atom(0));
            var newSet = new HashSet<>(chars.get(ctx.non_empty_class_ranges_no_dash()));
            newSet.addAll(newChar);
            chars.put(ctx, newSet);
        } else if (ctx.class_atom().size() < 2) {
            chars.put(ctx, chars.get(ctx.class_atom(0)));
        } else {
            var set = new HashSet<>(chars.get(ctx.class_ranges()));
            var rangeSet = processRange(ctx.from, ctx.to);
            set.addAll(rangeSet);
            chars.put(ctx, set);
        }
    }

    @Override
    public void exitNon_empty_class_ranges_no_dash(SkadiRegexParser.Non_empty_class_ranges_no_dashContext ctx) {
        if (ctx.non_empty_class_ranges_no_dash() != null) {
            var newChar = chars.get(ctx.class_atom_no_dash());
            var newSet = new HashSet<>(chars.get(ctx.non_empty_class_ranges_no_dash()));
            newSet.addAll(newChar);
            chars.put(ctx, newSet);
        } else if (ctx.class_ranges() == null) {
            chars.put(ctx, chars.get(ctx.class_atom()));
        } else {
            var set = new HashSet<>(chars.get(ctx.class_ranges()));
            var rangeSet = processRange(ctx.from, ctx.to);
            set.addAll(rangeSet);
            chars.put(ctx, set);
        }
    }

    private Set<Character> processRange(ParseTree start, ParseTree stop) {
        var setStart = chars.get(start);
        var setStop = chars.get(stop);
        if (setStart.size() != 1 || setStop.size() != 1) {
            throw new SemanticAnalysisException("Char range invalid!");
        }

        char cStart = setStart.iterator().next();
        char cStop = setStop.iterator().next();
        var result = new HashSet<Character>();

        if (cStart > cStop) {
            throw new SemanticAnalysisException("Char range invalid!");
        }

        for (char c = cStart; c <= cStop; c++) {
            result.add(c);
        }

        return result;
    }

    @Override
    public void exitClass_atom(SkadiRegexParser.Class_atomContext ctx) {
        if (ctx.DASH() != null) {
            chars.put(ctx, Set.of('-'));
        } else {
            chars.put(ctx, chars.get(ctx.class_atom_no_dash()));
        }
    }

    @Override
    public void exitClass_atom_no_dash(SkadiRegexParser.Class_atom_no_dashContext ctx) {
        if (ctx.BACKSLASH() != null) {
            chars.put(ctx, chars.get(ctx.class_escape()));
        } else {
            var text = ctx.getText();

            var c = text.charAt(0);

            if (c > 127) {
                throw new SemanticAnalysisException("Non-ASCII char!", ctx.start);
            }

            chars.put(ctx, Set.of(c));
        }
    }

    @Override
    public void exitClass_escape(SkadiRegexParser.Class_escapeContext ctx) {
        if (ctx.CH_b() != null) {
            chars.put(ctx, Set.of((char) 8));
        } else if (ctx.decimal_escape() != null) {
            chars.put(ctx, chars.get(ctx.decimal_escape()));
        } else if (ctx.character_escape() != null) {
            chars.put(ctx, chars.get(ctx.character_escape()));
        } else {
            chars.put(ctx, chars.get(ctx.character_class_escape()));
        }
    }
}
