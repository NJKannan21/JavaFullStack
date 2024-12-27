package javaFourtyBasicProgams;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		// Calculate the factorial of a number using loops.
		// Enter a number: 5
		// Output: Factorial of 5 is 120.
		
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scanObj.nextInt();
		int temp = num;
		int res = 1;
		while(temp > 0) {
			res = res * temp;
			temp--;
		}
		System.out.println("Factorial of "+ num +" is "+ res +".");
		
		scanObj.close();
	}

}
