public class MaxAvg2DArr {
    public static int getMaxAvg(int[][] arr) {
        // Declare the variables.
        float avg; // -> The value of each rows average.
        float maxAvg = 0; // -> The max value of row average.
        int index = 0; // -> The student with the highest average.

        // Looping through the rows of the array.
        for (int i = 0; i < arr.length; i++) {
            // Initialize the sum of eac row.
            avg = 0;

            // Adding each value to the rows sum.
            for (int j = 0; j < arr[i].length; j++) {
                avg += arr[i][j];
            }

            // Calculating the average.
            avg /= arr[i].length;

            // Checking for the highest sum.
            if (avg > maxAvg) {
                maxAvg = avg;
                index = i + 1;
            }
        }

        // Return the index of the max row.
        return index;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int[][] arr = {
            {50, 20, 30, 60},
            {20, 40, 10, 80}, // -> A 2D array with integers.
            {80, 50, 20, 10},
            {30, 90, 10, 70}
        };

        // Printing the 2D array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Student No." + (i + 1) + " -> ");

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(String.format("%3d", arr[i][j]));
            }

            System.out.println();
        }

        // Print the index of the row with the highest sum.
        System.out.println("\nThe student with the highest average is: Student No." + getMaxAvg(arr));
    }
}
