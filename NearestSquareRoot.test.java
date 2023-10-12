import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NearestSquareRootTest {

    @Test
    public void testFindNearestSquareRootOfExactSquare() {
        int number = 49;
        int expected = 7;
        int actual = NearestSquareRoot.findNearestSquareRoot(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindNearestSquareRootOfNonSquare() {
        int number = 300;
        int expected = 17;
        int actual = NearestSquareRoot.findNearestSquareRoot(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindNearestSquareRootOfSmallNumber() {
        int number = 2;
        int expected = 1;
        int actual = NearestSquareRoot.findNearestSquareRoot(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindNearestSquareRootOfOne() {
        int number = 1;
        int expected = 1;
        int actual = NearestSquareRoot.findNearestSquareRoot(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindNearestSquareRootOfZero() {
        int number = 0;
        int expected = 0;
        int actual = NearestSquareRoot.findNearestSquareRoot(number);
        assertEquals(expected, actual);
    }

    // ... Any other test cases you deem necessary ...
}
