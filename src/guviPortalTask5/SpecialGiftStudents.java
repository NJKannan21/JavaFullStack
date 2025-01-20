package guviPortalTask5;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class SpecialGiftStudents {

	public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("Ananya");
        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Akshay");
        students.add("Ramesh");
        students.add("Arjun");
        students.add("Sneha");
        students.add("Aarav");
        students.add("Varun");

        // Filter students whose names start with "A" using Stream API and lambda
        List<String> specialGiftStudents = students.stream()
                .filter(name -> name.startsWith("A")) // Lambda to check if name starts with "A"
                .collect(Collectors.toList()); // Collect the result into a list

        System.out.println("Students receiving special gifts: " + specialGiftStudents);
    }

}
