package de.mrvnndr.skadi;

public class ConsoleUtil {
    public static void error(String str) {
        println("Error: " + str, Color.RED);
    }

    public static void warn(String str) {
        println("Warning: " + str, Color.YELLOW);
    }

    public static void print(String str, Color color) {
        System.out.print("Skadi -- ");
        System.out.print(color.escape);
        System.out.print(str);
        System.out.print("\033[0m");
    }

    public static void println(String str, Color color) {
        System.out.print("Skadi -- ");
        System.out.print(color.escape);
        System.out.println(str);
        System.out.print("\033[0m");
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
