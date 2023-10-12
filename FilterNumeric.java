  
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterNumeric {

    public static Map<String, List<Integer>> analyze(int[] nums) {
        Map<String, List<Integer>> result = new HashMap<>();

        // This array helps track the count of numbers.
        int[] tracker = new int[1000001];

        // Iterate through the nums and update our tracker array.
        for (int num : nums) {
            if (num > 0 && num <= 1000000) {
                tracker[num]++;
            }
        }

        List<Integer> missing = new ArrayList<>();
        List<Integer> duplicated = new ArrayList<>();

        // Now, process our tracker array.
        for (int i = 1; i <= 1000000; i++) {
            if (tracker[i] == 0) {
                missing.add(i);
            } else if (tracker[i] > 1) {
                duplicated.add(i);
            }
        }

        result.put("missing", missing);
        result.put("duplicated", duplicated);
        
        return result;
    }

    public static void main(String[] args) {
        int[] numArray = {-10, -4, -4, 0, 1, 3, 3, 3, 3, 5, 6, 6, 999999, 1000000000, 1000000000, 1000000001};
        Map<String, List<Integer>> result = analyze(numArray);

        System.out.println("Missing: " + result.get("missing"));
        System.out.println("Duplicated: " + result.get("duplicated"));
    }
}

