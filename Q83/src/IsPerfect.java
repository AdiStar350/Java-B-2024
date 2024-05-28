// TODO Import the Scanner class.
import java.util.Scanner;

public class IsPerfect {
    // TODO Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Declare the variables.
        int num; // [x] -> A number.
        int sum = 0; // [x] -> The sum of all of num's divisors.

        // TODO Get input from the user.
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        // TODO Find all of num's divisors and add them to the sum.
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // TODO Print if num is perfect.
        System.out.println(num + (sum == num ? " is " : " is not ") + "a perfect number.");
    }
}
