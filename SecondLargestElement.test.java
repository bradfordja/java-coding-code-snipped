import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondLargestElementTest {

    @Test
    public void testFindSecondLargest_Basic() {
        int[] arr = {10, 5, 19, 8, 20, 15};
        int expected = 19;
        int result = SecondLargestElement.findSecondLargest(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testFindSecondLargest_DuplicateLargest() {
        int[] arr = {10, 20, 20, 15, 8};
        int expected = 15;
        int result = SecondLargestElement.findSecondLargest(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testFindSecondLargest_NegativeValues() {
        int[] arr = {-10, -20, -30, -5};
        int expected = -10;
        int result = SecondLargestElement.findSecondLargest(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testFindSecondLargest_SingleElement() {
        int[] arr = {15};
        int expected = Integer.MIN_VALUE; // Since there's no second largest value in this case.
        int result = SecondLargestElement.findSecondLargest(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testFindSecondLargest_EmptyArray() {
        int[] arr = {};
        int expected = Integer.MIN_VALUE; // No value to compare against in this case.
        int result = SecondLargestElement.findSecondLargest(arr);
        assertEquals(expected, result);
    }

    // ... Additional test cases as necessary ...
}
