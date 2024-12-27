package javaFourtyBasicProgams;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {

		// Reverse the digits of a given number
		
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = scanObj.nextInt();
		int res = 0;
		int mod = 0;
		while(num > 0) {
			mod = num % 10;
			num = num / 10;
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
