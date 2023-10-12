import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongStringSolutionTest {

    @Test
    public void testLengthOfLongestSubstring_General() {
        assertEquals(5, LongStringSolution.lengthOfLongestSubstring("eadiedniweif"));
        assertEquals(3, LongStringSolution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, LongStringSolution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, LongStringSolution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testLengthOfLongestSubstring_Empty() {
        assertEquals(0, LongStringSolution.lengthOfLongestSubstring(""));
    }

    @Test
    public void testLengthOfLongestSubstring_SingleCharacter() {
        assertEquals(1, LongStringSolution.lengthOfLongestSubstring("a"));
    }

    @Test
    public void testLengthOfLongestSubstring_TwoDistinctCharacters() {
        assertEquals(2, LongStringSolution.lengthOfLongestSubstring("ab"));
    }

    @Test
    public void testLengthOfLongestSubstring_TwoSameCharacters() {
        assertEquals(1, LongStringSolution.lengthOfLongestSubstring("aa"));
    }

    // ... Additional test cases as necessary ...
}
