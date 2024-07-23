public class ArrX2D {
    // Create a new function that takes a 2D array and returns if the sum of the main diagonal values equals the sum of the secondary diagonal values.
    public static boolean isDiagonalsEqual(int[][] arr) {
        // Declare the variables.
        int mainDiagonalSum = 0; // -> The sum of the main diagonal values.
        int secondaryDiagonalSum = 0; // -> The sum of the secondary diagonal values.

        // Checking main diagonal and secondary diagonal.
        for (int i = 0; i < arr.length; i++) {
            mainDiagonalSum += arr[i][i];
            secondaryDiagonalSum += arr[i][arr.length - 1 - i];
        }

        // Return true if the main diagonal is equal to the secondary diagonal, else false.
        return secondaryDiagonalSum == mainDiagonalSum ? true : false;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int[][] arr = {
            {5, 2, 3, 4},
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

        // Print the result of the isDiagonalsEqual() function.
        System.out.println("\nThe main diagonal is " + (isDiagonalsEqual(arr) ? "" : "not ") + "equal to the secondary diagonal.");
    }
}
