// Import the Scanner.
import java.util.Scanner;

public class IsPerfectFunc {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    // Create a function that checks if the number is perfect.
    public static boolean isPerfect(int num) {
        // Declare the variables.
        int sum = 0; // -> The sum of the number's divisors.

        // Add all of number's divisors to the sum.
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Return if the number is perfect or not.
        return sum == num ? true : false;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int num; // -> The number.

        // Get the input from the user -> The number.
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        // Print the number and if the number is perfect or not.
        System.out.println("The number " + num + " is " + (isPerfect(num) ? "" : "not ") + "perfect.");
    }
}
