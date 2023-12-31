public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int right = 0, left = 0; right < s.length(); right++) {
            int indexOfFirstAppearanceInSubstring = s.indexOf(s.charAt(right), left);
            if (indexOfFirstAppearanceInSubstring != right) {
                left = indexOfFirstAppearanceInSubstring + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
    int max = lengthOfLongestSubstring("eadiedniweif");
    System.out.println("Max length: " + max + " value");
    }
}