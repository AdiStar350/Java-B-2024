public class LastRowSum {
    // Create a new function that returns if in a 2D array every element in the last row is equal to the sum of the rest of its column.
    public static boolean isLastEqualSum(int[][] arr) {
        // Declare the variables.
        int sum; // -> The sum of each column, besides the last element.

        // Loop through the columns of the array.
        for (int i = 0; i < arr.length; i++) {
            // Initialize the sum of the column.
            sum = 0;

            // Loop through the rows of the array.
            for (int j = 0; j < arr[i].length; j++) {
                // Check if the element is in the last column.
                if (j == arr.length - 1) {
                    // Check if the element is equal to the sum of the column.
                    if (arr[j][i] != sum) {
                        return false;
                    }
                } else {
                    // Adding every element to the sum of the column except the last element.
                    sum += arr[j][i];
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int[][] arr = {
            {1, 12, 54, 46},
            {1, 14, 11, 35}, // -> A 2D array with integers.
            {1, 18, 28, 12},
            {3, 44, 91, 93}
        };

        // Printing the 2D array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(String.format("%3d", arr[i][j]));
            }

            System.out.println();
        }

        // Printing if every element in the last row is equal to the sum of the rest of its column.
        System.out.println("\nEvery element in the last row is " + (isLastEqualSum(arr) ? "" : "not ") + "equal to the sum of the rest of the column.");
    }
}
