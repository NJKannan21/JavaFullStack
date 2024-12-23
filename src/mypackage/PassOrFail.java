package mypackage;
import java.util.Scanner;
public class PassOrFail {

	public static void main(String[] args) {
		// Pass or Fail
		// Write a program to determine whether a student has passed or failed based on their marks.
		// Pass if marks ≥ 40; otherwise, fail.
		
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Please enter the student mark");
		
		int mark = scanObj.nextInt();
		
		String status =  mark >= 40 ? "Pass" : "Fail";
		
		System.out.println(status);
		
		
	}

}
