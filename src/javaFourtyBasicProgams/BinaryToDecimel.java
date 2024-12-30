package javaFourtyBasicProgams;
import java.util.Scanner;
public class BinaryToDecimel {

	public static void main(String[] args) {
		// Convert a binary number to a decimal number.
		// Enter a binary number: 1011
		// Output: Decimal: 11
		
		Scanner scanObj = new Scanner(System.in);

		System.out.println("Enter a binary number");
		int binaryNum = scanObj.nextInt();
		
		int temp = binaryNum;
		int mod = Integer.MIN_VALUE;
		int dec = 0;
		int count = 1;
		
		while(temp > 0) {
			int base = 1;
			mod = temp % 10;
			for(int i=1; i<count; i++) {
				base *= 2;
			}
			dec += mod * base;
			temp = temp / 10;
			count++;
		}
		System.out.println("Decimal is : " + dec);
		
		scanObj.close();

	}

}
