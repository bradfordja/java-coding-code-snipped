import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqelemTest {

    @Test
    public void testGetUniqueElements() {
        Uniqelem uniqelem = new Uniqelem();
        List<String> result = uniqelem.getUniqueElements("a,b,c,d,a,b");
        assertEquals(Arrays.asList("a", "b", "c", "d"), result);
    }

    @Test
    public void testFound_True() {
        String[] list = {"a", "b", "c"};
        boolean result = Uniqelem.found("a", list);
        assertEquals(true, result);
    }

    @Test
    public void testFound_False() {
        String[] list = {"a", "b", "c"};
        boolean result = Uniqelem.found("d", list);
        assertEquals(false, result);
    }

    // ... Additional test cases as necessary ...
}
