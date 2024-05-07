package de.mrvnndr.skadi.analysis.check;

import de.mrvnndr.skadi.ConsoleUtil;
import de.mrvnndr.skadi.analysis.AnalysisResult;
import de.mrvnndr.skadi.analysis.ParsedRegex;
import org.jgrapht.alg.cycle.TarjanSimpleCycles;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CyclicDependencyCheck implements SemanticCheck {
    @Override
    public boolean performCheck(AnalysisResult analysisResult) {
        return checkReferencesValid(analysisResult) && checkDependenciesNonCyclic(analysisResult);
    }

    private boolean checkReferencesValid(AnalysisResult analysisResult) {
        var result = true;
        var unifiedMap = new HashMap<String, ParsedRegex>();

        unifiedMap.putAll(analysisResult.automatonMap());
        unifiedMap.putAll(analysisResult.fragmentMap());

        for (var regexID : unifiedMap.keySet()) {
            var deps = unifiedMap.get(regexID).getDependencies();
            for (var dep : deps) {
                if (analysisResult.fragmentMap().containsKey(dep)) {
                    continue;
                }
                if (analysisResult.automatonMap().containsKey(dep)) {
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

    private boolean checkDependenciesNonCyclic(AnalysisResult analysisResult) {
        var graph = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
        var unifiedMap = new HashMap<String, ParsedRegex>();

        unifiedMap.putAll(analysisResult.automatonMap());
        unifiedMap.putAll(analysisResult.fragmentMap());

        for (var regexID : unifiedMap.keySet()) {
            if (!graph.containsVertex(regexID)) {
                graph.addVertex(regexID);
            }
            var deps = unifiedMap.get(regexID).getDependencies();
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
}
