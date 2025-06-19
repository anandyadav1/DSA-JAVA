import java.util.Scanner;
import java.util.*;


public class catalan {
    public static int recursion(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans=0;
        for(int i=0; i<n; i++){
            ans +=recursion(i)*recursion(n-i-1);
        }
        return ans;
    }

    public static int memuization(int n, int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=0;
        for(int i=0; i<=n-1; i++){
            ans +=memuization(i,dp)*memuization(n-i-1,dp);
        }
        return dp[n]=ans;
    }

    public static int tabulations(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<n+1; i++){
            for(int j=0; j<i; j++){
                dp[i] +=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number for catalan number :");
        int n=sc.nextInt();
        System.out.println("Catalan number for "+n+" using recursion "+" : "+recursion(n));
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("Catalan number for "+n+" using memuizations "+" : "+memuization(n,dp));
        System.out.println("Catalan number for "+n+" using tabulations "+" : "+tabulations(n));
    }
}
