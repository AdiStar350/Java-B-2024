public class StrInStr {
    // Creating a new function that returns a boolean value that indicates if a string contains another string from the array.
    public static boolean isContained(String[] strs) {
        // Looping through the array of strings.
        for (int i = 0; i < strs.length; i++) {
            // Looping through the array again to check every string with the others, excluding itself, and return the solution.
            for (int j = i + 1; j < strs.length; j++) {
                if (j == i) {
                    break;
                }
                if (strs[i].contains(strs[j]) || strs[j].contains(strs[i])) {
                    return true;
                }
                if (j == strs.length - 1) {
                    j = -1;
                    continue;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Declaring the variables.
        String[] strs = {"Adi", "is", "meow", "ha"}; // -> An array of strings.

        // Printing if some strings in the array contain each other.
        System.out.println("The string values in the array do " + (isContained(strs) ? "" :"not ")+ "contain " + "other values.");
    }
}
