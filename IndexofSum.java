import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexofSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 6);
        System.out.println(getIndexOfSum(list, 5));
    }

    public static List<Integer> getIndexOfSum(List<Integer> list, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int diff = x - list.get(i);
            if (map.containsKey(diff)) {
                return Arrays.asList(map.get(diff), i);
            }
            map.put(list.get(i), i);
        }
        return null;
    }
}

/*
 *
  
 Certainly! This Java program aims to find two elements in a given list whose sum equals a target value `x`. If such elements are found, the method `getIndexOfSum` returns their indices as a list; otherwise, it returns `null`.

### Code Explanation:

1. **Import Statements**: Java utilities like `List`, `Arrays`, and `Map` are imported.

2. **Main Method**: 
  - A list of integers `list` is initialized with values `[1, 2, 3, 6]`.
  - The method `getIndexOfSum` is called with `list` and a target sum `5`. 
  - The result is printed to the console.

3. **getIndexOfSum Method**: 
  - It takes a `List<Integer>` and an integer `x` as arguments.
  - A `HashMap<Integer, Integer>` named `map` is created to store each element and its corresponding index from the list.
  - A `for` loop iterates over the list:
    - It calculates `diff = x - list.get(i)`.
    - If `diff` exists as a key in `map`, that means we have found two elements whose sum is `x`. The method then returns a list containing the indices of these two elements.
    - Otherwise, it adds the current element and its index to `map`.

### Sample Output for Given Code:
If you run the program, the output will be `[1, 2]`, which are the indices of elements `2` and `3` in the list `[1, 2, 3, 6]`. The sum of these elements is `5`, which is the target sum.

### Notes:
- This implementation has a time complexity of \(O(n)\) and a space complexity of \(O(n)\), where \(n\) is the size of the list. 
- The method returns `null` if it doesn't find any such pair, which might not be the best practice. It would be better to return an `Optional<List<Integer>>` or some other indicative value.

This is a typical question you might encounter in technical interviews and can be solved efficiently using Hashing.
 */