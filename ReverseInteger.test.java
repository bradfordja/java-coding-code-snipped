import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testReverseInteger_Basic() {
        assertEquals(51, ReverseInteger.reverseInteger(15));
        assertEquals(23456, ReverseInteger.reverseInteger(65432));
    }

    @Test
    public void testReverseInteger_NegativeNumber() {
        assertEquals(-51, ReverseInteger.reverseInteger(-15));
        assertEquals(-23456, ReverseInteger.reverseInteger(-65432));
    }

    @Test
    public void testReverseInteger_SingleDigit() {
        assertEquals(5, ReverseInteger.reverseInteger(5));
        assertEquals(0, ReverseInteger.reverseInteger(0));
        assertEquals(-5, ReverseInteger.reverseInteger(-5));
    }

    // ... Additional test cases as necessary ...
}
