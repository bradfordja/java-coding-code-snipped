import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class SquareListTest {

    @Test
    public void testSquareList() {
        List<Integer> inputList = Arrays.asList(4, 5, 20, 7, 10, 9);
        List<Integer> expectedSquaredList = Arrays.asList(16, 25, 400, 49, 100, 81);

        List<Integer> actualSquaredList = SquareList.squareList(inputList);
        
        assertEquals(expectedSquaredList, actualSquaredList);
    }
    
    @Test
    public void testEmptyList() {
        List<Integer> inputList = Arrays.asList();
        List<Integer> expectedSquaredList = Arrays.asList();

        List<Integer> actualSquaredList = SquareList.squareList(inputList);
        
        assertEquals(expectedSquaredList, actualSquaredList);
    }

    // ... Additional test cases as necessary ...
}
