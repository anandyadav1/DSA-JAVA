
public class distinctSubsequences {
    public static void main(String[] args) {
        // Questions
        /*
         * Given two strings s and t, return the number of distinct subsequences of s
         * which equals t.
         * The test cases are generated so that the answer fits on a 32-bit signed
         * integer.
         */

        String s = "rabbbit", t = "rabbit";
        //Output: 3
        //Explanation:
        //As shown below, there are 3 ways you can generate "rabbit" from s.
        //rabbbit
        //rabbbit
        //rabbbit


    //    String s = "babgbag", t = "bag";
       //Output: 5
       //Explanation:
       //As shown below, there are 5 ways you can generate "bag" from s.
       //babgbag
       //babgbag
       //babgbag
       //babgbag
       //babgbag

       int m=s.length();
        int n=t.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0; i<=m; i++) dp[i][0]=1;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1] + dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[m][n]);
    }
}
