
public class partitionEqualSubsetSum {
    public static void main(String[] args) {
        // Questions
        /*
         * Given an integer array nums, return true if you can partition the array into
         * two subsets such that the sum of the elements in both subsets is equal or
         * false otherwise.
         */

        int nums[] = {1,5,11,5};      //Output: true
        // int nums[] = {1,2,3,5};      //Output: false
        int n = nums.length;
        int sum = 0;
        for (int val : nums) sum += val;
        if (sum % 2 != 0) System.out.println(false);

        int target = sum / 2;
        boolean dp[][] = new boolean[n + 1][target + 1];

        for (int i = 0; i <= n; i++) dp[i][0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(true);

    }
}