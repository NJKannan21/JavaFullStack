package mypackage;
import java.util.Scanner;
public class simpleCalculator {

	public static void main(String[] args) {
		// Simple Calculator
		// Create a program that performs basic arithmetic operations 
		// (addition, subtraction, multiplication, and division) based on the user’s choice using a switch statement.
		
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Please enter the Opeation");
		System.out.println("Like :- addition, subtraction, multiplication, division");
		
		String operation = scanObj.nextLine();
		int operentsCount = Integer.MIN_VALUE;
		System.out.println("How many number you need to perform "+ operation +" operation");
		operentsCount = scanObj.nextInt();
		int[] operatrents = new int[operentsCount];
		int val = 0;

		for(int i=0; i < operentsCount; i++) {
			operatrents[i] = scanObj.nextInt();
		}

		if(operation.equalsIgnoreCase("multiplication") || operation.equalsIgnoreCase("division")) {
			val = 1;
		}

		for(int idx : operatrents) {
			switch(operation) {
				case "addition":
					val += idx;
					break;
				case "subtraction":
					val -= idx;
					break;
				case "multiplication":
					val *= idx;
					break;
				case "division":
					val /= idx;
					break;
				
				default:
					System.out.println("Invalid input");
			}
		}
		System.out.println("The " + operation + " of the gives values result is " + val);
	}
	
}
