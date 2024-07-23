public class MaxRow2DArr {
    // Create a new function that takes a 2D array and returns the row number with the max value.
    public static int getMaxRow(int[][] arr) {
        // Declare the variables.
        int sum; // -> The value of each row.
        int maxSum = 0; // -> The max value of row sum.
        int index = 0; // -> The index of the max row.

        // Looping through the rows of the array.
        for (int i = 0; i < arr.length; i++) {
            // Initialize the sum of eac row.
            sum = 0;

            // Adding each value to the rows sum.
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            // Checking for the highest sum.
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }

        // Return the index of the max row.
        return index;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int[][] arr = {
            {5, 2, 3, 6},
            {2, 4, 1, 8}, // -> A 2D array with integers.
            {8, 5, 2, 1},
            {3, 0, 1, 7}
        };

        // Printing the 2D array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(String.format("%2d", arr[i][j]));
            }
            System.out.println();
        }

        // Print the index of the row with the highest sum.
        System.out.println("\nThe index of the row with the highest sum is: " + getMaxRow(arr));
    }
}
