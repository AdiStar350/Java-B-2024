// Importing Scanner class.
import java.util.Scanner;

public class IsValidPhoneNumber {
    
    // Creating a static Scanner object to read input from the user.
    static Scanner input = new Scanner(System.in);

    /**
     * Checks if the provided string is a valid phone number based on specific criteria.
     * A valid phone number must:
     * - Be exactly 11 characters long.
     * - Start with "05".
     * - Have a third digit between 0 and 8 (inclusive).
     * - Have a hyphen ('-') as the fourth character.
     * - Contain only digits from the fifth character onwards.
     *
     * @param str The string representing the phone number to be validated.
     * @return true if the string meets all the criteria for a valid phone number, false otherwise.
     */
    public static boolean isValid(String str) {
        // Check if the string is exactly 11 characters long.
        if (str.length() != 11) {
            return false;
        }

        // Check if the string starts with "05".
        if (!str.startsWith("05")) {
            return false;
        }

        // Check if the third digit is between 0 and 8 (inclusive).
        if (str.charAt(2) > '8' || str.charAt(2) < '0' ) {
            return false;
        }

        // Check if the fourth character is a hyphen ('-').
        if (str.charAt(3) != '-') {
            return false;
        }

        // Check if the rest of the characters are digits.
        for (int i = 4; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        
        // If all the criteria are met, return true.
        return true;
    }

    public static void main(String[] args) {
        // Declaring the variables.
        String str; // -> A string to store the phone number.
        int cnt = 0; // -> An integer to store the number of strings entered.

        // Loop to get the phone number from the user.
        do {
            // Increment the number of strings entered.
            cnt++;
            // Prompt the user to enter the phone number.
            System.out.print(String.format("%d. Enter phone number: ", cnt));
            str = input.nextLine();
            
        } while (!isValid(str)); // Loop until a valid phone number is entered.

        // Print the number of strings entered.
        System.out.println(String.format("You have entered %d strings.", cnt));
    }
}
