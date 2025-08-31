public class minimumPathSum {
    public static void main(String[] args) {
        // Questions
        /*
            Given a m x n grid filled with non-negative numbers, find a path from top
            left to bottom right, which minimizes the sum of all numbers along its path.
            Note: You can only move either down or right at any point in time.
         */
        // int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};    //Output: 7
        int grid[][] = {{1,2,3},{4,5,6}};    //Output: 12

        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        dp[0][0]=grid[0][0];
        //Initilize for Row
        for(int j=1; j<n; j++) dp[0][j]=dp[0][j-1]+grid[0][j];
        //Initilize for Col
        for(int i=1; i<m; i++) dp[i][0]=dp[i-1][0]+grid[i][0];

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }

        System.out.println(dp[m-1][n-1]);
    }
}
