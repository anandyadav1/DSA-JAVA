public class TriangleMinimumPathSum {

    // Using DP with 2D array (Tabulation)
    public static int dpTabulation(int[][] triangle) {
        int n = triangle.length;
        int[][] dp = new int[n][n];

        // Last row copy
        for (int j = 0; j < triangle[n - 1].length; j++) {
            dp[n - 1][j] = triangle[n - 1][j];
        }

        // Bottom-up calculation
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                dp[i][j] = triangle[i][j] + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }
        return dp[0][0];
    }

    // Space Optimized (In-place in last row)
    public static int removeSpaceTimeComplexity(int[][] triangle) {
        int n = triangle.length;
        int[] dp = new int[n];

        // Start with last row
        for (int j = 0; j < n; j++) {
            dp[j] = triangle[n - 1][j];
        }

        // Bottom-up
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                dp[j] = triangle[i][j] + Math.min(dp[j], dp[j + 1]);
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        // Question Example
        /*
           Given a triangle array, return the minimum path sum from top to
           bottom. For each step, you may move to an adjacent number of the row below.
           More formally, if you are on index i on the current row, you may move to
           either index i or index i + 1 on the next row.
        */
        int[][] triangle = {
                { 2 },
                { 3, 4 },
                { 6, 5, 7 },
                { 4, 1, 8, 3 }
        };

        System.out.println(dpTabulation(triangle)); // Output: 11
        System.out.println(removeSpaceTimeComplexity(triangle)); // Output: 11
    }
}
