import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromePositive() {
        assertTrue(PalindromeChecker.isPalindrome(121)); // Palindrome number
        assertTrue(PalindromeChecker.isPalindrome(12321)); // Palindrome number
        assertTrue(PalindromeChecker.isPalindrome(12321)); // Palindrome number
        assertTrue(PalindromeChecker.isPalindrome(1)); // Single-digit number
    }

    @Test
    public void testIsPalindromeNegative() {
        assertFalse(PalindromeChecker.isPalindrome(123)); // Non-palindrome number
        assertFalse(PalindromeChecker.isPalindrome(1234)); // Non-palindrome number
        assertFalse(PalindromeChecker.isPalindrome(-121)); // Negative number
    }
}