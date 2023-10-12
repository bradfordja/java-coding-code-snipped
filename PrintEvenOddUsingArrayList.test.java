import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintEvenOddUsingArrayListTest {

    @Test
    public void testSeparateEven() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> result = PrintEvenOddUsingArrayList.separateEven(numbers);
        assertEquals(expected, result);
    }

    @Test
    public void testSeparateOdd() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> result = PrintEvenOddUsingArrayList.separateOdd(numbers);
        assertEquals(expected, result);
    }

    // ... Additional test cases as necessary ...
}
