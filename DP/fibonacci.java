import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {

    //By recursion
    public static int fibByRecursion(int n){            //O(2^n)
        if(n==0 || n==1){
            return n;
        }
        return fibByRecursion(n-1)+fibByRecursion(n-2);
    }


    //By Menoziation
    public static int fibByMenoziation(int n){          //O(n)
        if(n==0 || n==1){
            return n;
        }
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        if(dp[n] != -1){
            return dp[n];
        }

        dp[n]=fibByMenoziation(n-1) + fibByMenoziation(n-2);
        return dp[n];
    }


    //By Tabulations
    public static int fibByTabulations(int n){                //O(n)
        if(n==0 || n==1){
            return n;
        }
        int dp[]=new int[n+1];

        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<=n; i++){
            dp[i]=dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number:");
        int n=sc.nextInt();
        System.out.println(fibByRecursion(n));
        System.out.println(fibByMenoziation(n));
        System.out.println(fibByTabulations(n));
    }
}
