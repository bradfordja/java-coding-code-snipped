import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class IndexofSumTest {

    @Test
    public void testGetIndexOfSum_ValidPairExists() {
        List<Integer> list = Arrays.asList(1, 2, 3, 6);
        List<Integer> result = IndexofSum.getIndexOfSum(list, 5);

        assertArrayEquals(new Integer[]{1, 2}, result.toArray());
    }

    @Test
    public void testGetIndexOfSum_NoValidPair() {
        List<Integer> list = Arrays.asList(1, 2, 3, 6);
        List<Integer> result = IndexofSum.getIndexOfSum(list, 10);

        assertNull(result);
    }

    @Test
    public void testGetIndexOfSum_EmptyList() {
        List<Integer> list = Arrays.asList();
        List<Integer> result = IndexofSum.getIndexOfSum(list, 5);

        assertNull(result);
    }

    @Test
    public void testGetIndexOfSum_OnlyOneValidNumber() {
        List<Integer> list = Arrays.asList(1, 2, 3, 6);
        List<Integer> result = IndexofSum.getIndexOfSum(list, 2);

        assertNull(result);
    }

    // ... Additional test cases as necessary ...
}
