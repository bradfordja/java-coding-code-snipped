public class MinCharsForPalindrome {

    public static void main(String[] args) {
        String str = "ABCAB"; 
        System.out.println("Minimum characters needed to convert to palindrome: " + findMinInsertions(str));
    }

    // Function to get minimum number of insertions needed to make the string palindrome
    public static int findMinInsertions(String str) {
        int n = str.length();
        // Reverse the given string
        String rev = new StringBuilder(str).reverse().toString();
        
        // Get length of the longest common subsequence of str and its reverse
        int lcs = longestCommonSubsequence(str, rev);
        
        // Subtract the length of LCS from the original string length to get the result
        return (n - lcs);
    }

    // Function to find the length of Longest Common Subsequence of strings a and b
    public static int longestCommonSubsequence(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];

        for (int i=0; i<=m; i++) {
            for (int j=0; j<=n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }
}
