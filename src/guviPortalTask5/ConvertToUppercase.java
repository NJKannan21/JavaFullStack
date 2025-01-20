package guviPortalTask5;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Stream;
public class ConvertToUppercase {

	public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");

        List<String> upperCaseNames = names
                .map(String::toUpperCase) // Convert each string to uppercase
                .collect(Collectors.toList()); // Collect the result into a list

        System.out.println("Uppercase Strings: " + upperCaseNames);
    }

}
