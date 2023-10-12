import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static List<Integer> getPrimeNumbersUptoN(int n) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int numberToCheck = 2; numberToCheck <= n; numberToCheck++) {
            boolean isPrime = true;
            for (int factor = 2; factor <= numberToCheck/2; factor++) {
                if (numberToCheck % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(numberToCheck);
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        List<Integer> primeNumbers = getPrimeNumbersUptoN(100);
        System.out.println("Prime numbers found: " + primeNumbers);
    }
}
