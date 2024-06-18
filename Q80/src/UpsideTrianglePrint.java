// Import the Scanner class.
import java.util.Scanner;

public class UpsideTrianglePrint {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Declare the variables.
        int limit; // -> The limit for the triangle size.

        // Get input from the user.
        System.out.print("Please enter a number: ");
        limit = input.nextInt();

        // Print the triangle.
        System.out.println();

        for (int i = limit; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
