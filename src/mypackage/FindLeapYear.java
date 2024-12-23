package mypackage;
import java.util.Scanner;
public class FindLeapYear {

	public static void main(String[] args) {
		// Write a program to check whether a given year is a leap year. 
		// (A year is a leap year if it is divisible by 4 but not divisible by 100 unless also divisible by 400.)
		
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Please enter the year");
		
		int year = scanObj.nextInt();
		
		if(year % 400 == 0) {
			System.out.println(year + " is the leap year.");
		} else if (year % 100 == 0) {
			System.out.println(year + " is not a leap year");
		} else if (year % 4 == 0) {
			System.out.println(year + " is the leap year.");
		} else {
			System.out.println(year + " is not a leap year");
		}
		
		scanObj.close();
	}

}
