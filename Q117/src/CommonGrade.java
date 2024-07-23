public class CommonGrade {
    // Create a new class that returns the most common grade from a 2D array.
    public static int getCommonGrade(int[][] grades) {
        // declare the variables.
        int[] cnt = new int[101]; // -> A counter array of the grades.
        int common = 0; // -> The most common grade.
        int commonCnt = 0; // -> The most common grade count.

        // Loop through the rows of the array.
        for (int i = 0; i < grades.length; i++) {
            // Loop through the columns of the array.
            for (int j = 0; j < grades[i].length; j++) {
                // Update the counter array with the grades values.
                cnt[grades[i][j]]++;
            }
        }

        // Loop through the counter array and get the most common grade.
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > commonCnt) {
                commonCnt = cnt[i];
                common = i;
            }
        }

        // Return the most common grade.
        return common;
    }

    public static void main(String[] args) {
        // Declare the variables.
        int[][] grades = new int[6][5]; // -> An array of grades.

        // Print the array and get random grades for the values.
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = (int) (Math.random() * 101);
                System.out.print(String.format("%4d", grades[i][j]));
            }

            System.out.println();
        }

        // Print the most common grade.
        System.out.println(String.format("\nThe most common grade is: %d", getCommonGrade(grades)));
    }
}
