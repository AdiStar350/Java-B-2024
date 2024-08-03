public class IsArrBalanced {
    /**
     * Checks if the given array is balanced.
     * An array is considered balanced if the count of even elements is equal to the count of odd elements.
     *
     * @param arr The array to be checked.
     * @return True if the array is balanced, false otherwise.
     */
    public static boolean isBalanced(int[] arr) {
        // Declare the variables.
        int cntEven = 0; // -> The count of the even elements in the array.

        // Loop over the array.
        for (int i = 0; i < arr.length; i++) {
            // Check if the element is 0.
            if (arr[i] == 0) {
                // If so, then return false.
                return false;
            } else if (arr[i] % 2 != 0) {
                // Else if the element is even then increment the count of the even elements.
                cntEven++;
            }
        }

        // Return if the count of even elements is equal to the count of odd elements.
        return cntEven == arr.length - cntEven;
    }
    public static void main(String[] args) {
        // Declare the variables.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // -> An integer array.

        // Print the array in an order depending on the result of isBalanced().
        if (isBalanced(arr)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
