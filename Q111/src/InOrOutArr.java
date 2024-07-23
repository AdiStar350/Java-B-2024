public class InOrOutArr {
    // Create a new function that takes a 2D array and returns a string depending on which area of the array has a higher sum.
    public static String getMaxArea(int[][] arr) {
        // Declare the variables.
        int sumOut = 0; // -> The sum of the outer area of the 2D array.
        int sumIn = 0; // -> The sum of the inner area of the 2D array.

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Check for values in the outer area of the 2D array.
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
                    sumOut += arr[i][j];
                } else { // Check for values in the inner area of the 2D array.
                    sumIn += arr[i][j];
                }
            }
        }

        // Return a string based on the sum of each area.
        return sumOut > sumIn ? "outer" : "inner";
    }
    public static void main(String[] args) {
        // Declare the variables.
        int[][] arr = {
            {9, 63, 38, 46},
            {26, 2, 11, 85}, // -> A 2D array with integers.
            {89, 5, 21, 12},
            {52, 99, 10, 7}
        };

        // Printing the 2D array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(String.format("%3d", arr[i][j]));
            }

            System.out.println();
        }

        // Print the area of the array with the biggest sum.
        System.out.println("The area of the array with the biggest sum is the " + getMaxArea(arr) + " area." );
    }
}
