public class minimumInsertionStepsmakeStringPalindrome {
    public static void main(String[] args) {
        // Questions
        /*
         * Given a string s. In one step you can insert any character at any index of
         * the string.
         * Return the minimum number of steps to make s palindrome.
         * A Palindrome String is one that reads the same backward as well as forward.
         */

        // String s = "zzazz";   //Output: 0    Explanation: The string "zzazz" is already palindrome we do not need any insertions.
        // String s = "mbadm";   //Output: 2    Explanation: String can be "mbdadbm" or "mdbabdm".
        String s = "leetcode";   //Output: 5    Explanation: Inserting 5 characters the string becomes "leetcodocteel".

        String s2=new StringBuilder(s).reverse().toString();
        int n=s.length();
        int dp[][]=new int[n+1][n+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(s.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int ans=n-dp[n][n];
        System.out.println(ans);
    }
}
