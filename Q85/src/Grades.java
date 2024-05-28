// TODO Import the Scanner class.
import java.util.Scanner;

public class Grades {
    // TODO Create a new scanner object.
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO Declare the variables.
        int students; // [x] -> The number of students.
        int grade; // [x] -> A single grade.
        int[] grades; // [x] -> The grades for the students.
        int cnt; // [x] -> The number of grades per student.
        float sum = 0f; // [x] -> The class sum of grades.

        // TODO Get input from the user -> The number of students.
        System.out.print("Please enter the number of students: ");
        students = input.nextInt();

        // TODO Initialize the grades array length.
        grades = new int[students];

        // TODO Get the grades for all students.
        for (int i = 0; i < students; i++) {
            // TODO Initialize each students sum of grades and how many grades entered.
            grades[i] = 0;
            cnt = 0;

            // TODO Enter grades until 0 is entered.
            while (true) {
                // TODO Get input from the user -> A grade.
                System.out.print("Enter student " + (i + 1) + " grade: ");
                grade = input.nextInt();

                if (grade == 0) {
                    break;
                }

                // TODO Add the grade to the sum of grades for that student.
                grades[i] += grade;

                // TODO Increment the number of grades for that student.
                cnt++;
            }   
            // TODO Add the average grade of each student to the sum of grades for all the class.
            sum += grades[i] / cnt;

            // TODO Print the average grade of each student.
            System.out.println("Student " + (i + 1) + " average is: " + (grades[i] / cnt));
        }
        
        // TODO Print the average grade of all the class.
        System.out.println("The class average is: " + (sum / students));
    }
}
