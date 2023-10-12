import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void testFactorial_Zero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorial_One() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void testFactorial_Seven() {
        assertEquals(5040, Factorial.factorial(7));
    }

    @Test
    public void testFactorial_Five() {
        assertEquals(120, Factorial.factorial(5));
    }

    // ... Additional test cases as necessary ...
}
