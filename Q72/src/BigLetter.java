public class BigLetter {
    public static void main(String[] args) {
        // Declare the variables.
        String someString = ""; // -> An empty string.
        char rndChar; // -> A random character.
        char bigChar = 'A'; // -> The biggest Character in the string (initialized with 'A').

        // Loop 13 times and add letters between A and Z to the string.
        for (int i = 0; i < 13; i++) {
            rndChar = (char)(Math.random() * 26 + 'A');

            // Find the biggest letter in the string.
            if (rndChar > bigChar) {
                bigChar = rndChar;
            }
            
            someString += rndChar;
        }

        // Print the string.
        System.out.println("The string is: " + someString);

        // Print the biggest letter.
        System.out.println("The biggest letter is: " + bigChar);
    }
}
