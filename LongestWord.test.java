import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestWordTest {

    @Test
    public void testFindLongestWordInLine() {
        LongestWord longestWord = new LongestWord();

        assertEquals("elephant", longestWord.findLongestWordInLine("cat dog elephant"));
        assertEquals("ab", longestWord.findLongestWordInLine("a ab"));
        assertEquals("", longestWord.findLongestWordInLine(""));
    }

    @Test
    public void testProcessFile() throws IOException {
        LongestWord longestWord = new LongestWord();
        String input = "apple banana\nthis is a test\nhello world";
        BufferedReader in = new BufferedReader(new StringReader(input));

        // You'd ideally want to capture console output and verify it
        // For now, just ensuring no exceptions are thrown
        longestWord.processFile(in);
    }
}
