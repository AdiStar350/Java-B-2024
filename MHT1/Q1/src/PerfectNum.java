public class PerfectNum {
    /**
     * Checks if a given number is a "perfect number" based on the sum of its digits.
     * A number is considered perfect in this context if it is divisible by the sum of its digits.
     *
     * @param num The number to check for perfection.
     * @return true if the number is perfect according to the defined criteria, false otherwise.
     */
    public static boolean isPerfect(int num) {
        // Declaring and initializing variables.
        int sumOfDigits = 0; // -> Stores the sum of the digits of the number.
        int numCopy = num; // -> A copy of the number to avoid modifying the original number.

        // Calculating the sum of the digits of the number.
        while (numCopy > 0) {
            sumOfDigits += numCopy % 10;
            numCopy /= 10;
        }

        // Returning the result of the check.
        return num % sumOfDigits == 0;
    }

    public static void main(String[] args) {
        // Test cases.
        System.out.println(isPerfect(28)); // -> false
        System.out.println(isPerfect(496)); // -> false
        System.out.println(isPerfect(8128)); // -> false
        System.out.println(isPerfect(27)); // -> true
        System.out.println(isPerfect(495)); // -> false
        System.out.println(isPerfect(8424)); // -> true
    }
}
