import java.util.*;

public class knapShak {

    public static int recursion(int value[], int wt[], int W, int n){
        if(n==0 || W==0){
            return 0;
        }

        if(wt[n-1]<=W){
            //include
            int ans1=value[n-1]+recursion(value, wt, W-wt[n-1], n-1);
            //exclude
            int ans2=recursion(value, wt, W, n-1);

            return Math.max(ans1,ans2);
        }else{
            return recursion(value, wt, W, n-1);
        }
    }

    public static int memuizations(int value[], int wt[], int W, int n, int dp[][]){
        if(n==0 || W==0){
            return 0;
        }

        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){
            //include
            int ans1=value[n-1]+recursion(value, wt, W-wt[n-1], n-1);
            //exclude
            int ans2=recursion(value, wt, W, n-1);
            dp[n][W]=Math.max(ans1,ans2);
            return dp[n][W];
        }else{
            dp[n][W] =recursion(value, wt, W, n-1);
            return dp[n][W];
        }
    }

    public static int tabulations(int v[], int wt[], int W){
        int dp[][]=new int[v.length+1][W+1];
        for(int i=1; i<v.length+1; i++){
            int val=v[i-1];
            int w=wt[i-1];
            for(int j=1; j<W+1; j++){
                if(w<=j){
                    int include=val+dp[i-1][j-w];
                    int exclude=dp[i-1][j];
                    dp[i][j]=Math.max(include,exclude);
                }else{
                    int exclude=dp[i-1][j];
                    dp[i][j]=exclude;
                }
            }
        }

        print(dp);
        return dp[v.length][W];
    }

    public static void print(int dp[][]){
        for(int n[]:dp){
            for(int num:n){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int value[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int dp[][]=new int[value.length+1][W+1];
        for(int dpr[]:dp){
            Arrays.fill(dpr,-1);
        }
        System.out.println("Using recursion ");
        System.out.println("Maxmium weight =  "+recursion(value, wt, W, value.length));
        System.out.println("Using Memuizations ");
        System.out.println("Maxmium weight =  "+memuizations(value, wt, W, value.length,dp));
        System.out.println("Using Tabulations ");
        System.out.println("Maxmium weight =  "+tabulations(value, wt, W));
    }
}
