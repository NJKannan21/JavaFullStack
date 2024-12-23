package mypackage;

import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		// Write a program to determine if a number entered by the user is positive, negative, or zero.
		
		Scanner scanObj = new Scanner(System.in);
        System.out.println("Please enter the number");

        int checkNum = scanObj.nextInt();

        if(checkNum >= 0){
            System.out.println("Given Number is positive");
        } else if( checkNum < 0 ){
            System.out.println("Given Number is negative");
        } else {
        	System.out.println("Given Number is Zero");
        }
        scanObj.close();
	}

}
