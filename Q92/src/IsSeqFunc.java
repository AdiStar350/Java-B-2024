public class IsSeqFunc {

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

    // Create a function that returns if the characters in the string are in a growing sequence.
    public static boolean isSeq(String str) {
        // Declare the variables.
        char temp = str.charAt(0); // -> The previous character in the string.

        // Loop through the string and check if the characters are in a growing sequence and returning the answer.
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) <= temp) {
                return false;
            }

            temp = str.charAt(i);
        }

        return true;
    }

    public static void main(String[] args) {
        // Declare the variables.
        String str = genRndStr(); // -> A random string from the genRndStr() function.

        // Print the string and if the characters are in a growing sequence. 
        System.out.println("The string: " + str + " is " + (isSeq(str) ? "" : "not ") + "in a growing sequence.");
     }
}
