import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapelementsTest {

    @Test
    public void testSwapElements_BasicCase() {
        String line = "1 2 3 4 5 6 7 8 9 : 0-8";
        String[] expected = {"9", "2", "3", "4", "5", "6", "7", "8", "1"};
        String[] result = Swapelements.swapElements(line);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSwapElements_MultipleSwaps() {
        String line = "1 2 3 4 : 0-3,1-2";
        String[] expected = {"4", "3", "2", "1"};
        String[] result = Swapelements.swapElements(line);
        assertArrayEquals(expected, result);
    }

    // ... Additional test cases as necessary ...
}
