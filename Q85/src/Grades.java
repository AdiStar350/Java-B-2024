// Import the Scanner class.
import java.util.Scanner;

public class Grades {
    // Create a new scanner object.
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Declare the variables.
        int students; // -> The number of students.
        int grade; // -> A single grade.
        int[] grades; // -> The grades for the students.
        int cnt; // -> The number of grades per student.
        float sum = 0f; // -> The class sum of grades.

        // Get input from the user -> The number of students.
        System.out.print("Please enter the number of students: ");
        students = input.nextInt();

        // Initialize the grades array length.
        grades = new int[students];

        // Get the grades for all students.
        for (int i = 0; i < students; i++) {
            // Initialize each students sum of grades and how many grades entered.
            grades[i] = 0;
            cnt = 0;

            // Enter grades until 0 is entered.
            while (true) {
                // Get input from the user -> A grade.
                System.out.print("Enter student " + (i + 1) + " grade: ");
                grade = input.nextInt();

                if (grade == 0) {
                    break;
                }

                // Add the grade to the sum of grades for that student.
                grades[i] += grade;

                // Increment the number of grades for that student.
                cnt++;
            }   
            // Add the average grade of each student to the sum of grades for all the class.
            sum += grades[i] / cnt;

            // Print the average grade of each student.
            System.out.println("Student " + (i + 1) + " average is: " + (grades[i] / cnt));
        }
        
        // Print the average grade of all the class.
        System.out.println("The class average is: " + (sum / students));
    }
}
