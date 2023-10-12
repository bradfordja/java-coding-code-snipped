import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareList {

    public static List<Integer> squareList(List<Integer> integersList) {
        return integersList.stream().map(n -> n * n).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> integersList = Arrays.asList(4, 5, 20, 7, 10, 9);
        List<Integer> squaredIntegers = squareList(integersList);
        squaredIntegers.forEach(System.out::println);
    }
}
