// Import the Scanner class.
import java.util.Scanner;

public class DigCnt {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    // Create a new function that counts the digits of a number.
    public static int countDig(int num) {
        // Declare the variables.
        int dig; // -> The last digit of the number.
        int cnt = 0; // -> The number of digits.

        while (num > 0) {
            // Remove the last digit from the number.
            dig = num % 10;
            num -= dig;
            num /= 10;

            // Increment the digit count.
            cnt++;
        }

        // Return the number of digits.
        return cnt;
    }

 
    public static void main(String[] args) {
        // Declare the variables.
        int n; // -> A number.

        // Get input from the user -> A number.
        System.out.print("Please enter a number: ");
        n = input.nextInt();

        // Print the number of digits, and call the countDig() function on the number.
        System.out.println("The number of digits of " + n + " is " + countDig(n));
    }
}
