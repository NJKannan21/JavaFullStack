package guviPortalTask4;
import java.util.Scanner;
public class Weekdays {

	public static void main(String[] args) {
		// Array to store weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user for day index
            System.out.print("Enter day position (0-6): ");
            int dayIndex = scanner.nextInt();

            // Print day name
            System.out.println("Day: " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid day index. Please enter a number between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
        	System.out.println("Code Execution is done.");
            scanner.close();
        }
	}
}
