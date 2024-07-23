public class Arr2Str {
    public static String[] concatRow(char[][] arr) {
        // Declare the variables.
        String[] strs = new String[arr.length]; // -> An array that every element is the row of the 2D array concatenated to a string.

        // Looping through the rows of the array.
        for (int i = 0; i <arr.length; i++) {
            // Initializeing the string in each element of the string array.
            strs[i] = "";

            // Looping through the columns of the array.
            for (int j = 0; j < arr.length; j++) {
                // Adding every element to the string.
                strs[i] += arr[i][j];
            }
        }

        // Return the string array.
        return strs;
    }

    public static void main(String[] args) {
        // Declare the variables.
        char[][] arr = {
            {'A', 'B', 'C', 'D'},
            {'E', 'F', 'G', 'H'}, // -> A 2D array with integers.
            {'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', 'P'}
        };
        String[] strs = concatRow(arr); // -> An array that every element is the row of the 2D array concatenated to a string.

        // Printing the 2D array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(String.format("%2c", arr[i][j]));
            }

            System.out.println();
        }

        // Printing the string array.
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + " ");
        }
    }
}
