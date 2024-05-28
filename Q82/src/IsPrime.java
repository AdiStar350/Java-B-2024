// TODO Import the Scanner class.
import java.util.Scanner;

public class IsPrime {
    // TODO Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Declare the variables.
        int num; // [x] -> A number.
        int cnt = 7; // [x] -> A prime number counter.

        // TODO Get 7 numbers from the user.
        for (int i = 0; i < 7; i++) {
            System.out.print("Please enter a number: ");
            num = input.nextInt();

            // TODO Check if the number is a prime number.
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    cnt--;
                    break;
                }
            }
        }

        // TODO Print the amount of prime numbers.
        System.out.println("There are " + cnt + " prime numbers.");
    }
}