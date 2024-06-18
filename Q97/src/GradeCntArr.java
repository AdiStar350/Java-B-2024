public class GradeCntArr {

    // Create a function that displays all grades between 0 and 100 with their count in the array.
    public static void displayGradesByValue(int[] grades) {
        // Declare the variables.
        int[] cnt = new int[101]; // -> An array of counts for each grade which the index represents the grade.

        // Loop through the grades array and increment the count array every time for the matching grade. 
        for (int i = 0; i < grades.length ; i++) {
            cnt[grades[i]]++;
        }

        // Print the updated count array.
        for (int i = 0; i < cnt.length; i++) {
            System.out.println("Grade: " + i + " --> " + cnt[i]);
        }
    }

    public static void main(String[] args) {
        // Declare the variables.
        int[] grades = {100, 55, 90, 36, 37, 88, 98, 23, 44, 55, 44, 55, 99}; // -> The grades array.

        // Display the count to the screen. 
        displayGradesByValue(grades);
    }
}
