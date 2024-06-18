public class RndNumString {
    public static void main(String[] args) {
        // Declare the variables.
        String numString = ""; // -> An empty string.

        // Get random amount of digits for the string.
        for (int i = 0; i < (int)(Math.random() * 10 + 1); i++) {
            numString += Integer.toString((int)(Math.random() * 9 + 1));
        }

        // Print the string.
        System.out.println(numString);
        
    }
}
