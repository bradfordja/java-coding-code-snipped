import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLongestSubstringTest {

    @Test
    public void testLengthOfLongestSubstring_General() {
        assertEquals(5, LengthOfLongestSubstring.lengthOfLongestSubstring("eadiedniweif"));
        assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testLengthOfLongestSubstring_Empty() {
        assertEquals(0, LengthOfLongestSubstring.lengthOfLongestSubstring(""));
    }

    @Test
    public void testLengthOfLongestSubstring_SingleCharacter() {
        assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring("a"));
    }

    @Test
    public void testLengthOfLongestSubstring_TwoDistinctCharacters() {
        assertEquals(2, LengthOfLongestSubstring.lengthOfLongestSubstring("ab"));
    }

    @Test
    public void testLengthOfLongestSubstring_TwoSameCharacters() {
        assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring("aa"));
    }

    // ... Additional test cases as necessary ...
}
