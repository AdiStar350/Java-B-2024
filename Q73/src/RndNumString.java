public class RndNumString {
    public static void main(String[] args) {
        // TODO Declare the variables.
        String numString = ""; // [x] -> An empty string.

        // TODO Get random amount of digits for the string.
        for (int i = 0; i < (int)(Math.random() * 10 + 1); i++) {
            numString += Integer.toString((int)(Math.random() * 9 + 1));
        }

        // TODO Print the string.
        System.out.println(numString);
        
    }
}
