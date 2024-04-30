package de.mrvnndr.skadi.analysis.check;

import de.mrvnndr.skadi.ConsoleUtil;
import de.mrvnndr.skadi.analysis.FragmentDependencyParser;
import de.mrvnndr.skadi.analysis.InputFile;
import de.mrvnndr.skadi.analysis.ParsedRegex;
import org.jgrapht.alg.cycle.TarjanSimpleCycles;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class CyclicDependencyCheck implements SemanticCheck {
    @Override
    public boolean performCheck(InputFile inputFile) {
        return checkReferencesValid(inputFile) && checkDependenciesNonCyclic(inputFile);
    }

    private boolean checkReferencesValid(InputFile inputFile) {
        var result = true;
        var unifiedMap = new HashMap<String, ParsedRegex>();

        unifiedMap.putAll(inputFile.automatonMap());
        unifiedMap.putAll(inputFile.fragmentMap());

        for (var regexID : unifiedMap.keySet()) {
            var deps = getDependenciesOfRegex(unifiedMap.get(regexID));
            for (var dep : deps) {
                if (inputFile.fragmentMap().containsKey(dep)) {
                    continue;
                }
                if (inputFile.automatonMap().containsKey(dep)) {
                    var msg = "In regex '%s': Automatons (such as '%s') may not be used in other regular expressions!"
                            .formatted(regexID, dep);
                    ConsoleUtil.error(msg);
                    result = false;
                    continue;
                }
                var msg = "In regex '%s': Referenced fragment '%s' is unknown!"
                        .formatted(regexID, dep);
                ConsoleUtil.error(msg);
                result = false;
            }
        }
        return result;
    }

    private boolean checkDependenciesNonCyclic(InputFile inputFile) {
        var graph = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
        var unifiedMap = new HashMap<String, ParsedRegex>();

        unifiedMap.putAll(inputFile.automatonMap());
        unifiedMap.putAll(inputFile.fragmentMap());

        for (var regexID : unifiedMap.keySet()) {
            if (!graph.containsVertex(regexID)) {
                graph.addVertex(regexID);
            }
            var deps = getDependenciesOfRegex(unifiedMap.get(regexID));
            for (var dep : deps) {
                if (!graph.containsVertex(dep)) {
                    graph.addVertex(dep);
                }
                graph.addEdge(regexID, dep);
            }
        }

        var cycleAlgo = new TarjanSimpleCycles<>(graph);
        var cycles = new ArrayList<List<String>>();
        cycleAlgo.findSimpleCycles(cycles::add);

        for (var cycle : cycles) {
            var msg = "Cyclic dependency in regular expressions: %s"
                    .formatted(String.join(" -> ", cycle));
            ConsoleUtil.error(msg);
        }

        return cycles.isEmpty();
    }

    private static Set<String> getDependenciesOfRegex(ParsedRegex regex) {
        var depParser = new FragmentDependencyParser();
        regex.walkTree(depParser);
        return depParser.getDependencies();
    }
}
