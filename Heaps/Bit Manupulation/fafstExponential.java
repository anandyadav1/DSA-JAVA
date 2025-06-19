import java.util.Scanner;

public class fafstExponential {
    public static int fastexponential(int a, int n){
        int ans =1;
        while(n> 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any num for base: ");
        int a= sc.nextInt();
        System.out.println( "Enter the any number for power: ");
        int n= sc.nextInt();
        System.out.println("Your answer is a power exponential:");
        System.out.println(fastexponential(a, n));
    
    }
}
