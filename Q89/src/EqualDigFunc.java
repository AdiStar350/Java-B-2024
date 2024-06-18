// Import the Scanner.
import java.util.Scanner;

public class EqualDigFunc {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    // Create a function that returns if all of the number's digits are equal.
    public static boolean equal(int num) {
        // Declare the variables.
        int dig1, dig2; // -> Tow digits from the number.

        do {
            // Initialize the first digit.
            dig1 = num % 10;
            num /= 10;

            // Initialize the second digit.
            dig2 = num % 10;

            // Check for equality and return result.
            if (dig1 != dig2) {
                return false;
            }

        } while (num >= 10);

        return true;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int num; // -> The number as input from the user.

        // Get the input from the user -> A number.
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        // Check for number equality and print result.
        System.out.println("The digits of the number: " + num + " are " + (equal(num) ? "" : "not ") + "equal.");
    }
}
