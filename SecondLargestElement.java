public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 19, 8, 20, 15};
        int result = findSecondLargest(numbers);
        System.out.println("Second Largest Element: " + result);
    }
}
