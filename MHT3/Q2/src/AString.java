// Import the Scanner class.
import java.util.Scanner;

public class AString {
    // Create a new instance of the Scanner class.
    static Scanner input = new Scanner(System.in);

    /**
     * Checks whether the given string has at least 2 'A's.
     *
     * @param str The string to check.
     * @return Whether the string has at least 2 'A's.
    **/
    public static boolean hasEnoughA(String str) {
        // Declare the variables.
        int cntA = 0; // -> The count of 'A's in the string.
        int cntSeq = 0; // -> The number of 'A's in a sequence.

        // Loop through the string and count the 'A's.
        for (int i = 0; i < str.length(); i++) {
            // If the string has an 'AA' sequence, return false.
            if (cntSeq > 1) { return false; }

            if (str.charAt(i) == 'A') {
                cntSeq++;
                cntA++;
            } else {
                cntSeq = 0;
            }
        }

        // Return whether the count of 'A's is greater than or equal to 2.
        return cntA >= 2 ;
    }

    public static void main(String[] args) {
        // Declare the variables.
        String str; // -> A string.

        // Get the string from the user.
        System.out.print("Enter a string: ");
        str = input.nextLine();

        // Check if the string has enough 'A' and print it.
        if (hasEnoughA(str)) {
            System.out.println("The string is valid");
        } else {
            System.out.println("The string is not valid.");
        }
    }
}
