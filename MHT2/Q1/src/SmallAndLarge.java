// Import the Scanner class.
import java.util.Scanner;

public class SmallAndLarge {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Declare the variables.
        int num; // -> An integer, the number of digits in the number.
        int small = Integer.MAX_VALUE; // -> The smallest number.
        int large = Integer.MIN_VALUE; // -> The largest number.

        do {
            // Ask the user to enter a number.
            System.out.print("Enter a number: ");
            num = input.nextInt();

            // Find the largest and smallest numbers.
            if (num > large) { large = num; }
            if (num < small) { small = num; }
        } while (num > 999 || num < 100);

        // Print the smallest and largest numbers.
        System.out.println(String.format("\nThe smallest number is %d and the largest number is %d.", small, large));
    }
}
