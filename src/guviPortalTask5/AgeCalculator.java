package guviPortalTask5;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeCalculator {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

        // Ask the user for their birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateInput = scanner.nextLine();

        // Parse the birthdate string into a LocalDate
        LocalDate birthdate = LocalDate.parse(birthdateInput);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age as a Period
        Period age = Period.between(birthdate, currentDate);

        // Print the age in years, months, and days
        System.out.printf("Your age is %d years, %d months, and %d days.%n", age.getYears(), age.getMonths(), age.getDays());

        scanner.close();

	}

}
