import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromeCheckTest {

    @Test
    public void testPalindromeWord() {
        assertTrue(PalindromeCheck.isPalindrome("racecar"));
    }

    @Test
    public void testNonPalindromeWord() {
        assertFalse(PalindromeCheck.isPalindrome("hello"));
    }

    @Test
    public void testPalindromeNumber() {
        assertTrue(PalindromeCheck.isPalindrome("121"));
    }

    @Test
    public void testPalindromeWithSpaces() {
        assertTrue(PalindromeCheck.isPalindrome("A man a plan a canal Panama".replaceAll("\\s+", "")));
    }

    @Test
    public void testPalindromeWithMixedCasing() {
        assertTrue(PalindromeCheck.isPalindrome("Racecar"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(PalindromeCheck.isPalindrome(""));
    }
    
    // ... Additional test cases as necessary ...
}
