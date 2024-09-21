import java.util.Scanner;

public class powerOptimise {
    public static int powerOptimises(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = powerOptimises(x, n/2);
        int halfPowerSquire = halfPower * halfPower;

        // For odd   if n is a odd number 
        if(n % 2 != 0){
            halfPowerSquire = x * halfPowerSquire;
        }

        return halfPowerSquire;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number for Base of X :");
        int x = sc.nextInt();
        System.out.println("Enter the any number for power of n :");
        int n = sc.nextInt();
        System.out.println("This is the any power of expression =  " + powerOptimises(x, n));
    }
}
