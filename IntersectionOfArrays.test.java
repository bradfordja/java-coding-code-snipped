import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class IntersectionOfArraysTest {

    @Test
    public void testGetIntersection_ValidIntersection() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        HashSet<Integer> intersection = IntersectionOfArrays.getIntersection(array1, array2);

        assertTrue(intersection.contains(4));
        assertTrue(intersection.contains(5));
        assertFalse(intersection.contains(1));
        assertFalse(intersection.contains(6));
    }

    @Test
    public void testGetIntersection_NoIntersection() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        HashSet<Integer> intersection = IntersectionOfArrays.getIntersection(array1, array2);

        assertTrue(intersection.isEmpty());
    }

    @Test
    public void testGetIntersection_EmptyArrays() {
        int[] array1 = {};
        int[] array2 = {};

        HashSet<Integer> intersection = IntersectionOfArrays.getIntersection(array1, array2);

        assertTrue(intersection.isEmpty());
    }

    // ... Additional test cases as necessary ...
}
