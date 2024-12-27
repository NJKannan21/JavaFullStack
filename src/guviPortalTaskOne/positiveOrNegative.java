package guviPortalTaskOne;
import java.util.Scanner;
public class positiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to find a given number is positive or negative.
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Please enter the number");
		
		int num = scanObj.nextInt();
		
		if(num > 0) {
			System.out.println(num + " is Positive");
		} else if(num < 0) {
			System.out.println(num + " is Negative");
		} else if(num == 0) {
			System.out.println(num + " is neither negative nor positive");
		} else {
			System.out.println("Invalid input !!");
		}
		
		scanObj.close();
		
		

	}

}
