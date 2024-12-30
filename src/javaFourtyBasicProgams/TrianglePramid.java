package javaFourtyBasicProgams;
import java.util.Scanner;
public class TrianglePramid {

	public static void main(String[] args) {
		// Print a pyramid pattern of stars.
		
		// Enter the height: 3
		// Output:
		//   *
		//  ***
		// *****
		
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int height = scanObj.nextInt();
		
		for(int i=0; i<height; i++) {
			for(int j=height-i; j>1; j-- ) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanObj.close();
	}

}
