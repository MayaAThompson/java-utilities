package com.pluralsight.utils;
@SuppressWarnings("unused")
public class FormatUtils {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    private FormatUtils(){}

    /**
     * Prints a divider to the console.<br>
     * Accepts 2 arguments; a {@code String} and an {@code int}
     *
     * @param divider String that will be used as the divider printed to the console.
     * @param repeat the number of times the divider should be printed to the console.
     * @throws IllegalArgumentException if {@code repeat} is negative
     */

    public static void printDivider(String divider, int repeat) {
        System.out.println(divider.repeat(repeat));
    }

    /**
     * Prints a divider to the console.<br>
     * Works like {@link FormatUtils#printDivider(String, int)} except uses a default divider "-"
     *
     * @param repeat the number of times the divider "-" should be printed to the console.
     * @see FormatUtils#printDivider(String, int)
     * @throws IllegalArgumentException if {@code repeat} is negative
     */
    public static void printDivider(int repeat) {
        System.out.println("-".repeat(repeat));
    }

    /**
     * Colors a {@code String} <font color=#ff0000>red</font>
     * @param message input {@code String}
     * @return {@code String} with <font color=#ff0000>red</font> color applied
     */
    public static String makeRed(String message) {
        return (RED + message + RESET);
    }

    /**
     * Colors a {@code String} <font color=#00ff00>green</font>
     * @param message input {@code String}
     * @return {@code String} with <font color=#00ff00>green</font> color applied
     */
    public static String makeGreen(String message) {
        return (GREEN + message + RESET);
    }

    /**
     * Colors a {@code String} <font color=#ffff00>yellow</font>
     * @param message input {@code String}
     * @return {@code String} with <font color=#ffff00>yellow</font> color applied
     */
    public static String makeYellow(String message) {
        return (YELLOW + message + RESET);
    }

    /**
     * Colors a {@code String} <font color=#0000ff>blue</font>
     * @param message input {@code String}
     * @return {@code String} with <font color=#0000ff>blue</font> color applied
     */
    public static String makeBlue(String message) {
        return (BLUE + message + RESET);
    }

    /**
     * Colors a {@code String} <font color=#00ffff>cyan</font>
     * @param message input {@code String}
     * @return {@code String} with <font color=#00ffff>cyan</font> color applied
     */
    public static String makeCyan(String message) {
        return (CYAN + message + RESET);
    }

    /**
     * Colors a {@code String} <font color=#ff00ff>magenta</font>
     * @param message input {@code String}
     * @return {@code String} with <font color=#ff00ff>magenta</font> color applied
     */
    public static String makeMagenta(String message) {
        return (MAGENTA + message + RESET);
    }

    /**
     * Takes in a String message and a String color (<font color=#ff0000>red</font>, <font color=#0000ff>blue</font>, <font color=#00ff00>green</font>, <font color=#00ffff>cyan</font>, <font color=#ff00ff>magenta</font>, <font color=#ffff00>yellow</font>) and returns the message string in the color requested.
     * @param message {@code String} to have color applied to
     * @param color {@code String} (case-insensitive) color to be applied. <font color=#ff0000>red</font>, <font color=#0000ff>blue</font>, <font color=#00ff00>green</font>, <font color=#00ffff>cyan</font>, <font color=#ff00ff>magenta</font>, <font color=#ffff00>yellow</font> are currently supported colors.
     * @return {@code String} with color applied
     * @throws RuntimeException "Color option not available" if a non-supported color is requested
     */
    public static String makeColor(String message, String color) {
        color = color.toLowerCase();
        String coloredString;
        switch (color) {
        case "green" -> coloredString = GREEN + message + RESET;
        case "red" -> coloredString = RED + message + RESET;
        case "blue" -> coloredString = BLUE + message + RESET;
        case "yellow" -> coloredString = YELLOW + message + RESET;
        case "cyan" -> coloredString = CYAN + message + RESET;
        case "magenta" -> coloredString = MAGENTA + message + RESET;
        default -> throw new RuntimeException("Color option not available");
        }
        return coloredString;
    }
}
