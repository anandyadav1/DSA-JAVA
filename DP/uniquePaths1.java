public class uniquePaths1 {
    public static int countUniquePath(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1)
            return 1;
        if (i >= m || j >= n)
            return 0;

        return countUniquePath(i + 1, j, m, n) + countUniquePath(i, j + 1, m, n);
    }

    public static int countUniquePathDp(int m, int n) {
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++)
            dp[i][0] = 1;
        for (int i = 0; i < n; i++)
            dp[0][i] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        // Questions
        /* There is a robot on an m x n grid. The robot is initially located at the
           top-left corner (i.e., grid[0][0]). The robot tries to move to the
           bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move
           either down or right at any point in time.
           Given the two integers m and n, return the number of possible unique paths
           that the robot can take to reach the bottom-right corner.
           The test cases are generated so that the answer will be less than or equal to
           2 * 109
        */
        int m = 3, n = 7; // Output -> 28
        // int m=3, n=2; //Output -> 3

        // Using Recursions
        System.out.println(countUniquePath(0, 0, m, n));
        // Using 2D Array Dp
        System.out.println(countUniquePathDp(m, n));

    }
}
