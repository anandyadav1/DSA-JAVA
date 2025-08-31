public class minimumFallingPathSum {
    public static void main(String[] args) {
        // Questions
        /*
            Given an n x n array of integers matrix, return the minimum sum of any
             falling path through matrix.
             A falling path starts at any element in the first row and chooses the element
             in the next row that is either directly below or diagonally left/right.
             Specifically, the next element from position (row, col) will be (row + 1, col
             - 1), (row + 1, col), or (row + 1, col + 1).
         */

        int matrix[][] = {{2,1,3},{6,5,4},{7,8,9}};  //Output: 13
        // int matrix[][] = {{-19,57},{-40,-5}};  //Output: -59

        int n=matrix.length;
        int dp[][]= new int[n][n];
        for(int i=0; i<n; i++) dp[0][i]=matrix[0][i];

        for(int i=1; i<n; i++){
            for(int j=0; j<n; j++){
                int top=dp[i-1][j];
                int topLeft=(j>0) ? dp[i-1][j-1] : Integer.MAX_VALUE;
                int topRight=(j<n-1) ? dp[i-1][j+1] : Integer.MAX_VALUE;
                dp[i][j]=matrix[i][j]+Math.min(top,Math.min(topLeft, topRight));
            }
        }

        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            min=Math.min(min, dp[n-1][i]);
        }
        System.out.println(min);
    }
}
