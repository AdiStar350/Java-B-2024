// TODO Import the Scanner class.
import java.util.Scanner;

public class Multi {
    // TODO Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Declare the variables.
        int lim; // [x] -> The limit for the table.

        // TODO Get the input from the user.
        System.out.print("Please enter the number of rows and columns for the table: ");
        lim = input.nextInt();

        // TODO Print the multiplication table.
        for (int i = 1; i <= lim; i++) {
            for (int j = 1; j <= lim; j++) {
                System.out.format("%4d", (i * j));
            }

            System.out.println();
        }
    }
}
