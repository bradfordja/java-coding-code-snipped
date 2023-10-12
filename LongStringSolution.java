public class LongStringSolution {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < s.length(); j++){
                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                currentSubstring.append(s.charAt(j));
                maxLength = Math.max(maxLength, currentSubstring.length());
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
    int max = lengthOfLongestSubstring("eadiedniweif");
    System.out.println("Max length: " + max + " value");
    }
}
