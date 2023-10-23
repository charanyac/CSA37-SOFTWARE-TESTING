import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;

public class StringComparisonTest {

    @Test
    public void testStringComparison() {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user for the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Get input from the user for the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        scanner.close();

        // Perform the string comparison
        boolean areEqual = compareStrings(firstString, secondString);

        // Assert that the strings are equal
        assertEquals(true, areEqual);
    }

    public boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
}
