public class ConcatStr {
    public static String concat(String[] strArr) {
        // Declaring the variables.
        String str = ""; // -> An empty string.
        int[] used = new int[strArr.length]; // -> An array of used indexes matching the array of strings.
        int index; // -> A random index from the string array.
        boolean flag; // -> Flag value.

        // Initialize the a special case for index 0.
        used[0] = -1; //

        // Using all the strings in the array.
        for (int i = 0; i < strArr.length; i++) {
            // Initialize the flag.
            flag = true;
            // Making sure not to use the same string twice.
            while (flag) {
                // Getting random value index.
                index = (int) (Math.random() * strArr.length);

                // Add the string to the str variable.
                if (!(used[index] == index)) {
                    used[index] = index;
                    str += strArr[index] + " ";
                    flag = false;
                }
            }
        }

        // Return the str variable.
        return str;
    } 

    public static void main(String[] args) {
        // Declaring the variables.
        String[] strArr = {"Adi", "is", "very", "bored", "and", "anxious", "."};

        // Printing the random concat string.
        System.out.println(concat(strArr));
    }
}
