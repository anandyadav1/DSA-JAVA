import java.util.Scanner;

public class factoral {
    public static int printFactorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=printFactorial(n-1);
        int fn= n * printFactorial(n-1);
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number for factorial :");
        int n= sc.nextInt();
        System.out.println(printFactorial(n));

    }
}
