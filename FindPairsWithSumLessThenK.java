import java.util.ArrayList;
import java.util.Collections;

public class FindPairsWithSumLessThenK {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(2);
        A.add(7);
        A.add(11);
        A.add(15);
        int K = 19;

        ArrayList<int[]> result = getAllPairsWithSumLessThanK(A, K);

        if (result.size() > 0) {
            System.out.println("Pairs found:");
            for (int[] pair : result) {
                System.out.println(pair[0] + ", " + pair[1]);
            }
        } else {
            System.out.println("No such pairs found.");
        }
    }

    public static ArrayList<int[]> getAllPairsWithSumLessThanK(ArrayList<Integer> A, int K) {
        ArrayList<int[]> pairsList = new ArrayList<>();
        Collections.sort(A); // Sort the ArrayList in ascending order
        int left = 0, right = A.size() - 1;

        while (left < right) {
            int currentSum = A.get(left) + A.get(right);

            if (currentSum < K) {
                for (int i = right; i > left; i--) {
                    pairsList.add(new int[] { A.get(left), A.get(i) });
                }
                left++;
            } else {
                right--;
            }
        }

        return pairsList;
    }
}
