public class rodCutting {

    public static int tabulations(int price[], int length[], int totalRod){
        int n=price.length;
        int dp[][]=new int[n+1][totalRod+1];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<totalRod+1; j++){
                if(length[i-1]<=j){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-length[j-1]], dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        for(int row[]:dp){
            for(int r:row){
                System.out.print(r+" ");
            }
            System.out.println();
        }
        return dp[n][totalRod];
    }
    public static void main(String[] args) {
        int price[]={1,5,8,9,10,17,17,20};
        int length[]={1,2,3,4,5,6,7,8};
        int totalRod=8;

        System.out.println(tabulations(price,length,totalRod));
    }
}
