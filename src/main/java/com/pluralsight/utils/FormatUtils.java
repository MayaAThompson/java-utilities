package com.pluralsight.utils;
@SuppressWarnings("unused")
public class FormatUtils {

    private FormatUtils(){}

    /**
     * Prints a divider to the console.<br>
     * Accepts 2 arguments; a {@code String} and an {@code int}
     *
     * @param divider String that will be used as the divider printed to the console.
     * @param n the number of times the divider should be printed to the console.
     *
     */

    public static void printDivider(String divider, int n) { //Thanks, Griffin
        System.out.println(divider.repeat(Math.max(0, n)));
    }

    /**
     * Prints a divider to the console.<br>
     * Works like {@link FormatUtils#printDivider(String, int)} except uses a default divider "-"
     *
     * @param n the number of times the divider "-" should be printed to the console.
     * @see FormatUtils#printDivider(String, int)
     */
    public static void printDivider(int n) { //Thanks, Griffin
        System.out.println("-".repeat(Math.max(0, n)));
    }
}
