import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterNumeric.v2 {

    public static Map<String, List<Integer>> analyze(int[] nums) {
        Map<String, List<Integer>> result = new HashMap<>();
        
        // Use a HashMap to count occurrences, filtering non-eligible numbers first.
        Map<Integer, Long> counts = Arrays.stream(nums)
                                          .filter(num -> num > 0 && num <= 1000000)
                                          .boxed()
                                          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        // Determine missing numbers using IntStream, filtering out those present in the counts map.
        List<Integer> missing = IntStream.rangeClosed(1, 1000000)
                                         .filter(i -> !counts.containsKey(i))
                                         .boxed()
                                         .collect(Collectors.toList());

        // Determine duplicated numbers from the counts map.
        List<Integer> duplicated = counts.entrySet().stream()
                                         .filter(entry -> entry.getValue() > 1)
                                         .map(Map.Entry::getKey)
                                         .collect(Collectors.toList());

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
