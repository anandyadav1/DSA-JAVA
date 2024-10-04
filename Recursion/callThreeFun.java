import java.util.Scanner;

public class callThreeFun {

    public static int pattern(long n){
        if(n==1){
            return 1;
        }

        return pattern(n-1)+pattern(n-1)+pattern(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number :");
        long n= sc.nextInt();
        System.out.println("Sum by tree recurion =  " +pattern(n));
    }
}
