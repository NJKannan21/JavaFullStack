package com.app;
import java.util.Scanner;
public class Sample {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hellow Kannan!!");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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


