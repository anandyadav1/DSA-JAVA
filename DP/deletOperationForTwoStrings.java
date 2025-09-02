public class deletOperationForTwoStrings {
    public static void main(String[] args) {
        // Questions
        /*
         * Given two strings s1 and s2. The task is to remove or insert the minimum
         * number of characters from/in s1 to transform it into s2. It could be possible
         * that the same character needs to be removed from one point of s1 and inserted
         * into another point.
         */

        String s1 = "heap", s2 = "pea";  //Output: 3  Explanation: 'p' and 'h' deleted from heap. Then, 'p' is inserted at the beginning.
        // String s1 = "geeksforgeeks", s2 = "geeks";  //Output: 8  Explanation: 8 deletions, i.e. remove all characters of the string "forgeeks".
        // String s1 = "sea", s2 = "eat";  //Output: 2  Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".

        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int ans=(m-dp[m][n])+(n-dp[m][n]);
        System.out.println(ans);

    }
}
