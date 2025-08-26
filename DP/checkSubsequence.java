public class checkSubsequence {
    //Using Dp Approach
    public static boolean check1(String s1, String s2){
        int n=s1.length();
        int m=s2.length();
        boolean dp[][]=new boolean[n+1][m+1];
        for(int j=0; j<m+1; j++){
            dp[0][j]=true;
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=dp[i][j-1];
                }
            }
        }
        // for(boolean v[]:dp){
        //     for(boolean b:v){
        //         System.out.print(b+" ");
        //     }
        //     System.out.println();
        // }
        return dp[n][m];
    }

    //Using Iterative method
    public static boolean check2(String s1, String s2){
        int i=0,j=0;
        int n=s1.length(), m=s2.length();
        while (i<n && j<m) {
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
            }
            j++;
        }
        return i==n;
    }
    public static void main(String[] args) {
        String s1 = "gksrek";
        String s2 = "geeksforgeeks";
        System.out.println(check1(s1,s2));
        System.out.println(check2(s1,s2));
    }
}
