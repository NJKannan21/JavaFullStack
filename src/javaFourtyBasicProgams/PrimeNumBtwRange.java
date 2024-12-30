package javaFourtyBasicProgams;
import java.util.Scanner;
import java.util.Scanner;

public class PrimeNumBtwRange {

	public static void main(String[] args) {
		// Print all prime numbers between two numbers.
		// Enter the range: 10 20
		// Output: 11, 13, 17, 19
		
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter a From number");
		int from = scanObj.nextInt();
		System.out.println("Enter a To number");
		int to = scanObj.nextInt();
		
		for(int i=from; i<=to; i++ ) {
			boolean isPrime = true;
			if(i<2) {
				isPrime = false;
			}
			for(int j=2; j<i; j++ ) {
				if(i%j == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
		scanObj.close();
	}

}
