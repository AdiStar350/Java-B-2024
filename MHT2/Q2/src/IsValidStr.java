// Import the Scanner class.
import java.util.Scanner;

public class IsValidStr {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    /**
     * Checks if the given string is valid.
     *
     * @param s the string to be checked
     * @return true if the string is valid, false otherwise
     */
    public static boolean isValid(String s) {
        // Check if the string is empty or has an odd number of characters.
        if (s.length() % 2 == 0 || s.isEmpty()) {
            // If it does, return false.
            return false;
        } else {
            // Else, check if the first, last, and middle characters are the same.
            if (s.charAt(0) != s.charAt((int) (s.length() / 2)) ||
                s.charAt((int) (s.length() / 2)) != s.charAt(s.length() - 1) {
                // If they are not, return false.
                return false;
            } else {
                // Else, return true.
                return true;
            }
        }
    }

    public static void main(String[] args) {
        // Declare the variables.
        String s;
        int cntValid = 0;

        for (int i = 0; i < 23; i++) {
            // Ask the user to enter a string.
            System.out.print("Enter a string: ");
            s = input.nextLine();

            // Check if the string is valid and add to count.
            if (isValid(s)) { cntValid++; }
        }

        System.out.println(String.format("\nYou entered %d valid strings and %d invalid strings.", cntValid, (23 - cntValid)));
    }
}
