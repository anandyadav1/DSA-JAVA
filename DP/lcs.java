import java.util.Scanner;
import java.util.*;

public class lcs {
    public static int recursion(String str1, int i, String str2,int j){
        if(i==0 || j==0){
            return 0;
        }
        if(str1.charAt(i-1)==str2.charAt(j-1)){
            return recursion(str1, i-1, str2, j-1) + 1;
        }else{
            int ans1=recursion(str1, i-1, str2, j);
            int ans2=recursion(str1, i, str2, j-1);

            return Math.max(ans1,ans2);
        }
    }

    public static int memuizations(String str1, int i, String str2,int j, int dp[][]){
        if(i==0 || j==0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(str1.charAt(i-1)==str2.charAt(j-1)){
            return dp[i][j]=recursion(str1, i-1, str2, j-1) + 1;
        }else{
            int ans1=recursion(str1, i-1, str2, j);
            int ans2=recursion(str1, i, str2, j-1);

            return dp[i][j]=Math.max(ans1,ans2);
        }
    }

    public static int tabulations(String str1, String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("start for 1 And stop for 0");
            int choice=sc.nextInt();
            sc.nextLine();
            if(1==choice){
                System.out.println("Enter the first String :");
                String str1=sc.nextLine();
                System.out.println("Enter the second String :");
                String str2=sc.nextLine();
                System.out.println("By recursion");
                System.out.println(recursion(str1,str1.length(),str2,str2.length()));
                int dp[][]=new int[str1.length()+1][str2.length()+1];
                for(int row[]:dp){
                    Arrays.fill(row,-1);
                }
                System.out.println("By memuizations");
                System.out.println(memuizations(str1,str1.length(),str2,str2.length(), dp));
                System.out.println("By tabulations");
                System.out.println(tabulations(str1,str2));
            }else{
                break;
            }
        }
    }
}
