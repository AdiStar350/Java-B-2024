// Import the Scanner class.
import java.util.Scanner;

public class GetNumInput {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    /**
     * Calculates the sum of digits of a given number.
     *
     * @param num The number for which to calculate the sum of digits.
     * @return The sum of digits of the given number.
    */
    public static int getSumOfDig(int num) {
        // Declare the variables.
        int sum = 0; // -> The sum of digits of the number.

        // Loop through the number and calculate the sum of digits.
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        // Return the sum of digits.
        return sum;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int num; // -> A number.
        float avg = 0; // -> The average of the numbers entered.
        int cnt = 0; // -> The count of numbers entered.

        // Make an active loop.
        while (true) {
            // Get the number from the user.
            System.out.print("Enter a number: ");
            num = input.nextInt();

            // If the number is 500, break the loop.
            if (num == 500) {
                break;
            } else if (num % 2 != 0) {
                // Else if the number is odd, print the sum of digits of the number.
                System.out.println("The sum of the digits of the number is: " + getSumOfDig(num));
            }

            // Add the number to the average and increment the count.
            avg += num;
            cnt++;
        }

        // Calculate the average.
        avg /= cnt;

        // Print the average of the numbers entered.
        System.out.println(String.format("The average of the numbers entered is: %.2f", avg));
    }
}
