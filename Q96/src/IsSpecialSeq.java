public class IsSpecialSeq {

    // Create a function that returns if the sequence array is special or not.
    public static boolean isSpecial(int[] nums) {
        // Check if the first element and second elements together are equal to the third every time and return the answer.
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + nums[i - 2]) {
                return false;
            }
        }

        return nums.length < 3 ? false : true;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int[] seq = {1, 3, 4, 7, 11, 18, 29}; // -> The array sequence.

        // Print the array sequence and if it is special.
        System.out.print("The sequence: ");

        for (int i = 0; i < seq.length; i++) {
            System.out.print(seq[i] + " ");
        }

        System.out.println("is " + (isSpecial(seq) ? "" : "not ") + "special.");
    }
}
