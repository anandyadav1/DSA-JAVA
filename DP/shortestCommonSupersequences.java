import java.util.*;
public class shortestCommonSupersequences {
    public static void main(String[] args) {
        // Questions
        /*
         * Given two strings str1 and str2, return the shortest string that has both
         * str1 and str2 as subsequences. If there are multiple valid strings, return
         * any of them.
         * A string s is a subsequence of string t if deleting some number of characters
         * from t (possibly 0) results in the string s.
         */

        String str1 = "abac", str2 = "cab";
        //Output: "cabac"
        //Explanation:
        //str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
        //str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
        //The answer provided is the shortest such string that satisfies these properties.


        // String str1 = "aaaaaaaa", str2 = "aaaaaaaa";    //Output: "aaaaaaaa"
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                sb.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                sb.append(str1.charAt(i - 1));
                i--;
            } else {
                sb.append(str2.charAt(j - 1));
                j--;
            }
        }
        while (i > 0) {
            sb.append(str1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            sb.append(str2.charAt(j - 1));
            j--;
        }

        String ans = sb.reverse().toString();
        System.out.println(ans);
    }
}
