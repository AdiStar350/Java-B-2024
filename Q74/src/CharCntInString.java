// Import the Scanner class.
import java.util.Scanner;

public class CharCntInString {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Declare the variables.
        String charString = ""; // -> An empty string.
        char lookFor; // -> A character as the user input.
        int charCnt = 0; // -> Character counter.

        // Loop 20 times and get random uppercase characters for the string.
        for (int i = 0; i < 20; i++) {
            charString += (char)(Math.random() * 26 + 'A');
        }

        // Print the string.
        System.out.println(charString);

        // Get the input from the user.
        System.out.print("Please enter a character to look for: ");
        lookFor = input.next().charAt(0);

        // Loop through the string and count the number of times the input appears.
        for (int i = 0; i < charString.length(); i++) {
            if (charString.charAt(i) == lookFor) {
                charCnt++;
            }
        }

        // Print the conclusion.
        System.out.println("The character: " + lookFor + (charCnt == 0 ? " does not appear." : " appears " + charCnt + " times."));
    }
}
