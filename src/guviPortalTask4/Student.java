package guviPortalTask4;

public class Student {
	private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age " + age + " is not within the valid range (15-21).");
        }

        if (!isValidName(name)) {
            throw new NameNotValidException("Name '" + name + "' contains invalid characters (numbers or symbols).");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to validate name (should only contain alphabets and spaces)
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    // Display student details
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
    
    
    public static void main(String[] args) {
        try {
            // Test Case 1: Valid Student
            Student student1 = new Student(101, "John Doe", 19, "Computer Science");
            student1.display();

            // Test Case 2: Invalid Age
            Student student2 = new Student(102, "Alice", 14, "Mathematics");
            student2.display();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Test Case 3: Invalid Name
            Student student3 = new Student(103, "Alex@123", 20, "Physics");
            student3.display();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
