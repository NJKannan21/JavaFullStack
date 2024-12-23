package mypackage;
import java.util.Scanner;
public class GradeCal {

	public static void main(String[] args) {
		// Grade Calculation
		// Write a program to calculate the grade of a student based on marks:
		// Marks >= 90: Grade A.
		// Marks >= 75: Grade B.
		// Marks >= 50: Grade C.
		// Marks < 50: Fail.
		
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Please enter the Mark");
		int mark = scanObj.nextInt();
		
		if( mark > 100 ) {
			System.out.println("Input should be below 100");
		} else if( mark >= 90 ) {
			System.out.println("Grade A");
		} else if( mark >= 75 ) {
			System.out.println("Grade B");
		} else if (mark >= 50) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail");
		}
		
		scanObj.close();
	}

}
