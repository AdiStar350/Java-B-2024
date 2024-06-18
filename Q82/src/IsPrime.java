// Import the Scanner class.
import java.util.Scanner;

public class IsPrime {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Declare the variables.
        int num; // -> A number.
        int cnt = 7; // -> A prime number counter.

        // Get 7 numbers from the user.
        for (int i = 0; i < 7; i++) {
            System.out.print("Please enter a number: ");
            num = input.nextInt();

            // Check if the number is a prime number.
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    cnt--;
                    break;
                }
            }
        }

        // Print the amount of prime numbers.
        System.out.println("There are " + cnt + " prime numbers.");
    }
}