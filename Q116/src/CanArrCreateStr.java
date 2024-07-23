public class CanArrCreateStr {
    public static boolean isAbleToConstruct(String str, char[][] arr) {
        // Declare the variables.
        int[] cnt = new int[128]; // -> A counter array for every ASCII character.

        // Looping through the rows of the array.
        for (int i = 0; i < arr.length; i++) {
            // Loop through the columns of the array.
            for (int j = 0; j < arr[i].length; j++) {
                // Update the counter array with the 2D array values index.
                cnt[(int)(arr[i][j])]++;
            }
        }

        // Loop through the string.
        for (int i = 0; i < str.length(); i++) {
            // Update the counter array with the string values index.
            cnt[(int)(str.charAt(i))]--;
        }

        // Loop through the counter array and check if there are any characters that do not match the string and the 2D array.
        for (int i = 0; i < cnt.length; i++) {
            // Return false if there is a mismatch.
            if (cnt[i] < 0) {
                return false;
            }
        }

        // Return true if there are no mismatches.
        return true;
    }

    public static void main(String[] args) {
        // Declare the variables.
        char[][] arr = {
            {'A', 'd', 'i', 'M', 'a'},
            {' ', '!', ' ', 'm', 'y'},
            {'D', 'a', 'e', 't', 'n'}, // -> A 2D character array.
            {'K', 'i', 's', 'l', ' '} 
        };
        String str = "My name is Adi!"; // -> A string.
        
        // Printing the 2D array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(String.format("%2c", arr[i][j]));
            }

            System.out.println();
        }

        // Print the string and if the string can be created by the characters in the array.
        System.out.println(String.format("The string %s %s be created by the characters in the array.", str, (isAbleToConstruct(str, arr) ? "can" : "can't")));
    }
}
