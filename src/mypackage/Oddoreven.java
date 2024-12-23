package mypackage;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {
		// Write a program to check whether a number entered by the user is even or odd.
		
		Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the Number");
        int number  = myObj.nextInt();

        if( number  % 2 == 0 ){

            System.out.println("Given Number is Even");

        } else if( number  % 2 != 0 ){

            System.out.println("Given Number is Odd");

        } else {

            System.out.println("Invalid input");

        }
        myObj.close();
	}

}
