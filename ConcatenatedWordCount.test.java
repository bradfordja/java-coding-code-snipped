import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcatenatedWordCountTest {

    @Test
    public void testGetConcatenateWordCount_MultipleOverlaps() {
        List<String> stream1 = Arrays.asList("cat", "rat", "dog");
        List<String> stream2 = Arrays.asList("cat", "dog", "cow", "dock");
        
        Map<String, Integer> wordCountMap = ConcatenatedWordCount.getConcatenateWordCount(stream1, stream2);

        assertEquals(2, wordCountMap.get("cat"));
        assertEquals(1, wordCountMap.get("rat"));
        assertEquals(2, wordCountMap.get("dog"));
        assertEquals(1, wordCountMap.get("cow"));
        assertEquals(1, wordCountMap.get("dock"));
    }

    @Test
    public void testGetConcatenateWordCount_NoOverlaps() {
        List<String> stream1 = Arrays.asList("bird", "mouse");
        List<String> stream2 = Arrays.asList("cat", "dog");
        
        Map<String, Integer> wordCountMap = ConcatenatedWordCount.getConcatenateWordCount(stream1, stream2);

        assertEquals(1, wordCountMap.get("bird"));
        assertEquals(1, wordCountMap.get("mouse"));
        assertEquals(1, wordCountMap.get("cat"));
        assertEquals(1, wordCountMap.get("dog"));
    }

    @Test
    public void testGetConcatenateWordCount_EmptyLists() {
        List<String> stream1 = Arrays.asList();
        List<String> stream2 = Arrays.asList();
        
        Map<String, Integer> wordCountMap = ConcatenatedWordCount.getConcatenateWordCount(stream1, stream2);

        assertEquals(0, wordCountMap.size());
    }

    // ... Additional test cases as necessary ...
}
