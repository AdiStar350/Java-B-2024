public class LongStr {
    public static void main(String[] args) {
        // Declare the variables.
        String str; // -> A string.
        String maxStr = ""; // -> The longest string.

        // Get 5 random strings.
        for (int i = 0; i < 5; i++) {
            // Initialize each string.
            str = "";

            // Get between 10 and 30 random letters for each string.
            for (int j = 0; j < (int)(Math.random() * 21 + 10); j++) {
                str += (char)(Math.random() * 26 + 'A');
            }

            // Print each string.
            System.out.println("String " + (i + 1) + ": " + str);

            // Get the longest string.
            if (str.length() > maxStr.length()) {
                maxStr = str;
            }
        }

        // Print the longest string.
        System.out.println("The longest string is " + maxStr);
    }
}
