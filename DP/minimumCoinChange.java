public class minimumCoinChange {
    public static void main(String[] args) {
        // Questions
        /*
         * You are given an array coins[], where each element represents a coin of a
         * different denomination, and a target value sum. You have an unlimited supply
         * of each coin type {coins1, coins2, ..., coinsm}.
         * Your task is to determine the minimum number of coins needed to obtain the
         * target sum. If it is not possible to form the sum using the given coins,
         * return -1.
         */

        int coins[] = {25, 10, 5}, sum = 30;   //Output: 2    Explanation: Minimum 2 coins needed, 25 and 5
        // int coins[] = {9, 6, 5, 1}, sum = 19;   //Output: 3    Explanation: 19 = 9 + 9 + 1
        // int coins[] = {5, 1}, sum = 0;   //Output: 0    Explanation: For 0 sum, we do not need a coin
        // int coins[] = {4, 6, 2}, sum = 5;   //Output: -1    Explanation: Not possible to make the given sum.

        int n=coins.length;
        int INF=sum+1;
        int dp[][]=new int[n+1][sum+1];
        for(int i=0; i<=sum; i++) dp[0][i]=INF;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(coins[i-1]<=j){
                    dp[i][j]=Math.min(dp[i][j-coins[i-1]]+1, dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

       int ans=(dp[n][sum]>sum) ? -1 : dp[n][sum];
       System.out.println(ans);
    }
}
