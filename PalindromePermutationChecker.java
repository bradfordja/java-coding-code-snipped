import java.util.HashMap;
import java.util.Map;

public class PalindromePermutationChecker {

    public static boolean canPermutePalindrome(String s) {
        // Map to store character counts
        Map<Character, Integer> charCounts = new HashMap<>();

        // Count each character
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Count the number of characters that have an odd count using a stream
        long oddCount = charCounts.values().stream()
                                  .filter(count -> count % 2 != 0)
                                  .count();

        // A string can form a palindrome if there is at most one odd count
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        String input1 = "tactcoa";
        String input2 = "java";
        
        System.out.println("Can \"" + input1 + "\" permute to a palindrome? " + canPermutePalindrome(input1));
        System.out.println("Can \"" + input2 + "\" permute to a palindrome? " + canPermutePalindrome(input2));
    }
}
