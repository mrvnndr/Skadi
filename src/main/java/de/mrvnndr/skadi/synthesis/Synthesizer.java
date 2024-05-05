package de.mrvnndr.skadi.synthesis;

import de.mrvnndr.skadi.analysis.ActionLocator;
import de.mrvnndr.skadi.analysis.InputFile;
import de.mrvnndr.skadi.analysis.ParsedRegex;

import java.util.*;

public class Synthesizer {

    public static SynthesisResult synthesize(InputFile inputFile) {
        var automatonMap = inputFile.automatonMap();
        var resultMap = new HashMap<String, EpsilonFreeNFA>();

        for (var automatonName : automatonMap.keySet()) {
            var nfa = buildAutomaton(automatonName, inputFile);
            resultMap.put(automatonName, nfa);
        }
        return new SynthesisResult(inputFile.embedTargets(), inputFile.embeddings(), resultMap);
    }

    public static ThompsonNFA buildRawAutomaton(String automatonName, InputFile inputFile) {
        var sortedLocators = createAutomatonBuildOrder(automatonName, inputFile);

        var builtMap = new HashMap<ActionLocator, ThompsonNFA>();
        var regexMap = buildMergedRegexMap(inputFile);

        for (var locator : sortedLocators) {
            var regex = regexMap.get(locator.definitionName());
            var nfa = buildLocatorNFA(locator, regex, builtMap);

            builtMap.put(locator, nfa);
        }
        return builtMap.get(new ActionLocator(automatonName));
    }

    private static EpsilonFreeNFA buildAutomaton(String automatonName, InputFile inputFile) {
        var sortedLocators = createAutomatonBuildOrder(automatonName, inputFile);

        var builtMap = new HashMap<ActionLocator, ThompsonNFA>();
        var regexMap = buildMergedRegexMap(inputFile);

        for (var locator : sortedLocators) {
            var regex = regexMap.get(locator.definitionName());
            var nfa = buildLocatorNFA(locator, regex, builtMap);

            var epsFreeNFA = EpsilonFreeNFA.fromThompsonNFA(nfa);
            inputFile.getMatchingActions(locator).forEach(a -> a.apply(epsFreeNFA));

            if (locator.getSize() == 1) {
                return epsFreeNFA;
            }
            builtMap.put(locator, ThompsonNFA.wrapEpsilonFreeNFA(epsFreeNFA));
        }
        throw new IllegalStateException();
    }

    private static Map<String, ParsedRegex> buildMergedRegexMap(InputFile inputFile) {
        var automatonMap = inputFile.automatonMap();
        var fragmentMap = inputFile.fragmentMap();

        var regexMap = new HashMap<String, ParsedRegex>();
        regexMap.putAll(automatonMap);
        regexMap.putAll(fragmentMap);

        return regexMap;
    }

    private static List<ActionLocator> createAutomatonBuildOrder(String automatonName, InputFile inputFile) {
        var automatonRegex = inputFile.automatonMap().get(automatonName);
        var baseLocator = new ActionLocator(automatonName);
        var allLocators = buildAllLocators(baseLocator, automatonRegex, inputFile.fragmentMap());
        return allLocators.stream()
                .sorted(Comparator.comparingInt(ActionLocator::getSize))
                .toList()
                .reversed();
    }

    private static Set<ActionLocator> buildAllLocators(ActionLocator start, ParsedRegex automaton,
                                                       Map<String, ParsedRegex> fragmentIdRegexMap) {
        var locatorStack = new ArrayDeque<ActionLocator>();
        var regexStack = new ArrayDeque<ParsedRegex>();
        var result = new HashSet<ActionLocator>();

        locatorStack.push(start);
        regexStack.push(automaton);

        while (!locatorStack.isEmpty()) {
            var locator = locatorStack.pop();
            var regex = regexStack.pop();

            result.add(locator);

            for (var dep : regex.getDependencies()) {
                var newLocator = locator.withSuffix(new ActionLocator(List.of(dep)));
                locatorStack.push(newLocator);
                regexStack.push(fragmentIdRegexMap.get(dep));
            }
        }
        return result;
    }

    private static ThompsonNFA buildLocatorNFA(ActionLocator locator, ParsedRegex regex,
                                               Map<ActionLocator, ThompsonNFA> builtFragments) {
        var buildListener = new RegexNFABuilder(locator, builtFragments);
        regex.walkTree(buildListener);
        return buildListener.getResult();
    }
}
