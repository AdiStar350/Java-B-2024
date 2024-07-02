// Import the Scanner.
import java.util.Scanner;

public class Closest5Div {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    // Create a new function that return the closest value to a number that divides by 5.
    public static int close5(int num) {
        // Declare the variables.
        int numUp = num; // -> The copy of the number for the upwards check.
        int numDown = num; // -> The copy of the number for the downwards check.

        // Check upwards and downwards and return the first (closest) one.
        while (true) {
            if (numUp % 5 == 0) {
                return numUp;
            }

            if (numDown % 5 == 0) {
                return numDown;
            }

            numUp++;
            numDown--;
        }
    }

    public static void main(String[] args) {
        // Declare the variables.
        int num; // -> A whole number.

        // Getting input from the user -> An integer.
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        // Printing the closest number that divided by 5.
        System.out.println("\nThe closest number to " + num + " that's divided by 5 is: " + close5(num));
    }
}
