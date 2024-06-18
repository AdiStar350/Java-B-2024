public class GetBigCharFunc {

    // Create a function that generates a random string with 10 to 20 random uppercase characters.
    public static String genRndStr() {
        // Declare the variables.
        String str = ""; // -> An empty string.

        // Get random characters for the string.
        for (int i = 0; i < (int)(Math.random() * 11 + 10) ; i++) {
            str += (char)(Math.random() * 26 + 'A');
        }

        // Return the string.
        return str;
    }

    // Create a function that gets the biggest character from the string.
    public static char getBigChar(String str) {
        // Declare the variables.
        char bigChar = 'A'; // -> The biggest character initialized with A.

        // Loop through the string and search for the biggest character.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > bigChar) {
                bigChar = str.charAt(i);
            }
        }

        // Return the big character.
        return bigChar;
    }

    public static void main(String[] args) {
        // Declare the variables.
        String str = genRndStr(); // -> A random string generated from the genRndStr() function.

        // Print the string and its biggest character.
        System.out.println("\nThe biggest character in the string " + str + " is " + getBigChar(str));
    }
}
