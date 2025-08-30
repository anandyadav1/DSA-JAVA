public class maximum_sum_of_non_adjacent_elements {
    //Using tabulations method
    public static int tabulations(int nums[], int n){
        if(n==0) return 0;
        if(n==1) return nums[0];
        int dp[]=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0], nums[1]);
        for(int i=2; i<n; i++){
            int include=dp[i-2]+nums[i];
            int exclude=dp[i-1]+0;
            dp[i]=Math.max(include, exclude);
        }
        return dp[n-1];
    }

    //Remove Space complexicity
    public static int spaceTC(int nums[], int n){
        if(n==0) return 0;
        if(n==1) return nums[0];
        int prev2=nums[0];
        int prev1=Math.max(nums[0], nums[1]);

        for(int i=2; i<n; i++){
            int include=prev2+nums[i];
            int exclude=prev1+0;
            int curr=Math.max(include, exclude);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 4}; //output-> 5
        // int nums[] = {2, 1, 4, 9}; //output-> 11
        System.out.println(tabulations(nums,nums.length));
        System.out.println(spaceTC(nums, nums.length));

    }
}
