public class Friends {
    /**
     * Generates a set of friends.
     *
     * @param arr the array to store the set of friends
     * @return the array representing a valid set of friends
    **/
    public static int[] friendGenerator(int[] arr) {
        // Declare the variables.
        int rnd; // -> A random number.

        // Loop through the array.
        do {
            for (int i = 0; i < arr.length; i += 2) {
                // Get the random number for the element.
                rnd = (int) (Math.random() * 90 + 10);

                // Assign the random number to every 2 elements.
                arr[i] = rnd;
                arr[i + 1] = rnd;
            }
        } while (!isSetOfFriends(arr));

        // Return the array.
        return arr;
    }

    /**
     * Checks if the given array represents a valid set of friends.
     *
     * @param arr the array to be checked
     * @return true if the array represents a valid set of friends, false otherwise
    **/
    public static boolean isSetOfFriends(int[] arr) {
        // Declare the variables.
        int cnt; // -> A counter array of the number of times each number appears in the array.

        // If the length of the array is odd or 0, return false.
        if (arr.length % 2 != 0 || arr.length == 0) { return false; }

        // Loop through the array.
        for (int i = 0; i < arr.length; i++) {
            // Initialize the counter.
            cnt = 0;

            // For each element in the array, count the number of times it appears.
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }

            // If the count is not 2, return false.
            if (cnt != 2) { return false; }
        }

        // Return true if the count of all the elements is 2.
        return true;
    }
    public static void main(String[] args) {
        // Declare the variables.
        int[] arr = new int[20]; // -> An array of numbers.

        // Generate the array.
        arr = friendGenerator(arr);

        // Print out the array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Check if the array represents a valid set of friends and print the result.
        System.out.println(String.format("\nThe array %s a set of friends.", (isSetOfFriends(arr) ? "is" : "is not")));
    }
}
