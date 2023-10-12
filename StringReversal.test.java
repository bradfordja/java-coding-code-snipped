import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReversalTest {

    @Test
    public void testReverseString_BasicCase() {
        String input = "Hello, World!";
        String expected = "!dlroW ,olleH";
        String result = StringReversal.reverseString(input);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseString_EmptyString() {
        String input = "";
        String expected = "";
        String result = StringReversal.reverseString(input);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseString_SingleCharacter() {
        String input = "a";
        String expected = "a";
        String result = StringReversal.reverseString(input);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseString_SpecialCharacters() {
        String input = "@#*123";
        String expected = "321*#@";
        String result = StringReversal.reverseString(input);
        assertEquals(expected, result);
    }

    // ... Additional test cases as necessary ...
}
