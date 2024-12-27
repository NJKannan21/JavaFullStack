package guviPortalTaskOne;
import java.util.Scanner;
public class discountCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program that takes the purchase amount as input.
		// Calculates the final payable amount after applying the discount.

		// 1.If the purchase amount is less than 500, no discount.
		// 2.If the purchase amount is between 500 and 1000, a 10% discount is applied.
		// 3.If the purchase amount is greater than 1000 a 20% discount is applied.
		
		Scanner scanObj = new Scanner(System.in);

		System.out.println("Please enter the purchase amount");
		int amt = scanObj.nextInt();
		int discnt = 0;

		if(amt > 1000) {
			discnt = discnt + amt * 20/100;
			System.out.println("20% discount for your purchase " + discnt);
		} else if(amt >= 500 && amt <= 1000) {
			discnt = discnt + amt * 10/100;
			System.out.println("10% discount for your purchase " + discnt);
		} else {
			System.out.println("No discount for your purchase");
		}

		scanObj.close();
	}

}
