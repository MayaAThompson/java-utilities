package com.pluralsight.utils;

import java.util.Scanner;
@SuppressWarnings("unused")
public class IOUtils {

    private IOUtils() {}

    static Scanner scanner = new Scanner(System.in);

    /**A utility to print a message to the console and return the users input.
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

    /**<p>A utility to print a message to the console and return the users input.</p>
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

    /**<p>A utility to print a message to the console and return the users input {@code int}.</p>
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

    /**<p>A utility to print a message to the console and return the users input {@code double}.</p>
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

    //pauses the program and continues on the next user input "enter"

    public static void pauseReturn() {
        System.out.print("Press Enter to Continue: ");
        scanner.nextLine();
    }

    //capitalizes the first letter of each word in a string

    public static String capitalizeWords(String input) { //Thanks, Heldana
        String[] words = input.trim().toLowerCase().split(" ");  // Split by spaces
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {

            capitalized.append(Character.toUpperCase(word.charAt(0)))  // Capitalize first char
                    .append(word.substring(1))                     // Append rest of word
                    .append(" ");                                   // Add space
        }
        return capitalized.toString().trim();  // Remove extra space at end
    }
}
