public class GreatestVal {
    public static void main(String[] args) {
        // TODO Declaring the variables.
        int[] array = new int[5]; // [x] -> An array of 5 values.
        int greatest; // [x] -> The greatest value.

        // TODO Get random values for the array between 1 and 6.
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 6 + 1);
            System.out.print(array[i] + " ");
        }

        // TODO Initializing the greatest value.
        greatest = array[0];

        // TODO Loop through the array and find the greatest value.
        for (int i = 1; i < array.length; i++) {
            if (array[i] > greatest) {
                greatest = array[i];
            }
        }

        // TODO Print the greatest value.
        System.out.println("\nThe greatest value is " + greatest);
    }
}
