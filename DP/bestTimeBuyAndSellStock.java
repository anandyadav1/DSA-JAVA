public class bestTimeBuyAndSellStock {
    public static void main(String[] args) {
        // Questions
        /*
         * You are given an array prices where prices[i] is the price of a given stock
         * on the ith day.
         * You want to maximize your profit by choosing a single day to buy one stock
         * and choosing a different day in the future to sell that stock.
         * Return the maximum profit you can achieve from this transaction. If you
         * cannot achieve any profit, return 0.
         */

        // int prices[] = {7,1,5,3,6,4};    //Output: 5
        int prices[] = {7,6,4,3,1};    //Output: 0
        if(prices==null || prices.length<=1) {
            System.out.println(0);
        }
        int n=prices.length;
        int dp[]=new int[n+1];
        int minPrice=prices[0];
        int profit=0;
        dp[0]=profit;
        for(int i=1; i<n+1; i++){
            minPrice=Math.min(minPrice,prices[i-1]);
            dp[i]=Math.max(dp[i-1],prices[i-1]-minPrice);
        }
        System.out.println(dp[n]);
    }
}
