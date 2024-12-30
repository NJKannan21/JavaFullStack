package javaFourtyBasicProgams;
import java.util.Scanner;
public class pascalTriangle {

	public static void main(String[] args) {
		// Print Pascal’s Triangle up to n rows.
		
		//     1 
		//    1 1 
		//   1 2 1 
		//  1 3 3 1
		
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scanObj.nextInt();
		int[] prevRow = null;
		for(int row=0; row <= num; row++) {
			int[] currRow = new int[row+1];

			for( int space=num-row; space > 0; space-- ) {
				System.out.print(" ");
			}
			for( int val=0; val < row; val++ ) {
				if(row < 3) {
					currRow[val] = 1;
				} else {
					if(val == 0 || val == prevRow.length-1) {
						currRow[val] = 1;
					} else {
						currRow[val] = prevRow[val-1] + prevRow[val];
					}
				}
				System.out.print(currRow[val] + " ");
			}
			prevRow = currRow;
			System.out.println();
		}
		
	}

}
