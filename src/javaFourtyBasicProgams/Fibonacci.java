package javaFourtyBasicProgams;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		// Fibonacci Sequence
		// Enter a number: 5
		// Output: Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8

		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scanObj.nextInt();
		
		int numPrev = 0;
		int numCurr = 1;
		int numNext = Integer.MIN_VALUE;
		
		System.out.print(numPrev + ", " + numCurr);
		for(int i=0; i<num; i++) {
			numNext = numCurr + numPrev;
			System.out.print(", "+ numNext);
			numPrev = numCurr;
			numCurr = numNext;
		}
		scanObj.close();
	}
}
