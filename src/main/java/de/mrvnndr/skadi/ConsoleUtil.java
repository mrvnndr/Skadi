package de.mrvnndr.skadi;

public class ConsoleUtil {
    public static void error(String str) {
        println("Error: " + str, Color.RED);
    }

    public static void warn(String str) {
        println("Warning: " + str, Color.YELLOW);
    }

    public static void print(String str, Color color) {
        System.err.print("Skadi -- ");
        doWithColor(color, () -> System.err.print(str));
    }

    public static void println(String str, Color color) {
        System.err.print("Skadi -- ");
        doWithColor(color, () -> System.err.println(str));
    }

    private static void doWithColor(Color color, Runnable action) {
        var useColor = shouldUseColor();
        if (useColor) {
            System.err.print(color.escape);
        }
        action.run();
        if (useColor) {
            System.err.print("\033[0m");
        }
    }

    public static boolean shouldUseColor() {
        var noColorVar = System.getenv("NO_COLOR");
        if (noColorVar != null && !noColorVar.isEmpty()) {
            return false;
        }
        return !"dumb".equals(System.getenv("TERM"));
    }

    public enum Color {
        RED("\033[0;31m"),
        GREEN("\033[0;32m"),
        YELLOW("\033[0;33m"),
        BLUE("\033[0;34m"),
        PURPLE("\033[0;35m"),
        CYAN("\033[0;36m");

        public final String escape;

        Color(String escape) {
            this.escape = escape;
        }
    }
}
