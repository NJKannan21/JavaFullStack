package guviPortalTaskOne;
import java.util.Scanner;
public class reverseTheNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to reverse the number using loop
		// input = 876
		// output = 678
		
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Please Enter the number for show it reverse!!");
		
		int num = scanObj.nextInt();
		
		int temp = num;
		int mod = 0;
		int res = 0;
		while(temp > 0) {
			mod = temp % 10;
			temp = temp / 10;
			res = res * 10 + mod;
		}
		System.out.println("The reverse number for "+ num + " is : "+ res);
		scanObj.close();

	}

}
