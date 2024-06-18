// Import the Scanner class.
import java.util.Scanner;

public class Multi {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Declare the variables.
        int lim; // -> The limit for the table.

        // Get the input from the user.
        System.out.print("Please enter the number of rows and columns for the table: ");
        lim = input.nextInt();

        // Print the multiplication table.
        for (int i = 1; i <= lim; i++) {
            for (int j = 1; j <= lim; j++) {
                System.out.format("%4d", (i * j));
            }

            System.out.println();
        }
    }
}
