package guviPortalTaskTwo;

// Problem 1.4

public class Employee extends Person {
	String employeeID;
    double salary;

    // Constructor for Employee
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); // Initialize the Person attributes
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayEmployeeDetails() {
        // Display Person details
        super.display();
        // Display Employee details
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
    
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("Kannan", 25, "CF0235", 75000.00);

        // Display Employee details
        employee.displayEmployeeDetails();
    }

}
