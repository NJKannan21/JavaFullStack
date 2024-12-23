package mypackage;

import java.util.Scanner;
public class EligibleForVote {

	public static void main(String[] args) {
		// Create a program that checks if a person is eligible to vote based on their age (age ≥ 18).
		
		Scanner scanObj = new Scanner(System.in);
        System.out.println("Please enter the Number");
        int age  = scanObj.nextInt();

        if( age >= 18 ){

            System.out.println("You are eligible to vote");

        } else if( age <= 18 ){

            System.out.println("You are NOt eligible to vote");

        } else {

            System.out.println("Invalid input");

        }
        scanObj.close();
	}

}
