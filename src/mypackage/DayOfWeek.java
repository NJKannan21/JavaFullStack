package mypackage;
import java.util.Scanner;
public class DayOfWeek {

	public static void main(String[] args) {
		// Day of the Week
		// Write a program that takes an integer (1 to 7) 
		// from the user and prints the corresponding day of the week using a switch statement.
		// - 1 = Monday, 2 = Tuesday, ..., 7 = Sunday.
		
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Please enter any number between 1 to 7");
		int Day = scanObj.nextInt();
		switch(Day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid");
				break;
		}
		scanObj.close();
	}

}
