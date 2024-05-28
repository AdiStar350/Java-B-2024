public class RndPerfect {
    public static void main(String[] args) {
        // TODO Declare the variables.
        int num; // [x] -> A perfect number.
        int sum; // [x] -> The sum of the num's divisors.
        boolean isPerfect = false; // [x] -> True if the number is perfect.

        do {
            // TODO Get random number between 1 and 10000.
            num = (int) (Math.random() * 10000 + 1);

            // TODO Initialize the sum and reset each iteration.
            sum = 0;

            // TODO Check if the number is perfect.
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            // TODO If the number is perfect break the loop, if not, reset.
            if (sum == num) {
                isPerfect = true;
            }
        } while (!isPerfect);

        // TODO Print the number.
        System.out.println(num);
    }
}
