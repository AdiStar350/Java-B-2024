// Import the scanner object.
import java.util.Scanner;

public class IsPali2 {
    // Create a new scanner object.
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Declare the variables.
        String str; // -> The string that needs to be checked.
        String str1, str2; // -> Two halves of the string.
        String revStr2 = ""; // -> Str2 reversed.

        // Get input from user.
        System.out.println("Please enter a string: ");
        str = sc.nextLine();
        
        // Checking if each opposite letter is equal, by splitting the string.
        str1 = str.substring(str.length() % 2 == 0 ?  str.length() / 2 : (str.length() + 1) / 2);
        str2 = str.substring(0, str.length() / 2);
        
        for (int i = str2.length() - 1; i >= 0; i--) {
            revStr2 += str2.charAt(i);
        }

        // Print the result.
        if (str1.equals(revStr2)) {
            System.out.println("The string " + str + " is a palindrome.");
        } else {
            System.out.println("The string " + str + " is not a palindrome.");
        }
    }
}
