import java.util.Scanner;

public class sumdigit {
    public static int sumDigits(int n){
        if(n==0){
            return 0;
        }
        int digit=n%10;
        int sum=digit+sumDigits(n/10);
        return sum;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number :");
        int n= sc.nextInt();
        System.out.println("It's sum of digits =  " +sumDigits(n));
    }
}
