package mypackage;
import java.util.Scanner;
public class MaxTwoNum {

	public static void main(String[] args) {
		// Write a program to find the maximum of two numbers entered by the user using if-else.
		
		Scanner scanObj = new Scanner(System.in);
		System.out.println(" Enter Number of elements ");
		
		int n = scanObj.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println(" Enter the elements ");
		for(int j = 0; j < n; j++) {
			arr[j] = scanObj.nextInt();
		}
		int max = 0;
		int secMax = 0;
		int thirdMax = 0;
		for(int i=0; i < n; i++) {

			if(arr[i] > max) {
				thirdMax = secMax;
				secMax = max;
				max = arr[i];
			} else if( arr[i] > secMax && arr[i] != max) {
				thirdMax = secMax;
				secMax = arr[i];
			} else if( arr[i] > thirdMax && arr[i] != max && arr[i] != secMax) {
				thirdMax = arr[i];
			}

		}
		System.out.println("First max is " + max);
		System.out.println("Second max is " + secMax);
		System.out.println("Third max is " + thirdMax);
		scanObj.close();
	}

}
