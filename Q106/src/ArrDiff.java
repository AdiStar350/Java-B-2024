public class ArrDiff {
    // Create a new function that returns if a string is in an array.
    public static boolean findStrInArr(String[] arr, String str) {
        // Loop through the array and return true if it contains the string.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                return true;
            }
        }

        // Return false if the string is not in an array.
        return false;
    }

    // Create a new function that returns an array which contains the strings that are in one array but not the other.
    public static String[] getDiff(String[] a, String[] b) {
        // Declare the variables.
        String[] diff; // -> The array of strings that differ.
        int diffLength = 0; // -> The length of the array.
        int index = 0; // -> The index in the array where a new string will be inserted.

        // Loop through the first array and add to the count of the length.
        for (int i = 0; i < a.length; i++) {
            if (!findStrInArr(b, a[i])) {
                diffLength++;
            }
        }

        // Loop through the second array and add to the count of the length.
        for (int i = 0; i < b.length; i++) {
            if (!findStrInArr(a, b[i])) {
                diffLength++;
            }
        }

        // Create the diff array with the length we got.
        diff = new String[diffLength];

        // Search if the every string in array a is in b, what differs go inside the new diff array.
        for (int i = 0; i < a.length; i++) {
            if (!findStrInArr(b, a[i])) {
                diff[index++] = a[i];
            }
        }

        // Search if the every string in array b is in a, what differs go inside the new diff array.
        for (int i = 0; i < b.length; i++) {
            if (!findStrInArr(a, b[i])) {
                diff[index++] = b[i];
            }
        }

        // Return the new array.
        return diff;
    }

    public static void main(String[] args) {
        // Declare the variables.
        String[] a = {"Adi", "is", "very", "nice"}; // -> The first string array.
        String[] b = {"Adi", "has", "a", "very", "nice", "cat"}; // -> The second string array.
        String[] diff = getDiff(a, b); // -> The new array created with the function getDiff().

        // Print the new array.
        for (int i = 0; i < diff.length; i++) {
            System.out.print(diff[i] + " ");
        }
    }
}
