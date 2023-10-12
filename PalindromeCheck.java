public class PalindromeCheck {
    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = isPalindrome(str);
        System.out.println(str + " Is Palindrome: " + isPalindrome);
    }
}
