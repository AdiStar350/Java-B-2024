// Import the Scanner.
import java.util.Scanner;

public class FindMinMax {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    // Create a function that returns the difference between the smallest and the largest numbers in the string.
    public static int minMaxDiff(String str) {
        // Declaring the variables.
        char small = str.charAt(0); // -> The smallest number in the string.
        char big = str.charAt(0); // -> The largest number in the string.

        // Finding the smallest and the biggest digits in the string.
        for (int i = 0; i < str.length(); i++) {
            if (small > str.charAt(i)) {
                small = str.charAt(i);
            }

            if (big < str.charAt(i)) {
                big = str.charAt(i);
            }
        }

        // Returning the difference.
        return big - small;
    }

    public static void main(String[] args) {
        // Declaring the variables.
        String str; // -> A string as input from the user.

        // Getting the input from the user -> A string.
        System.out.print("Please enter digits: ");
        str = input.nextLine();

        // Printing the original input and the result of the difference between the biggest and smallest digits.
        System.out.println("\nThe difference between the biggest and smallest digits in: " + str + " is " + minMaxDiff(str));
    }
}