// Import the Scanner class.
import java.util.Scanner;

public class IsPerfect {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Declare the variables.
        int num; // -> A number.
        int sum = 0; // -> The sum of all of num's divisors.

        // Get input from the user.
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        // Find all of num's divisors and add them to the sum.
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Print if num is perfect.
        System.out.println(num + (sum == num ? " is " : " is not ") + "a perfect number.");
    }
}
