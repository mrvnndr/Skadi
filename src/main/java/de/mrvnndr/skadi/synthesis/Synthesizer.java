package de.mrvnndr.skadi.synthesis;

import de.mrvnndr.skadi.analysis.ActionLocator;
import de.mrvnndr.skadi.analysis.AnalysisResult;
import de.mrvnndr.skadi.analysis.ParsedRegex;

import java.util.*;

/**
 * This class is the central access point for the construction of the automatons.
 */
public class Synthesizer {

    /**
     * Builds all automatons in their epsilon free form.
     *
     * @return The result of synthesis, including the automatons and the embedTargets with their embeddings
     */
    public static SynthesisResult synthesize(AnalysisResult analysisResult) {
        var automatonMap = analysisResult.automatonMap();
        var resultMap = new HashMap<String, EpsilonFreeNFA>();

        for (var automatonName : automatonMap.keySet()) {
            var nfa = buildAutomaton(automatonName, analysisResult);
            resultMap.put(automatonName, nfa);
        }
        return new SynthesisResult(analysisResult.embedTargets(), analysisResult.embeddings(), resultMap);
    }

    /**
     * Builds the automaton with the given id without any actions and including epsilon transitions.
     * This method is only used for visualizing the epsilon NFA when requested.
     * @param automatonName The id of an automaton
     * @return The raw automaton with epsilon transitions and without actions
     */
    public static ThompsonNFA buildRawAutomaton(String automatonName, AnalysisResult analysisResult) {
        var sortedLocators = createAutomatonBuildOrder(automatonName, analysisResult);

        var builtMap = new HashMap<ActionLocator, ThompsonNFA>();
        var regexMap = buildMergedRegexMap(analysisResult);

        for (var locator : sortedLocators) {
            var regex = regexMap.get(locator.definitionName());
            var nfa = buildLocatorNFA(locator, regex, builtMap);

            builtMap.put(locator, nfa);
        }
        return builtMap.get(new ActionLocator(automatonName));
    }

    /**
     * Builds the automaton with the given id with actions and no epsilon transitions.
     * @param automatonName The id of an automaton
     * @return The automaton with actions and without epsilon transitions
     */
    private static EpsilonFreeNFA buildAutomaton(String automatonName, AnalysisResult analysisResult) {
        var sortedLocators = createAutomatonBuildOrder(automatonName, analysisResult);

        var builtMap = new HashMap<ActionLocator, ThompsonNFA>();
        var regexMap = buildMergedRegexMap(analysisResult);

        for (var locator : sortedLocators) {
            var regex = regexMap.get(locator.definitionName());
            var nfa = buildLocatorNFA(locator, regex, builtMap);

            var epsFreeNFA = EpsilonFreeNFA.fromThompsonNFA(nfa);
            analysisResult.getMatchingActions(locator).forEach(a -> a.apply(epsFreeNFA));

            if (locator.getSize() == 1) {
                return epsFreeNFA;
            }
            builtMap.put(locator, ThompsonNFA.wrapEpsilonFreeNFA(epsFreeNFA));
        }
        throw new IllegalStateException();
    }

    /**
     * Helper method to put fragments and automatons together in one map.
     * @return Map containing all fragments and automatons with their id
     */
    private static Map<String, ParsedRegex> buildMergedRegexMap(AnalysisResult analysisResult) {
        var automatonMap = analysisResult.automatonMap();
        var fragmentMap = analysisResult.fragmentMap();

        var regexMap = new HashMap<String, ParsedRegex>();
        regexMap.putAll(automatonMap);
        regexMap.putAll(fragmentMap);

        return regexMap;
    }

    /**
     * Computes the list of ActionLocators in the proper order (shortest to longest) for building the automaton.
     * @param automatonName The id of an automaton
     * @return The ActionLocators in the order they can be built in.
     */
    private static List<ActionLocator> createAutomatonBuildOrder(String automatonName, AnalysisResult analysisResult) {
        var automatonRegex = analysisResult.automatonMap().get(automatonName);
        var baseLocator = new ActionLocator(automatonName);
        var allLocators = buildAllLocators(baseLocator, automatonRegex, analysisResult.fragmentMap());
        return allLocators.stream()
                .sorted(Comparator.comparingInt(ActionLocator::getSize))
                .toList()
                .reversed();
    }

    /**
     * Given a starting automaton, constructs all ActionLocators derivable from it.
     * @param start ActionLocator belonging to the starting automaton (usually simply its name)
     * @param automaton Parse tree belonging to the starting automaton
     * @param fragmentIdRegexMap Map of fragment ids and their parse trees
     * @return Set of all derivable ActionLocators
     */
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

    /**
     * Helper method to build the epsilon NFA for a given regular expression.
     * @param locator The locator at which the expression resides for inserting the right NFAs for fragments
     * @param regex The expression
     * @param builtFragments The built automatons for all fragments used in this expression
     * @return The epsilon NFA for the regular expression
     */
    private static ThompsonNFA buildLocatorNFA(ActionLocator locator, ParsedRegex regex,
                                               Map<ActionLocator, ThompsonNFA> builtFragments) {
        var buildListener = new RegexNFABuilder(locator, builtFragments);
        regex.walkTree(buildListener);
        return buildListener.getResult();
    }
}
