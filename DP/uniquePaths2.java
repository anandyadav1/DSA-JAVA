public class uniquePaths2{
    public static void main(String[] args) {
        int n = 3, m = 3;
        int grid[][] = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};   //Output: 2
        // int n = 1, m = 3;
        // int grid[][] = {{1, 0, 1}};   //Output: 0

        int dp[][]=new int[n][m];
        for(int i=0; i<n; i++){
            if(grid[i][0]==0) dp[i][0]=1;
            else break;
        }
        for(int i=0; i<m; i++){
            if(grid[0][i]==0) dp[0][i]=1;
            else break;
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(grid[i][j]==0)dp[i][j]=dp[i-1][j] + dp[i][j-1];
            }
        }

        System.out.println(dp[n-1][m-1]);
    }
}