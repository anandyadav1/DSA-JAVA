import java.util.Arrays;

public class distinctSubsequences2 {
    public static void main(String[] args) {
        // Questions
        /*
         * Given a string s consisting of lowercase english alphabets, the task is to
         * find the number of distinct subsequences of the string
         * Note: Answer can be very large, so, ouput will be answer modulo 109+7.
         */

        String s = "gfg";
        // Output: 7
        // Explanation:
        // The seven distinct subsequences are "", "g", "f", "gf", "fg", "gg" and "gfg"
        // .

        // String s = "ggg";
        // Output: 4
        // Explanation:
        // The four distinct subsequences are "", "g", "gg", "ggg".

        int MOD = 1000000007;
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for (int i = 1; i <= n; i++) {
            char c = s.charAt(i - 1);
            dp[i] = (2 * dp[i - 1]) % MOD;
            if (last[c - 'a'] != -1) {
                dp[i] = (dp[i] - dp[last[c - 'a']] + MOD) % MOD;
            }
            last[c - 'a'] = i - 1;
        }
        System.out.println(dp[n]);
    }
}
