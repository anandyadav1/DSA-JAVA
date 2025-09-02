public class buySellwithCooldown {
    public static void main(String[] args) {
        // Questions
        /*
         * You are given the prices of stock for n number of days. every ith day tell
         * the price of the stock on that day. find the maximum profit that you can make
         * by buying and selling stock with the restriction of After you sell your
         * stock, you cannot buy stock on the next day (i.e., cooldown one day).
         */

        int prices[] = {1,2,3,0,2};     //Output: 3
        int n=prices.length;
        int buy=-prices[0];
        int sell=0;
        int prevSell=0;

        for(int i=1; i<n; i++){
            int temp=sell;
            sell=Math.max(sell, buy+prices[i]);
            buy=Math.max(buy, prevSell-prices[i]);
            prevSell=temp;
        }
        System.out.println(sell);
    }
}
