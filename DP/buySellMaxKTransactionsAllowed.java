public class buySellMaxKTransactionsAllowed {
    public static void main(String[] args) {
        // Questions
        /*
         * In the stock market, a person buys a stock and sells it on some future date.
         * You are given an array prices[] representing stock prices on different days
         * and a positive integer k, find out the maximum profit a person can make in
         * at-most k transactions.
         * A transaction consists of buying and subsequently selling a stock and new
         * transaction can start only when the previous transaction has been completed.
         */
        // int prices[] = {10, 22, 5, 80}, k = 2; //Output: 87
        int prices[] = { 3, 2, 6, 5, 0, 3 }, k = 2; // Output: 7
        // int prices[] = {20, 580, 420, 900}, k = 3; //Output: 1040
        // int prices[] = {100, 90, 80, 50, 25}, k = 1; //Output: 0
        // int prices[] = {100, 90, 80, 50, 25}, k = 1; //Output: 0

        int n = prices.length;
        int maxProfit = 0;
        if (k >= (n / 2)) {
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxProfit += prices[i] - prices[i - 1];
                }
            }
            System.out.println(maxProfit);
            return;
        }

        int dp[][] = new int[k + 1][n];
        for (int i = 1; i <= k; i++) {
            int maxDiff = -prices[0];
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[i - 1][j] - prices[j]);
            }
        }
        System.out.println(dp[k][n - 1]);
    }
}
