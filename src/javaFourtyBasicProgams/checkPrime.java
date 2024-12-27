package javaFourtyBasicProgams;
import java.util.Scanner;
public class checkPrime {

	public static void main(String[] args) {
		
		// Check Prime
		// Determine if a number is prime or not.

		// Enter a number: 7
		// Output: 7 is a prime number.

		
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scanObj.nextInt();
		boolean isPrime = true;
		
		if(num <= 1) {
			isPrime = false;
		} else {
			for(int i=2; i<num; i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println( num + " is a prime number");
		} else {
			System.out.println( num + " is not a prime number");
		}
		scanObj.close();
	}

}
