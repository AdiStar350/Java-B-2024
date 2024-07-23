public class Max2DArr {
    // Create a new function that takes a 2D array and returns the highest value in the array.
    public static int getMaxVal(int[][] arr) {
        // Declare the variables.
        int maxVal = arr[0][0]; // -> The maximum value in the array.

        // Loop through the rows of the array.
        for (int i = 0; i < arr.length; i++) {
            // Loop through the columns of the array (each value in the inner arrays).
            for (int j = 0; j < arr[i].length; j++) {
                // Update the max value if necessary.
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                }
            }
        }

        // Return the maximum value.
        return maxVal;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int[][] arr = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {2, 4, 6, 8, 10, 12, 14, 16, 18}, // -> A 2D array with integers.
            {8, 56, 209, 3, 5, 9, 10, 15, 20},
            {123, 22, 1, 0, 93, 2, 2, 4, 100}
        };

        // Printing the 2D array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(String.format("%4d", arr[i][j]));
            }
            System.out.println();
        }
        
        // Printing and getting the max value in the array.
        System.out.println("\nThe max value in the array is: " + getMaxVal(arr));
    }
}
