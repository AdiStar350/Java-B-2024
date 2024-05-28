public class LongStr {
    public static void main(String[] args) {
        // TODO Declare the variables.
        String str; // [x] -> A string.
        String maxStr = ""; // [x] -> The longest string.

        // TODO Get 5 random strings.
        for (int i = 0; i < 5; i++) {
            // TODO Initialize each string.
            str = "";

            // TODO Get between 10 and 30 random letters for each string.
            for (int j = 0; j < (int)(Math.random() * 21 + 10); j++) {
                str += (char)(Math.random() * 26 + 'A');
            }

            // TODO Print each string.
            System.out.println("String " + (i + 1) + ": " + str);

            // TODO Get the longest string.
            if (str.length() > maxStr.length()) {
                maxStr = str;
            }
        }

        // TODO Print the longest string.
        System.out.println("The longest string is " + maxStr);
    }
}
