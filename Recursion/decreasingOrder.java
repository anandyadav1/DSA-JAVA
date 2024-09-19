import java.util.Scanner;

public class decreasingOrder {
    public static void printDescendingOrderNo(int n){
        //Base case
        if(n==1){
            System.out.print(n+ " ");
            return;
        }
        System.out.print(n+ " ");
        printDescendingOrderNo(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the any number for printing number :");
        int number=sc.nextInt();
        printDescendingOrderNo(number);

    }
}
