// Import the Scanner.
import java.util.Scanner;

public class HighPosNum {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    // Create a new function that will return the highest number possible to create with the digits of num.
    public static int getHighPos(int num) {
        // Declare the variables.
        int newNum = 0; // -> The new number.
        int[] digs = new int[10]; // -> An array where the indexes represent the digits and the values represent the count.
        int cnt = 0; // -> The total count of the digits.

        // Getting every digit from num and updating the digs array and the total count.
        while (num > 0) {
            digs[num % 10]++;
            num /= 10;
            cnt++;
        }

        // Build the new number starting from the highest digits.
        for (int i = digs.length - 1; i >= 0; i--) {
            for (int j = 0; j < digs[i]; j++) {
                newNum += i * (int) Math.pow(10, cnt - 1);
                cnt--;
            }
        }

        // Return the new number.
        return newNum;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int num; // -> An integer.

        // Getting input from the user -> An integer.
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        // Printing the num and it's highest possibility.
        System.out.println("\nThe highest " + num + " possibility is: " + getHighPos(num));
    }
}
