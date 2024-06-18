public class HasRepeat {

    // Create a function that returns true if a number has a digit that repeats.
    public static boolean hasRepeat(int num) {
        // Declare the variables.
        int[] cnt = new int[10]; // -> The counter array.

        // Loop through the number.
        while (num > 0) {
            // Count every digit.
            cnt[num % 10]++;

            // Return the result.
            if (cnt[num % 10] > 1) {
                return true;
            }

            num /= 10;       
        }

        return false;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int num = 765639; // -> A number.

        // Print the number and if it has a repeating digit.
        System.out.println("The number " + num + (hasRepeat(num) ? " has " : " doesn't have ") + "a repeating digit.");
    }
}
