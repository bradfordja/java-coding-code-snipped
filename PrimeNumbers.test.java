import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class PrimeNumbersTest {

    @Test
    public void testPrimeNumbersUpto100() {
        List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        List<Integer> actualPrimes = PrimeNumbers.getPrimeNumbersUptoN(100);
        assertEquals(expectedPrimes, actualPrimes);
    }
    
    @Test
    public void testPrimeNumbersUpto10() {
        List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7);
        List<Integer> actualPrimes = PrimeNumbers.getPrimeNumbersUptoN(10);
        assertEquals(expectedPrimes, actualPrimes);
    }

    @Test
    public void testNoPrimeNumbersBelow2() {
        List<Integer> expectedPrimes = Arrays.asList();
        List<Integer> actualPrimes = PrimeNumbers.getPrimeNumbersUptoN(1);
        assertEquals(expectedPrimes, actualPrimes);
    }

    // ... Additional test cases as necessary ...
}
