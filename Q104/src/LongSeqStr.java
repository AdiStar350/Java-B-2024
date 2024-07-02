public class LongSeqStr {
    // Create a new function that will return a boolean value representing if an array of strings is in a growing sequence lengthwise.
    public static boolean isSeq(String[] strs) {
        // Declaring the variables.
        int cntNow; // -> The current string counter.
        int cntBefore = 0; // The count of the previous string. 
        
        // Looping through the array of strings.
        for (int i = 0; i < strs.length; i++) {
            // Initializing the current count for the current string.
            cntNow = 0;
            // Looping through the string and adding to count.
            for (int j = 0; j < strs[i].length(); j++) {
                cntNow++;
            }
            // Return the fitting value.
            if (cntBefore > cntNow) {
                return false;
            }
            cntBefore = cntNow;
        }

        return true;
    }

    public static void main(String[] args) {
        // Declaring the variables.
        String[] strs = {"a", "aa", "aaa", "aa"}; // -> An array of strings.

        // Printing the solution.
        System.out.println("The array is " + (isSeq(strs) ? "" : "not ") + "in a growing sequence.");
    }
}
