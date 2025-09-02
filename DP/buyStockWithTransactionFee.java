public class buyStockWithTransactionFee {
    public static void main(String[] args) {
        // Questions
        /*
         * You are given an array arr[], in which arr[i] is the price of a given stock
         * on the ith day and an integer k represents a transaction fee. Find the
         * maximum profit you can achieve. You may complete as many transactions as you
         * like, but you need to pay the transaction fee for each transaction.
         * Note: You may not engage in multiple transactions simultaneously (i.e., you
         * must sell the stock before you buy again).
         */

        int prices[] = {6, 1, 7, 2, 8, 4}, fee = 2;   //Output: 8
        //Explanation:
        //Buy the stock on day 2 and sell it on day 3 => 7 – 1 -2 = 4
        //Buy the stock on day 4 and sell it on day 5 => 8 – 2 - 2 = 4
        //Maximum Profit  = 4 + 4 = 8

        // int prices[] = {7, 1, 5, 3, 6, 4}, fee = 1;   //Output: 5

        int n=prices.length;
        int hold=-prices[0];
        int notHold=0;
        for(int i=1; i<n; i++){
            hold=Math.max(hold,notHold-prices[i]);
            notHold=Math.max(notHold, hold+prices[i]-fee);
        }
        System.out.println(notHold);
    }
}
