public class NearestSquareRoot {

    public static void main(String[] args) {
        int number = 300; 
        System.out.println("Nearest square root of " + number + " is: " + findNearestSquareRoot(number));
    }

    public static int findNearestSquareRoot(int num) {
        if (num <= 1) {
            return num;
        }

        int start = 1, end = num;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            int square = mid * mid;

            // If we find the exact square root
            if (square == num) {
                return mid;
            }

            // If the square of mid is less than num, move to the right half
            if (square < num) {
                start = mid + 1;
                result = mid;  // Keep updating the potential nearest square root
            } else {
                // If the square of mid is greater than num, move to the left half
                end = mid - 1;
            }
        }

        // Check which is closer, the result or the next integer
        int nextInt = result + 1;
        if (Math.abs((nextInt * nextInt) - num) < Math.abs((result * result) - num)) {
            return nextInt;
        }

        return result;
    }
}
