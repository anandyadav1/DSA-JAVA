public class house_Robber_II {

    public static int solve(int nums[], int n){
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

    public static int houseRobber(int nums[]){
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int firstList[]=new int[n-1];   //In this list only 0th idx element skip and all element present
        int secondList[]=new int[n-1];   //In this list only n-1th idx element skip and all element present
        for(int i=1;i<n; i++){
            firstList[i-1]=nums[i];
        }
        for(int i=0;i<n-1; i++){
            secondList[i]=nums[i];
        }
        int case1=solve(firstList,n-1);
        int case2=solve(secondList,n-1);

        return Math.max(case1, case2);

    }
    public static void main(String[] args) {
        // int nums[] = {2,3,2};   //Output: 3
        int nums[] = {1,2,3,1};   //Output: 4
        System.out.println(houseRobber(nums));
    }
}
