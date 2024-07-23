public class EveryAlpha {
    // Create a new function that will return if the array contains all of the characters between A - Z.
    public static boolean isAllChar(char[][] arr) {
        // Declare the variables.
        int[] alpha = new int[26]; // -> An counter array of the characters between A - Z.

        // Looping through the rows.
        for (int i = 0; i < arr.length; i++) {
            // Looping through the columns.
            for (int j = 0; j < arr[i].length; j++) {
                // Counting every character.
                alpha[(int) (arr[i][j] - 'A')]++;
            }
        }

        // Checking if there are any characters with count 0 and returning the solution.
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Declare the variables.
        char[][] arr = new char[7][7]; // -> A 2D char array.

        // Initialize and print the char array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (char) (Math.random() * 26 + 'A');
                System.out.print(String.format("%2c", arr[i][j]));
            }

            System.out.println();
        }

        // char[][] arr = {
        //     {'A', 'B', 'C', 'D', 'E', 'F', 'G'},
        //     {'H', 'I', 'J', 'K', 'L', 'M', 'N'},
        //     {'O', 'P', 'Q', 'R', 'S', 'T', 'U'},
        //     {'V', 'W', 'X', 'Y', 'Z', 'T', 'M'},
        //     {'A', 'B', 'C', 'D', 'E', 'F', 'G'},
        //     {'H', 'I', 'J', 'K', 'L', 'M', 'N'},
        //     {'O', 'P', 'Q', 'R', 'S', 'T', 'U'}
        // };

        // Printing if the array has every character between A and Z.
        System.out.println(String.format("\nThe array %s every character between A - Z.", (isAllChar(arr) ? "has" : "doesn't have")));
    }
}
