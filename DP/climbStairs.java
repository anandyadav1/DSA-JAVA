import java.util.Scanner;

public class climbStairs {

    // By recursion
    public static int countWaysByRecursion(int n) { // O(2^n)
        if (n == 0 ) {
            return 1;
        }
        if(n<0){
           return 0;
        }
        return countWaysByRecursion(n - 1) + countWaysByRecursion(n - 2);
    }

    // By Menoziation
    public static int countWaysByMenoziation(int n) { // O(n)
        if (n == 0 ) {
            return 1;
        }
        
        if(n<0){
            return 0;
        }
        int dp[] = new int[n + 1];
        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = countWaysByMenoziation(n - 1) + countWaysByMenoziation(n - 2);
        return dp[n];
    }

    // By Tabulations
    public static int countWaysByTabulations(int n) { // O(n)
        if (n == 0 || n==1) {
            return 1;
        }

        if(n<0){
            return 0;
        }
        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number:");
        int n = sc.nextInt();
        System.out.println(countWaysByRecursion(n));
        System.out.println(countWaysByMenoziation(n));
        System.out.println(countWaysByTabulations(n));

    }
}
