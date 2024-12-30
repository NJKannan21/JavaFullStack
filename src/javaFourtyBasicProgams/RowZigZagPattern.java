package javaFourtyBasicProgams;

import java.util.Scanner;

public class RowZigZagPattern {

	public static void main(String[] args) {
		// Print numbers from 1 to n in a zig-zag pattern.
		// Enter a number: 7
		// Output: 1 7 2 6 3 5 4
		
		
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scanObj.nextInt();
		int evenPos = 0;
		
		for(int i=1;i<=num;i++) {
			if(i % 2 == 0) {
				System.out.print(num-evenPos + " ");
				evenPos++;
			} else {
				System.out.print(i-evenPos + " ");
			}
		}
		scanObj.close();
	}

}
