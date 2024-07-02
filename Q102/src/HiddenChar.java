public class HiddenChar {
    public static void displayMissing(String str) {
        // Declaring the variables.
        int[] c = new int[26]; // -> An array where the indexes represent the characters between A and Z, and the values represent the count.

        // Adding every character to the counter array.
        for (int i = 0; i < str.length(); i++) {
            c[(int) str.charAt(i) - 'A']++;
        }

        // Printing the characters that are missing.
        System.out.print("The following characters aren't in the string " + str + ": ");

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0) {
                System.out.print((char) (i + 'A') + " ");
            }
        }
    }

    public static void main(String[] args) {
        // DEclaring the variables.
        String str = "ABCDEFGHIJKLMNVWXYZ"; // -> A string.

        // Displaying missing characters.
        displayMissing(str);
    }
}
