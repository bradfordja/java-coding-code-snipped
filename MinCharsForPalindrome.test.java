import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCharsForPalindromeTest {

    @Test
    public void testFindMinInsertions() {
        assertEquals(1, MinCharsForPalindrome.findMinInsertions("ABCAB"));
        assertEquals(3, MinCharsForPalindrome.findMinInsertions("ABC"));
        assertEquals(0, MinCharsForPalindrome.findMinInsertions("ABCBA"));
        assertEquals(2, MinCharsForPalindrome.findMinInsertions("AACECAAAA"));
    }

    @Test
    public void testLongestCommonSubsequence() {
        assertEquals(3, MinCharsForPalindrome.longestCommonSubsequence("ABCAB", "BACBA"));
        assertEquals(1, MinCharsForPalindrome.longestCommonSubsequence("A", "A"));
        assertEquals(0, MinCharsForPalindrome.longestCommonSubsequence("A", "B"));
        assertEquals(3, MinCharsForPalindrome.longestCommonSubsequence("AGGTAB", "GXTXAYB"));
    }

    @Test
    public void testFindMinInsertions_Empty() {
        assertEquals(0, MinCharsForPalindrome.findMinInsertions(""));
    }

    @Test
    public void testFindMinInsertions_SingleCharacter() {
        assertEquals(0, MinCharsForPalindrome.findMinInsertions("A"));
    }

    // ... Additional test cases as necessary ...
}
