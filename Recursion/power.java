import java.util.Scanner;

public class power {
    public static int printPower(int x, int n){
        if(n==0){
            return 1;
        }
        // int Pnm1 =printPower(x, n-1);
        // int PowerN= x*Pnm1;
        // return PowerN;


        //OR

        return x * printPower( x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number for base X:");
        int x = sc.nextInt();
        System.out.println("Enter the any number for power n:");
        int n = sc.nextInt();
        System.out.println("This is the anser for given value: " +printPower(x, n));
    }
}
