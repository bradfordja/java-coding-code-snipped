import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnionOfArraysTest {

    @Test
    public void testGetUnion_BasicCase() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        Set<Integer> expected = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8));

        Set<Integer> result = UnionOfArrays.getUnion(array1, array2);
        assertEquals(expected, result);
    }

    @Test
    public void testGetUnion_EmptyFirstArray() {
        int[] array1 = {};
        int[] array2 = {4, 5, 6};
        Set<Integer> expected = new HashSet<>(Set.of(4, 5, 6));

        Set<Integer> result = UnionOfArrays.getUnion(array1, array2);
        assertEquals(expected, result);
    }

    @Test
    public void testGetUnion_EmptySecondArray() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {};
        Set<Integer> expected = new HashSet<>(Set.of(1, 2, 3));

        Set<Integer> result = UnionOfArrays.getUnion(array1, array2);
        assertEquals(expected, result);
    }

    @Test
    public void testGetUnion_BothArraysEmpty() {
        int[] array1 = {};
        int[] array2 = {};
        Set<Integer> expected = new HashSet<>();

        Set<Integer> result = UnionOfArrays.getUnion(array1, array2);
        assertEquals(expected, result);
    }

    // ... Additional test cases as necessary ...
}
