package guviPortalTask3;

public class Employee implements Taxable {
	private int empId;
    private String name;
    private double salary;
    private double calculatedTax;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Calculate income tax on yearly salary
    public void calcTax() {
        calculatedTax = salary * incomeTax; // yearly salary * 10.5%
    }

    // Display employee details and tax
    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Emp ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Yearly Salary: " + salary);
        System.out.println("Income Tax: " + calculatedTax);
    }
}
