import java.util.ArrayList;
import java.util.List;

public class SquareCalculator {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        List<Integer> squaredList = calculateSquare(inputArray);

        System.out.println(squaredList);  // This will print [1, 4, 9, 16, 25]
    }

    /**
     * Returns the square of each integer from the provided array as a list.
     *
     * @param numbers Array of integers to be squared
     * @return List of squared integers
     */
    public static List<Integer> calculateSquare(int[] numbers) {
        List<Integer> squaredList = new ArrayList<>();
        
        for (int num : numbers) {
            squaredList.add(num * num);
        }
        
        return squaredList;
    }
}
