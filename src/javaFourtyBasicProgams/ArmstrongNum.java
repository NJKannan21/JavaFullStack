package javaFourtyBasicProgams;
import java.util.Scanner;
public class ArmstrongNum {

	public static void main(String[] args) {
		// Check if a number is an Armstrong number.
		// Enter a number: 153
		// Output: 153 is an Armstrong number.
		
		Scanner scanObj = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = scanObj.nextInt();
		int temp = num;
		int exponent = 3;
		int expVal = 1;
		int sum = 0;
		int mod = Integer.MIN_VALUE;
		while(temp > 0){
			mod = temp % 10;
			temp /= 10;
			for(int i=1;i<=exponent;i++) {
				expVal *= mod;
			}
			System.out.println("expVal : " + expVal);
			sum += expVal;
			expVal = 1;
			System.out.println("sum : " + sum);
		}
		System.out.println("Exponent 3 val : " + sum);
		if(sum == num) {
			System.out.println( sum + " is an Armstrong number.");
		} else {
			System.out.println( sum + " is not an Armstrong number.");
		}
	}

}
