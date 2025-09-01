public class targetSum2 {
    public static void main(String[] args) {
        // Questions
        /*
         * Given an array of integers A[] of length N and an integer target.
         * You want to build an expression out of A by adding one of the symbols '+' and
         * '-' before each integer in A and then concatenate all the integers.
         * 
         * For example, if arr = {2, 1}, you can add a '+' before 2 and a '-' before 1
         * and concatenate them to build the expression "+2-1".
         * Return the number of different expressions that can be built, which evaluates
         * to target and return your answer with modulo 109+7.
         */

        int A[] = {1, 1, 1, 1, 1}, target = 3;    //Output: 5
        // int A[] = {1}, target = 1;    //Output: 1
        int N=A.length;

        int sum=0;
        for(int val : A) sum +=val;
        if((sum+target)%2 != 0 || (sum+target)<0) System.out.println(0);;
        int targetSubset=(sum+target)/2;
        int mod=(int)1e9+7;
        int dp[][]=new int[N+1][targetSubset+1];
        for(int i=0; i<=N; i++)dp[i][0]=1;
        for(int i=1; i<=N; i++){
            for(int j=0; j<=targetSubset; j++){
                dp[i][j]=dp[i-1][j];
                if(A[i-1]<=j){
                    dp[i][j]=(dp[i][j] + dp[i-1][j-A[i-1]])%mod;
                }
            }
        }
        System.out.println(dp[N][targetSubset]);
    }
}
