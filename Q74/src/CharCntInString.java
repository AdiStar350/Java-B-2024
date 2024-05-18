// TODO Import the Scanner class.
import java.util.Scanner;

public class CharCntInString {
    // TODO Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Declare the variables.
        String charString = ""; // [x] -> An empty string.
        char lookFor; // [x] -> A character as the user input.
        int charCnt = 0; // [x] -> Character counter.

        // TODO Loop 20 times and get random uppercase characters for the string.
        for (int i = 0; i < 20; i++) {
            charString += (char)(Math.random() * 26 + 'A');
        }

        // TODO Print the string.
        System.out.println(charString);

        // TODO Get the input from the user.
        System.out.print("Please enter a character to look for: ");
        lookFor = input.next().charAt(0);

        // TODO Loop through the string and count the number of times the input appears.
        for (int i = 0; i < charString.length(); i++) {
            if (charString.charAt(i) == lookFor) {
                charCnt++;
            }
        }

        // TODO Print the conclusion.
        System.out.println("The character: " + lookFor + (charCnt == 0 ? " does not appear." : " appears " + charCnt + " times."));
    }
}
