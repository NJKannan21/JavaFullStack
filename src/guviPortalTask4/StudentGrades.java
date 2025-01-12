package guviPortalTask4;
import java.util.HashMap;
import java.util.Scanner;
public class StudentGrades {
	
	private HashMap<String, Integer> studentGrades;

    // Constructor to initialize the HashMap
    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student and their grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade + ".");
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayStudentGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade for " + name + ": " + studentGrades.get(name));
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        StudentGrades grades = new StudentGrades();

		while (true) {
            System.out.println("\nStudent Grades Management:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1: // Add Student
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    grades.addStudent(name, grade);
                    break;

                case 2: // Remove Student
                    System.out.print("Enter student name to remove: ");
                    name = scanner.nextLine();
                    grades.removeStudent(name);
                    break;

                case 3: // Display Student Grade
                    System.out.print("Enter student name to display grade: ");
                    name = scanner.nextLine();
                    grades.displayStudentGrade(name);
                    break;

                case 4: // Exit
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}

}
