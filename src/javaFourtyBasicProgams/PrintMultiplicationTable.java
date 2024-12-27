package javaFourtyBasicProgams;
import java.util.Scanner;
public class PrintMultiplicationTable {

	public static void main(String[] args) {
		// Generate a multiplication table for a given number.
		// Enter a number: 3
		// 3 x 1 = 3
		// 3 x 2 = 6
		// ...
		// 3 x 10 = 30

		Scanner scanObj = new Scanner(System.in);

		System.out.print("Enter a number ::  ");
		int num = scanObj.nextInt();
		
		for(int i=1; i <= 20; i++) {
			System.out.println( i + " * " + num + " = " + i*num);
		}
		scanObj.close();
	}

}
