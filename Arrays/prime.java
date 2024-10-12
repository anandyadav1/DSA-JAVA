import java.util.Scanner;

public class prime {

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    public static void isCount(int n){
        int count=0;
        System.out.print("These number are prime :   ");
        for(int i=0; i<=n; i++){
            if(isPrime(i)){
                count++;
                System.out.print(i+"  ");
            }
        }
        System.out.println();

        System.out.println("Total prime count =   "  +count);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=sc.nextInt();
        // System.out.println(
            isCount(n);
    }
}
