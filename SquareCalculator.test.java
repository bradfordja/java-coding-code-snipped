import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

public class SquareCalculatorTest {

    @Test
    public void testCalculateSquareWithPositiveIntegers() {
        int[] inputArray = {1, 2, 3, 4, 5};
        List<Integer> expected = Arrays.asList(1, 4, 9, 16, 25);
        List<Integer> actual = SquareCalculator.calculateSquare(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateSquareWithNegativeIntegers() {
        int[] inputArray = {-1, -2, -3, -4, -5};
        List<Integer> expected = Arrays.asList(1, 4, 9, 16, 25);
        List<Integer> actual = SquareCalculator.calculateSquare(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateSquareWithZero() {
        int[] inputArray = {0};
        List<Integer> expected = Arrays.asList(0);
        List<Integer> actual = SquareCalculator.calculateSquare(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateSquareWithMixedIntegers() {
        int[] inputArray = {-3, 0, 3};
        List<Integer> expected = Arrays.asList(9, 0, 9);
        List<Integer> actual = SquareCalculator.calculateSquare(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateSquareWithEmptyArray() {
        int[] inputArray = {};
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = SquareCalculator.calculateSquare(inputArray);
        assertEquals(expected, actual);
    }

    // ... Any other test cases you deem necessary ...
}
