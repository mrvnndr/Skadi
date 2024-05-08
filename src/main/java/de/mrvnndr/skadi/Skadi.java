package de.mrvnndr.skadi;

import de.mrvnndr.skadi.analysis.AnalysisController;
import de.mrvnndr.skadi.analysis.AnalysisResult;
import de.mrvnndr.skadi.analysis.SemanticAnalysisException;
import de.mrvnndr.skadi.synthesis.JavaGenerator;
import de.mrvnndr.skadi.synthesis.SynthesisResult;
import de.mrvnndr.skadi.synthesis.Synthesizer;
import de.mrvnndr.skadi.synthesis.VHDLGenerator;
import picocli.CommandLine;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;

@CommandLine.Command(name = "Skadi", version = "Skadi 1.0", mixinStandardHelpOptions = true)
public class Skadi implements Callable<Integer> {

    @CommandLine.Parameters(arity = "1", description = "Skadi input file")
    Path inputFile;

    @CommandLine.Option(names = {"-l", "--language"}, description = "Language for code output")
    TargetLanguage targetLanguage = TargetLanguage.VHDL;

    @CommandLine.Option(names = {"-n", "--nfa"}, description = "Output DOT files for finished NFAs.")
    boolean outputNFA = false;

    @CommandLine.Option(names = {"-e", "--enfa"}, description = "Output DOT files for epsilon NFAs.")
    boolean outputEpsilonNFA = false;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Skadi())
                .setCaseInsensitiveEnumValuesAllowed(true)
                .execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() {

        if (!checkInputFile(inputFile)) {
            return 1;
        }

        AnalysisResult analysisResult;
        try {
            analysisResult = AnalysisController.analyseFile(inputFile);
        } catch (SemanticAnalysisException e) {
            //Message was already printed by analysis.
            return 1;
        } catch (IOException e) {
            ConsoleUtil.error("Error reading input file: " + e.getMessage());
            return 1;
        }

        var synthesisResult = Synthesizer.synthesize(analysisResult);

        if (outputNFA || outputEpsilonNFA) {
            var ret = writeDOT(synthesisResult, analysisResult, inputFile);
            if (ret != 0) {
                return ret;
            }
        }

        var output = generateOutput(synthesisResult, targetLanguage);
        System.out.println(output);

        return 0;
    }

    private String generateOutput(SynthesisResult synthesisResult, TargetLanguage targetLanguage) {
        return switch (targetLanguage) {
            case VHDL -> new VHDLGenerator(synthesisResult).generate();
            case JAVA -> JavaGenerator.generate(synthesisResult);
        };
    }

    private int writeDOT(SynthesisResult synthesisResult, AnalysisResult analysisResult, Path inputPath) {
        try {
            if (outputNFA) {
                outputNFAs(synthesisResult, inputPath.getParent());
            }

            if (outputEpsilonNFA) {
                outputEpsilonNFAs(analysisResult, inputPath.getParent());
            }
        } catch (IOException e) {
            ConsoleUtil.error("Error writing output: " + e.getMessage());
            return 1;
        }
        return 0;
    }

    private static void outputNFAs(SynthesisResult synthesisResult, Path basePath) throws IOException {
        for (var automatonID : synthesisResult.automatons().keySet()) {
            var nfa = synthesisResult.automatons().get(automatonID).getNFA();
            var dotCode = GraphIO.exportNFAToDOT(nfa);
            try (var writer = new FileWriter(basePath.resolve(automatonID + ".dot").toString())) {
                writer.write(dotCode);
            }
        }
    }

    private static void outputEpsilonNFAs(AnalysisResult in, Path basePath) throws IOException {
        for (var automatonID : in.automatonMap().keySet()) {
            var nfa = Synthesizer.buildRawAutomaton(automatonID, in).nfa();
            var dotCode = GraphIO.exportNFAToDOT(nfa);
            try (var writer = new FileWriter(basePath.resolve(automatonID + "_e.dot").toString())) {
                writer.write(dotCode);
            }
        }
    }

    private static boolean checkInputFile(Path p) {
        if (Files.notExists(p)) {
            ConsoleUtil.error("Input file does not exist!");
            return false;
        }

        if (!Files.isReadable(p)) {
            ConsoleUtil.error("Can not read input file!");
            return false;
        }

        if (!Files.isRegularFile(p)) {
            ConsoleUtil.error("Input is not a file!");
            return false;
        }
        return true;
    }

    private enum TargetLanguage {
        VHDL("vhd"),
        JAVA("java");

        final String fileExtension;

        TargetLanguage(String fileExtension) {
            this.fileExtension = fileExtension;
        }
    }
}