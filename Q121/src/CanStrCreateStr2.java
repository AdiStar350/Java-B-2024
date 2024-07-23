public class CanStrCreateStr2 {
    // Create a new function that returns a counter array of a string.
    public static int[] getCount(String str) {
        // Declare the variables.
        int[] cnt = new int[26]; // -> A counter array for all ASCII characters.

        // Loop through the string.
        for (int i = 0; i < str.length(); i++) {
            // Update the counter array with the string values index.
            cnt[(int) (str.charAt(i) - 'A') ]++;
        }

        // Return the counter array.
        return cnt;
    }

    // Create a new function that returns if there are mismatches between two strings.
    public static boolean hasMismatch(String str1, String str2) {
        // Declare the variables.
        int[] cnt1 = getCount(str1); // -> A counter array for the first string.
        int[] cnt2 = getCount(str2); // -> A counter array for the second string.

        // Loop through the counter arrays.
        for (int i = 0; i < cnt1.length; i++) {
            // Check if there are mismatches between them and return a boolean representing it.
            if ((cnt1[i] == 0 && cnt2[i] != 0) || (cnt1[i] != 0 && cnt2[i] == 0)) {
                return false;
            }
        }

        return true;
    }

    // Create a new function that returns if in the array letters from one string can create another.
    public static boolean canCreateStr(String[] strs) {
        // Loop through the string array twice.
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                // Don't check a string with itself.
                if (i == j) {
                    continue;
                } else if (hasMismatch(strs[i], strs[j])) { 
                    // Return true if a string that can create another was found, else false.
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Declare the variables.
        String[] strs = {"XYZ", "C", "BC", "AABBAACC"}; // -> A string array.

        // Print the array.
        for (int i = 0; i < strs.length; i++) {
            System.out.print(String.format("%s ", strs[i]));
        }

        // Print the conclusion from the canCreateStr() function.
        System.out.println(String.format("\nIn the array, %s strings can be created by letters from other strings.", (canCreateStr(strs) ? "some" : "no")));
    }
}
