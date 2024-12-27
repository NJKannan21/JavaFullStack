package javaFourtyBasicProgams;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		
		// Calculate the sum of digits in a number.

		// Enter a number: 672
		// Output: Sum of digits: 15
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scanObj.nextInt();
		int mod = Integer.MIN_VALUE;
		int sum = 0;
		while(num > 0) {
			mod = num % 10;
			sum += mod;
			num = num / 10;
			
			if(sum > 9 && num <= 0) {
				System.out.println("The output( sum of digit ) is grater than 9 :: " + sum + " So We do further.");
				num = sum;
				sum = 0;
			}
		}
		System.out.println("Sum of digits: " + sum);
		scanObj.close();
	}

}
