// Import the Scanner.
import java.util.Scanner;

public class GetAverage {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    // Create a function that returns the average of a number's digits.
    public static float getAverage(int num) {
        // Declare the variables.
        float sum = 0; // -> The sum of the digits.
        int cnt = 0; // -> The amount of digits.
        
        while (num > 0) {
            // Add every digit to the sum.
            sum += num % 10;
            num /= 10;

            // Add every digit to the counter.
            cnt++;
        }

        // Return the average.
        return sum / cnt; 
    }

    public static void main(String[] args) {
        // Declare the variables.
        int num; // -> The number as input from the user.

        // Get input from the user -> The number.
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        // Get and print the average of the number.
        System.out.println("\nThe average of " + num + " is " + getAverage(num));
    }
}
