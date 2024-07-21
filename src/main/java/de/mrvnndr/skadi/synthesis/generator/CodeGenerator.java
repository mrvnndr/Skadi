package de.mrvnndr.skadi.synthesis.generator;

import de.mrvnndr.skadi.analysis.Action;
import de.mrvnndr.skadi.analysis.EnterAction;
import de.mrvnndr.skadi.analysis.FinishAction;
import de.mrvnndr.skadi.analysis.ProgressAction;
import de.mrvnndr.skadi.synthesis.CodeUtil;
import de.mrvnndr.skadi.synthesis.GenerationException;
import de.mrvnndr.skadi.synthesis.NFAEdge;
import de.mrvnndr.skadi.synthesis.SynthesisResult;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public abstract class CodeGenerator {
    protected final SynthesisResult synthesisResult;

    protected CodeGenerator(SynthesisResult synthesisResult) {
        this.synthesisResult = synthesisResult;
    }

    public abstract String generate();


    protected String replaceToken(String input, String token, String replacement) {
        var indentation = CodeUtil.getTokenIndentation(input, token);
        var indented = replacement.indent(indentation);
        return input.replaceAll("[ \\t]*" + token, Matcher.quoteReplacement(indented));
    }

    protected String getOptionValue(String embeddingID, String optionName) {
        var embedding = synthesisResult.embeddings().get(embeddingID);
        var optionValue = embedding.optionMap().get(optionName);

        if (optionValue == null) {
            var msg = "Embedding %s does not define option %s!".formatted(embeddingID, optionName);
            throw new GenerationException(msg);
        }

        return optionValue;
    }

    protected Collection<Action> getAllActions(String automatonID) {
        return synthesisResult.automatons().get(automatonID).getNFA().edgeSet()
                .stream()
                .map(NFAEdge::getActions)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }

    protected String getActionVarName(Action action) {
        var locString = action.getLocator().toString();
        var stateString = switch (action) {
            case EnterAction ignored -> "enter";
            case ProgressAction ignored -> "progress";
            case FinishAction ignored -> "finish";
            default -> throw new IllegalStateException("Unexpected value: " + action);
        };

        return "do_%s_%s_%d".formatted(stateString, locString.replace(".", "_"), action.getId());
    }
}
