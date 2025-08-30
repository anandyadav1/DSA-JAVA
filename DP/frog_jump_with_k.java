public class frog_jump_with_k {
    public static void main(String[] args) {
        int heights[] = {10, 5, 20, 0, 15};
        int k = 2;
        int n = heights.length;
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(heights[i] - heights[i - j]);
                    min = Math.min(min, jump);
                }
            }
            dp[i] = min;
        }

        System.out.println(dp[n-1]);
    }
}
