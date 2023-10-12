import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayIntersectionTest {

    @Test
    public void testFindIntersection() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] expected = {3, 4, 5};
        
        int[] result = ArrayIntersection.findIntersection(arr1, arr2);
        
        assertArrayEquals(expected, result, "Arrays are not equal");
    }

    @Test
    public void testNoIntersection() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] expected = {};

        int[] result = ArrayIntersection.findIntersection(arr1, arr2);

        assertArrayEquals(expected, result, "Arrays are not equal");
    }

    // Add more tests as necessary
}
