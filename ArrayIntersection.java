import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
        public static int[] findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] result = findIntersection(arr1, arr2);
        System.out.println("Intersection of Arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
