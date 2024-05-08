// TODO Import the scanner object.
import java.util.Scanner;

public class IsPali {
    // TODO Create a new scanner object.
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO Declare the variables.
        String str = "ABTTTTTBA"; // [x] -> The string that needs to be checked.
        boolean isPal = true; // [x] -> A boolean value that represents if the string is a palindrome.

        // TODO Checking if each opposite letter is equal, by splitting the string.
        for (int i = 0; i < str.length() / 2 && isPal; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPal = false;
            }
        }

        // TODO Print the result.
        if (isPal) {
            System.out.println("The string " + str + " is a palindrome.");
        } else {
            System.out.println("The string " + str + " is not a palindrome.");
        }
    }
}
