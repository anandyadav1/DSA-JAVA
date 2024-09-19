import java.util.Scanner;

public class fibonacciSerieas {
    public static int fibbonacci(int n){
    if(n==0 || n==1){
        return n;
    }
    int fibnm1 = fibbonacci(n-1);
    int fibnm2 = fibbonacci(n-2);
    int fibn = fibnm1 + fibnm2;
    return fibn;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ennter the any type of number :");
        int n = sc.nextInt();
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(n));
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(2));
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(3));
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(4));
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(5));
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(6));
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(7));
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(8));
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(9));
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(10));
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(20));
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(25));
        System.out.println("This is the fibonacci serieas=  " + fibbonacci(26));
    }
}
