public class countPartitionsWithGivenDifference {
    public static void main(String[] args) {
        // Questions
        /*
         * Given an array arr[], partition it into two subsets(possibly empty) such that
         * each element must belong to only one subset. Let the sum of the elements of
         * these two subsets be sum1 and sum2. Given a difference d, count the number of
         * partitions in which sum1 is greater than or equal to sum2 and the difference
         * between sum1 and sum2 is equal to d.
         *
         * Return the result modulo 109 + 7.
         */

        // int arr[] =  {5, 2, 6, 4}, d = 3;      //Output: 1
        // int arr[] =  {1, 1, 1, 1}, d = 0;      //Output: 6
        int arr[] =  {1, 2, 1, 0, 1, 3, 3}, d =11;      //Output: 2

        int n=arr.length;
        int sum=0;
        for(int val:arr) sum +=val;
        if((sum+d)%2 !=0) System.out.println(0);
        int target=(sum+d)/2;
        int mod=(int)1e9+7;
        int dp[][]=new int[n+1][target+1];
        for(int i=0; i<=n; i++)dp[i][0]=1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<=target; j++){
                dp[i][j]=dp[i-1][j];
                if(arr[i-1]<=j){
                    dp[i][j]=(dp[i][j]+dp[i-1][j-arr[i-1]])%mod;
                }
            }
        }
        System.out.println(dp[n][target]);
    }
}
