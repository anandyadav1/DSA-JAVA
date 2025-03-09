import java.util.Scanner;

public class countBST {
    public static int tabulations(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<n+1; i++){
            for(int j=0; j<i; j++){
                int left=dp[j];
                int right=dp[i-j-1];
                dp[i] +=left*right;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the any number for node :");
        int n=sc.nextInt();
        System.out.println("Total type of the BST created : "+tabulations(n));
    }
}
