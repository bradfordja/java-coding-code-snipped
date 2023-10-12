import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindPairsWithSumLessThenKTest {

    @Test
    public void testGetAllPairsWithSumLessThanK_NoPairs() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int K = 9;

        ArrayList<int[]> result = FindPairsWithSumLessThenK.getAllPairsWithSumLessThanK(list, K);

        assertEquals(0, result.size());
    }

    @Test
    public void testGetAllPairsWithSumLessThanK_MultiplePairs() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int K = 19;

        ArrayList<int[]> result = FindPairsWithSumLessThenK.getAllPairsWithSumLessThanK(list, K);

        assertEquals(3, result.size());
        assertArrayEquals(new int[]{2, 15}, result.get(0));
        assertArrayEquals(new int[]{2, 11}, result.get(1));
        assertArrayEquals(new int[]{2, 7}, result.get(2));
    }

    @Test
    public void testGetAllPairsWithSumLessThanK_EmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        int K = 19;

        ArrayList<int[]> result = FindPairsWithSumLessThenK.getAllPairsWithSumLessThanK(list, K);

        assertEquals(0, result.size());
    }

    // ... Additional test cases as necessary ...
}
