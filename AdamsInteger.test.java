import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AdamsIntegerTest {

    @Test
    public void testAdamsInteger() {
        assertEquals(false, AdamsInteger.isAdamInteger(2));
        assertEquals(false, AdamsInteger.isAdamInteger(36));
        assertEquals(false, AdamsInteger.isAdamInteger(44));
        assertEquals(false, AdamsInteger.isAdamInteger(5));
        assertEquals(true, AdamsInteger.isAdamInteger(12));
    }
}