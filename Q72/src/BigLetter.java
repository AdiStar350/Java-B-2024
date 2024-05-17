public class BigLetter {
    public static void main(String[] args) {
        // TODO Declare the variables.
        String someString = ""; // [x] -> An empty string.
        char rndChar; // [x] -> A random character.
        char bigChar = 'A'; // [x] -> The biggest Character in the string (initialized with 'A').

        // TODO Loop 13 times and add letters between A and Z to the string.
        for (int i = 0; i < 13; i++) {
            rndChar = (char)(Math.random() * 26 + 'A');

            // TODO Find the biggest letter in the string.
            if (rndChar > bigChar) {
                bigChar = rndChar;
            }
            
            someString += rndChar;
        }

        // TODO Print the string.
        System.out.println("The string is: " + someString);

        // TODO Print the biggest letter.
        System.out.println("The biggest letter is: " + bigChar);
    }
}
