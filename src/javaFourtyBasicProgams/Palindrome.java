package javaFourtyBasicProgams;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {

		// Check if a number is a palindrome.
		// Enter a number: 121
		// Output: 121 is a palindrome.
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = scanObj.nextInt();
		int temp = num;
		int res = 0;
		int mod = 0;
		while(temp > 0) {
			mod = temp % 10;
			temp = temp / 10;
			res = res * 10 + mod;
		}
		
		if(num == res) {
			System.out.println( res + " is a palindrome.");
		} else {
			System.out.println( res + " is not a palindrome.");
		}
		scanObj.close();
	}

}
