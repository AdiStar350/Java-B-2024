public class GreatestVal {
    public static void main(String[] args) {
        // Declaring the variables.
        int[] array = new int[5]; // -> An array of 5 values.
        int greatest; // -> The greatest value.

        // Get random values for the array between 1 and 6.
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 6 + 1);
            System.out.print(array[i] + " ");
        }

        // Initializing the greatest value.
        greatest = array[0];

        // Loop through the array and find the greatest value.
        for (int i = 1; i < array.length; i++) {
            if (array[i] > greatest) {
                greatest = array[i];
            }
        }

        // Print the greatest value.
        System.out.println("\nThe greatest value is " + greatest);
    }
}
