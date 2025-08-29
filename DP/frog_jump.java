public class frog_jump {
    public static void main(String[] args) {
        int a[]={20, 30, 40, 20};
        int n=a.length;
        int dp[]=new int[n];
        dp[0]=0;
        if(n>1) dp[1]=Math.abs(a[1]-a[0]);
        for(int i=2; i<n; i++){
            int oneStep=dp[i-1]+Math.abs(a[i]-a[i-1]);
            int twoStep=dp[i-2]+Math.abs(a[i]-a[i-2]);
            dp[i]=Math.min(oneStep,twoStep);
        }
        System.out.println(dp[n-1]);
    }
}
