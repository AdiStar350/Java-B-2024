public class GreatestVal2 {
    public static void main(String[] args) {
        // Declaring the variables.
        int[] array = new int[13]; // -> An array of 13 values.
        int greatest1; // -> The greatest value.
        int greatest1Index = 0; // -> The index of the greatest value.
        int greatest2; // -> The second greatest value.

        // Get random values for the array between 1 and 6.
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 6 + 1);
            System.out.print(array[i] + " ");
        }

        // Initializing the greatest value.
        greatest1 = array[0];

        // Initializing the second greatest value.
        greatest2 = array[0];

        // Loop through the array and find the greatest value.
        for (int i = 1; i < array.length; i++) {
            if (array[i] > greatest1) {
                greatest1 = array[i];
                greatest1Index = i;
            }
        }

        // Remove the greatest value from the array.
        array[greatest1Index] = 0;

        // Loop through the array and find the second greatest value.
        for (int i = 1; i < array.length; i++) {
            if (array[i] > greatest2) {
                greatest2 = array[i];
            }
        }

        // Print the result.
        System.out.println("\nThe greatest value of a pair of dice is " + (greatest1 + greatest2));
    }
}
