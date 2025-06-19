public class conversion {
    public static int tabulations(String str1, String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1="pear";
        String str2="sea";
        int lcs=tabulations(str1,str2);
        System.out.println(lcs);
        System.out.println("No of delete operations :  "+(str1.length()-lcs));
        System.out.println("No of add operations :  "+(str2.length()-lcs));
    }
}
