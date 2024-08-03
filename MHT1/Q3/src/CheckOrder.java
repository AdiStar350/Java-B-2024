public class CheckOrder {
    /**
     * Builds an ordered array with even numbers on the left and odd numbers on the right.
     * 
     * @param size the size of the array
     * @param x the lower bound for the random number generation
     * @param y the upper bound for the random number generation
     * @return the ordered array
     */
    public static int[] buildOrderedArray(int size, int x, int y) {
        // Declaring and initializing the array.
        int[] arr = new int[size]; // -> An array of size 'size'.
        int num; // -> A random number between x and y.
        int oddIndex = size - 1; // -> The index where the odd numbers will be placed.
        int evenIndex = 0; // -> The index where the even numbers will be placed.

        // Looping through the array to fill it with the values.
        while (evenIndex <= oddIndex) {
            // Generating a random number between x and y.
            num = (int) (Math.random() * (y - x + 1) + x);
            
            // If the number is even, then place it at the current index.
            if (num % 2 == 0) {
                arr[evenIndex++] = num;
            // If the number is odd, then place it at the oddIndex.
            } else {
                arr[oddIndex--] = num;
            }
        }

        // Return the array.
        return arr;
    }


    /**
    * Checks if the given array has its even numbers on the left and odd numbers on the right.
    * 
    * @param arr the array to be checked
    * @return true if the array is ordered, false otherwise
    */
    public static boolean isOrdered(int[] arr) {
        // Declare the variables.
        boolean foundOdd = false; // -> Represents if an odd number is found.

        // Looping through the array to check the order.
        for (int i = 0; i < arr.length; i++) {
            // If the element is even, check if an odd number is found.
            if (arr[i] % 2 == 0) {
                // If an odd number is found, return false.
                if (foundOdd) {
                    return false;
                }
            } else {
                // If the element is odd, set the foundOdd to true.
                foundOdd = true;
            }
        }

        // If the array is ordered, return true.
        return true;
    }

    public static void main(String[] args) {
        // Declaring and initializing the array.
        int[] arr = buildOrderedArray(5, 2, 9);

        // Printing the array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Printing the result of the checkOrder function.
        System.out.println(String.format("\nThe array %s ordered.", (isOrdered(arr) ? "is" : "is not")));
    }
}
