import java.util.Scanner;

public class increasingOrder {
    public static void printDecreasingOrder(int n){
        if(n==1){
            System.out.print(n+"  ");
            return;
        }
        printDecreasingOrder(n-1);
        System.out.print(n+"  ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number for decreasing order:");
        int n =sc.nextInt();
        printDecreasingOrder(n);

    }
}
