package javaFourtyBasicProgams;
import java.util.Scanner;
public class DigitCount {

	public static void main(String[] args) {
		
		// Problem: Count the number of digits in a number.

		// Enter a number: 45678
		// Output: Number of digits: 5
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scanObj.nextInt();
		
		int count = 0;
		
		while(num > 0) {
			num /= 10;
			count++;
		}
		System.out.println("Number of digits : " + count);
		
		scanObj.close();
	}

}
