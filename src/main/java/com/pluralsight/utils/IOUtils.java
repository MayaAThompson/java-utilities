package com.pluralsight.utils;

import java.util.Scanner;
@SuppressWarnings("unused")
public class IOUtils {

    private IOUtils() {}

    static Scanner scanner = new Scanner(System.in);

    /**
     * Prints a message to the console and returns the users input.
     *
     * @param message {@code String} message that you want to print to console.
     * @param required <p>{@code true} will loop until the {@code String} input from console is not empty.</p>
     *                    {@code false} will allow return to be empty.
     * @return User input {@code String} from console.
     */

    public static String messageAndResponse(String message, boolean required) { //Thanks, Griffin

        String response;

        do  {
            System.out.print(message);
            response = scanner.nextLine();
            if (response.isEmpty()) {
                System.out.println("This field is required");
            }
        } while (response.isEmpty());
        return response;

    }

    /**
     * Prints a message to the console and returns the users input.<br>
     * Works like {@link IOUtils#messageAndResponse(String, boolean)} except will always allow return of and empty {@code String}
     * @param message {@code String} message that you want to print to console.
     *
     * @return {@code String} from user input.
     * @see IOUtils#messageAndResponse(String, boolean)
     */

    public static String messageAndResponse(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    /**
     * Prints a message to the console and returns the users input {@code int}.<br>
     * Works like {@link IOUtils#messageAndResponse(String)} except attempts to return an {@code int}
     * @param message {@code String} message that you want to print to console.
     *
     * @return {@code int} from user input.
     * @see IOUtils#messageAndResponse(String)
     * @throws NumberFormatException if an @{code int} is not provided.
     */

    public static int messageAndResponseInt(String message) {
        System.out.print(message);
        return Integer.parseInt(scanner.nextLine());
    }

    /**
     * Prints a message to the console and returns the users input {@code double}.<br>
     * Works like {@link IOUtils#messageAndResponse(String)} except attempts to return an {@code double}
     * @param message {@code String} message that you want to print to console.
     *
     * @return {@code double} from user input.
     * @see IOUtils#messageAndResponse(String)
     * @throws NumberFormatException if a {@code double} is not provided.
     */
    public static double messageAndResponseDouble(String message) {
        System.out.print(message);
        return Double.parseDouble(scanner.nextLine());
    }

    /**
     * Pauses the program and waits for the next CRLF.
     * Anything else input to the console will be discarded.
     */

    public static void pauseReturn() {
        System.out.print("Press Enter to Continue: ");
        scanner.nextLine();
    }

    /**
     * Capitalizes the first letter of each word separated by a space in a {@code String} and makes every other character lower case.
     *
     * @param input {@code String} case insensitive.
     * @return {@code String} with the first letter of each word (space separated) capitalized.
     */

    public static String capitalizeWords(String input) { //Thanks, Heldana
        String[] words = input.trim().toLowerCase().split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {

            capitalized.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return capitalized.toString().trim();
    }
}
