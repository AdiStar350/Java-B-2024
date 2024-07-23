// Import the Scanner.
import java.util.Scanner;

public class HighCnt2 {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    // Create a new function that will return the digits with most appearances in a number.
    public static int getDigHighCnt(long num) {
        // Declaring the variables.
        int[] digs = new int[10]; // -> An array where the indexes represent the digits and the values the appearance count.
        int maxCntDig = 0; // -> The digit with the highest appearance count.

        while (num > 0) {
            // Take each digit from the number and update the count in the digs array.
            digs[(int) (num % 10)]++;
            num /= 10;
        }
        
        // Check for the highest value in the array.
        for (int i = 0; i < digs.length; i++) {
            if (digs[i] > digs[maxCntDig]) {
                maxCntDig = i;
            }
        }

        // Return the digit with max appearances.
        return maxCntDig;
    }

    public static void main(String[] args) {
        // Declare the variables.
        long num; // -> A whole number.

        // Get input from the user -> An integer.
        System.out.print("Please enter a number: ");
        num = input.nextLong();

        // Print the digit with the highest appearance count.
        System.out.println("\nThe digit with max appearances: " + getDigHighCnt(num));
    }
}
