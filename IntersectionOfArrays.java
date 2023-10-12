import java.util.HashSet;

public class IntersectionOfArrays {

    public static HashSet<Integer> getIntersection(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Add all elements of array1 to set1
        for (int num : array1) {
            set1.add(num);
        }

        // Check each element in array2 if it exists in set1
        // If yes, add it to the intersectionSet
        for (int num : array2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        return intersectionSet;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        System.out.println("Intersection: " + getIntersection(array1, array2));
    }
}
