// Import the Scanner.
import java.util.Scanner;

public class IsPrimeFunc {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    // Create a function that returns if  number is prime or not.
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int num; // -> A number as input from the user.

        // Getting the input from the user -> A number.
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        // Printing the number and if it is prime or not.
        System.out.println("\nThe number: " + num + " is " + (isPrime(num) ? "" : "not ") + "a prime number.");
    }
}