public class MaxVerityStr {
    // Create a new function that returns the array with random strings with uppercase letters.
    public static String[] getVal(String[] arr) {
        // Loop through the array.
        for (int i = 0; i < arr.length; i++) {
            // Initialize every string.
            arr[i] = "";

            // Get random string length between 6 and 10 characters.
            for (int j = 0; j < (int) (Math.random() * 5 + 6); j++) {
                // Get random uppercase letters for the string.
                arr[i] += (char)(Math.random() * 26 + 'A');
            }
        }

        // Return the updated array.
        return arr;
    }

    // Create a new function that displays the output to the screen.
    public static void displayOutput(String[] arr) {
        // Update the array with uppercase letters.
        arr = getVal(arr);

        // Print the array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        // Print the string with the most verity from the array.
        System.out.println(String.format("\nThe string with the most verity it the array is: %s", getMaxVarietyStr(arr)));
    }

    // Create a new function that returns the count of the different characters from a string.
    public static int getVerityCount(String str) {
        // Declare the variables.
        int[] cnt = new int[26]; // -> A counter array of uppercase letters.
        int verity = 0; // The count of the different verity of characters.

        // Loop through string.
        for (int i = 0; i < str.length(); i++) {
            // Update the counter array with the character values.
            cnt[(int)(str.charAt(i) - 'A')]++;
        }

        // Loop through the counter array and get the count of the different characters.
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 0) {
                verity++;
            }
        }

        // Return the verity count.
        return verity;
    }

    // Create a function that returns the string with the most verity of characters from an array.
    public static String getMaxVarietyStr(String[] arr) {
        // Declare the variables.
        int maxVerity = 0; // -> The max verity count of a string from the array.
        String maxVerityStr = arr[0]; // -> The string with the most verity.

        // Loop through the array.
        for (int i = 0; i < arr.length; i++) {
            // Get the max verity count and its string.
            if (maxVerity < getVerityCount(arr[i])) {
                maxVerity = getVerityCount(arr[i]);
                maxVerityStr = arr[i];
            }
        }

        // Return the string with max verity.
        return maxVerityStr;
    }

    public static void main(String[] args) {
        // Declare the variables.
        String[] arr = new String[4]; // -> A string array.

        // Display the output.
        displayOutput(arr);
    }
}
