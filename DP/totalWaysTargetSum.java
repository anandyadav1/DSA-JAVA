public class totalWaysTargetSum {
    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int check(int arr[], int sum) {
        int n = arr.length;
        int dp[][] = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            int value = arr[i - 1];
            for (int j = 1; j < sum + 1; j++) {
                if (value <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - value];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        print(dp);
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7 };
        int targetsum = 6;
        System.out.println();
        System.out.println("\nTotal ways of the target sum = " + check(arr, targetsum));
    }
}