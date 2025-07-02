package realscenario.util;

public class AnsiColor {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static String colorize(String text, String color) {
        return color + text + RESET;
    }

    public static void printlnGreen(String text) {
        System.out.println(colorize(text, GREEN));
    }
    public static void printlnRed(String text) {
        System.out.println(colorize(text, RED));
    }
    public static void printlnBlue(String text) {
        System.out.println(colorize(text, BLUE));
    }
    public static void printlnYellow(String text) {
        System.out.println(colorize(text, YELLOW));
    }
    public static void printlnPurple(String text) {
        System.out.println(colorize(text, PURPLE));
    }
    public static void printlnCyan(String text) {
        System.out.println(colorize(text, CYAN));
    }
    public static void printlnWhite(String text) {
        System.out.println(colorize(text, WHITE));
    }
    public static void printlnBlack(String text) {
        System.out.println(colorize(text, BLACK));
    }
} 