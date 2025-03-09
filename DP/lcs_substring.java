public class lcs_substring {
    public static int tabulations(String str1, String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];

        int res=0;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    res=Math.max(res,dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="abgce";
        System.out.println(tabulations(str1,str2));
    }
}
