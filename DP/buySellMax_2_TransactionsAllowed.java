public class buySellMax_2_TransactionsAllowed {
    public static void main(String[] args) {
        // Questions
        /*
         * You are given an array prices where prices[i] is the price of a given stock
         * on the ith day.
         * Find the maximum profit you can achieve. You may complete at most two
         * transactions.
         * Note: You may not engage in multiple transactions simultaneously (i.e., you
         * must sell the stock before you buy again).
         */

        int prices[] = {3,3,5,0,0,3,1,4};     //Output: 6
        //Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
        //Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.

        // int prices[] = {1,2,3,4,5};      //Output: 4
        // int prices[] = {7,6,4,3,1};      //Output: 0

        int t1_Buy=Integer.MIN_VALUE;
        int t1_Sell=0;
        int t2_Buy=Integer.MIN_VALUE;
        int t2_Sell=0;

        for(int price:prices){
            t1_Buy=Math.max(t1_Buy, -price);
            t1_Sell=Math.max(t1_Sell, t1_Buy+price);
            t2_Buy=Math.max(t2_Buy, t1_Sell-price);
            t2_Sell=Math.max(t2_Sell, t2_Buy+price);
        }
        System.out.println(t2_Sell);
    }
}
