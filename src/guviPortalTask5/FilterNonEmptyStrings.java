package guviPortalTask5;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FilterNonEmptyStrings {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty()) // Check if the string is not empty
                .collect(Collectors.toList()); // Collect the result into a list

        System.out.println("Non-empty Strings: " + nonEmptyStrings);
	}

}
