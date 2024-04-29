package de.mrvnndr.skadi.synthesis;

import java.util.stream.Collectors;

public class CodeUtil {
    public static String normalizeIndent(String text) {
        text = text.stripTrailing();
        text = text.lines()
                .dropWhile(String::isBlank)
                .collect(Collectors.joining(System.lineSeparator()));
        return text.stripIndent();
    }

    public static int getTokenIndentation(String text, String token) {
        var index = text.indexOf(token);
        int wscount = 0;
        for (int i = index - 1; i >= 0; i--) {
            var c = text.charAt(i);
            if (c != ' ' && c != '\t') {
                break;
            }
            wscount++;
        }
        return wscount;
    }
}