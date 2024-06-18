public class StringToInt {
    public static void main(String[] args) {
        // Declare the variables.
        String numString = ""; // -> An empty string.
        int num = 0; // -> The integer version of the string.

        // Loop 5 times to get random digits for the string.
        for (int i = 0; i < 5; i++) {
            numString += (char)(Math.random() * 9 + '1');
        }

        // Loop through the string and convert it to an integer inside the num variable.
        for (int i = 0; i < numString.length(); i++) {
            num += (numString.charAt(i) - '0') * (int)(Math.pow(10, numString.length() - i - 1));
        }
    }
}
