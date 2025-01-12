package guviPortalTask3;
import java.util.Scanner;
public class TaxManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Employee details
        System.out.println("Enter Employee Details:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Name: ");
        scanner.nextLine(); // Consume newline
        String name = scanner.nextLine();
        System.out.print("Yearly Salary: ");
        double salary = scanner.nextDouble();

        // Create Employee object and calculate tax
        Employee employee = new Employee(empId, name, salary);
        employee.calcTax();

        // Accept Product details
        System.out.println("\nEnter Product Details:");
        System.out.print("Product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Price per Unit: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        // Create Product object and calculate tax
        Product product = new Product(productId, price, quantity);
        product.calcTax();

        // Display results
        System.out.println("\nTax Calculations:");
        employee.display();
        product.display();

        scanner.close();
	}

}
