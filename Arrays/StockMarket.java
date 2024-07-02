public class StockMarket {

    public static int buyAndSellStocks(int prices[]){

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;

                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        // int prices[] = {9, 8 , 7, 6, 5, 5, 4, 3, 2 };
        // int prices[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int prices[] = {6, 8, 5, 1, 4, 7, 3, 2, 9};
        System.out.println(buyAndSellStocks(prices));
    }
}
