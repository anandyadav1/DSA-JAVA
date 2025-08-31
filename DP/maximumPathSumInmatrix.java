public class maximumPathSumInmatrix {
    public static void main(String[] args) {
        // Questions
        /*
            You are given a matrix mat[][] of size n x m where each element is a positive
            integer. Starting from any cell in the first row, you are allowed to move to
            the next row, but with specific movement constraints. From any cell (r, c) in
            the current row, you can move to any of the three possible positions :
            (r+1, c-1) — move diagonally to the left.
            (r+1, c) — move directly down.
            (r+1, c+1) — move diagonally to the right.
            Find the maximum sum of any path starting from any column in the first row
            and ending at any column in the last row, following the above movement
            constraints.
         */

        int mat[][] = {{3, 6, 1}, {2, 3, 4}, {5, 5, 1}};      //Output: 15
        // int mat[][] = {{2, 1, 1}, {1, 2, 2}};      //Output: 4
        // int mat[][] = {{25}};      //Output: 25

        int m=mat.length;
        int n=mat[0].length;
        int dp[][]=new int[m][n];
        for(int i=0; i<n; i++){
            dp[0][i]=mat[0][i];
        }
        for(int i=1; i<m; i++){
            for(int j=0; j<n; j++){
                int up=dp[i-1][j];
                int leftUp=(j>0) ? dp[i-1][j-1] : 0;
                int rightUp=(j<n-1) ? dp[i-1][j+1] : 0;
                dp[i][j]=mat[i][j]+Math.max(up,Math.max(leftUp, rightUp));
            }
        }

        int maxSum=0;
        for(int i=0; i<n; i++){
            maxSum=Math.max(maxSum, dp[m-1][i]);
        }

        System.out.println(maxSum);
    }
}
