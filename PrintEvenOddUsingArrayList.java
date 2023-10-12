import java.util.ArrayList;
import java.util.List;

public class PrintEvenOddUsingArrayList {

    public static List<Integer> separateEven(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    public static List<Integer> separateOdd(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("Even Numbers: " + separateEven(numbers));
        System.out.println("Odd Numbers: " + separateOdd(numbers));
    }
}
