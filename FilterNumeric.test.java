import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FilterNumericTest {

    @Test
    public void testAnalyze() {
        int[] nums = {-10, -4, -4, 0, 1, 3, 3, 3, 3, 5, 6, 6, 999999, 1000000000, 1000000000, 1000000001};

        Map<String, List<Integer>> result = FilterNumeric.analyze(nums);

        // Expect first 2 and 4 missing, among others.
        List<Integer> expectedMissing = Arrays.asList(2, 4, 7, 8, 9, 10, /* ... other numbers ... */, 999998, 1000000);

        // Expect 3 and 6 duplicated.
        List<Integer> expectedDuplicated = Arrays.asList(3, 6);

        assertEquals(expectedMissing.subList(0, 6), result.get("missing").subList(0, 6)); // Check the start of the list
        assertEquals(expectedMissing.subList(expectedMissing.size() - 2, expectedMissing.size()),
                     result.get("missing").subList(result.get("missing").size() - 2, result.get("missing").size())); // Check the end of the list
        assertEquals(expectedDuplicated, result.get("duplicated"));
    }

    // You can add more test cases to handle other scenarios.
}
