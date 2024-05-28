// TODO Import the Scanner class.
import java.util.Scanner;

public class DIgCnt {
    // TODO Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    // TODO Create a new function that counts the digits of a number.
    public static int countDig(int num) {
        // TODO Declare the variables.
        int dig; // [x] -> The last digit of the number.
        int cnt = 0; // [x] -> The number of digits.

        while (num > 0) {
            // TODO Remove the last digit from the number.
            dig = num % 10;
            num -= dig;
            num /= 10;

            // TODO Increment the digit count.
            cnt++;
        }

        // TODO Return the number of digits.
        return cnt;
    }

 
    public static void main(String[] args) {
        // TODO Declare the variables.
        int n; // [x] -> A number.

        // TODO Get input from the user -> A number.
        System.out.print("Please enter a number: ");
        n = input.nextInt();

        // TODO Print the number of digits, and call the countDig() function on the number.
        System.out.println("The number of digits of " + n + " is " + countDig(n));
    }
}
