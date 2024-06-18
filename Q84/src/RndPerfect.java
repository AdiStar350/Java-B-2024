public class RndPerfect {
    public static void main(String[] args) {
        // Declare the variables.
        int num; // -> A perfect number.
        int sum; // -> The sum of the num's divisors.
        boolean isPerfect = false; // -> True if the number is perfect.

        do {
            // Get random number between 1 and 10000.
            num = (int) (Math.random() * 10000 + 1);

            // Initialize the sum and reset each iteration.
            sum = 0;

            // Check if the number is perfect.
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            // If the number is perfect break the loop, if not, reset.
            if (sum == num) {
                isPerfect = true;
            }
        } while (!isPerfect);

        // Print the number.
        System.out.println(num);
    }
}
