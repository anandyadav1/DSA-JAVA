import java.util.Scanner;

public class sumNaturalNumber {
    public static int sum(int m){
        if(m==1){
            return 1;
        }
        return m + sum(m-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number for NAtural Sum :");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
