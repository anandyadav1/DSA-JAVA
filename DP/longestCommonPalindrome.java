public class longestCommonPalindrome {
    public static int call(String str, StringBuilder sb){
        int n=str.length();
        int m= sb.length();
        int ans=0;
        int dp[][]=new int[n+1][m+1];
        for(int i=1; i<n+1; i++){
            for(int  j=1; j<m+1; j++){
                if(str.charAt(i-1)==sb.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    ans=Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="madamsdkjgs";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
        System.out.println(call(str,sb));;
    }
}

