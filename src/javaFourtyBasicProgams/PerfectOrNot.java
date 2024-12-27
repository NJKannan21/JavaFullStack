package javaFourtyBasicProgams;
import java.util.Scanner;
public class PerfectOrNot {

	public static void main(String[] args) {
		// Check if a number is a perfect number.
		// Enter a number: 28
		// Output: 28 is a perfect number.

		Scanner scanObj = new Scanner(System.in);

		System.out.print("Enter a number ::  ");
		int num = scanObj.nextInt();
		int res = 0;
		
		for(int i=1; i<num; i++ ) {
			if(num % i == 0) {
				res +=i;
			}
		}
		System.out.println( num + " is a" + ( res == num  ? " ": " Not " ) +"perfect number.");
		scanObj.close();
	}

}
