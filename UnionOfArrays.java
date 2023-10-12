import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {

    public static Set<Integer> getUnion(int[] array1, int[] array2) {
        HashSet<Integer> unionSet = new HashSet<>();

        // Add all elements of array1 to the set
        for (int num : array1) {
            unionSet.add(num);
        }

        // Add all elements of array2 to the set
        for (int num : array2) {
            unionSet.add(num);
        }

        return unionSet;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> union = getUnion(array1, array2);
        System.out.println("Union: " + union);
    }
}
