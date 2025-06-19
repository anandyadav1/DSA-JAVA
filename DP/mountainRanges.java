import java.util.Scanner;

public class mountainRanges {
    public static long tabulations(long n) {
        long dp[] = new long[(int) (n + 1)];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                long inside = dp[j];
                long outside = dp[i - j - 1];
                dp[i] += inside * outside;
            }
        }
        return dp[(int) n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Mountain pairs: ");
        long n = sc.nextLong(); // Use nextLong() for larger values
        System.out.println("Total mountain ranges: " + tabulations(n));
    }
}
