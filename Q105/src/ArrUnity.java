public class ArrUnity {
    // Create a new function that takes two arrays and returns a concatenation of the two arrays.
    public static int[] concatArrays(int[] array1, int[] array2) {
        // Declare the variables.
        int[] newArray = new int[array1.length + array2.length]; // -> The new array.

        // Add the values from the first array to the new array.
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }

        // Add the values from the second array to the new array.
        for (int i = 0; i < array2.length; i++) {
            newArray[i + array1.length] = array2[i];
        }

        // Return the new array.
        return newArray;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int[] array1 = {1, 2, 3, 4}; // -> An integer array.
        int[] array2 = {5, 6, 7, 8, 9, 10, 11, 12}; // -> An integer array.
        int[] conArr = concatArrays(array1, array2); // -> An integer array made from the two arrays.

        // Print the first array.
        System.out.print("Array 1: ");

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        // Print the second array.
        System.out.print("\nArray 2: ");

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        // Print the concatenation of the two arrays.
        System.out.print("\nConcat Array: ");

        for (int i = 0; i < conArr.length; i++) {
            System.out.print(conArr[i] + " ");
        }
    }
}
