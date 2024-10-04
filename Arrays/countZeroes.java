import java.util.Scanner;

public class countZeroes {

    public static int countZero(int n){
        int count=0;
        if(n%10==0){
            count++;
        }
        return count;

    }

    public static int count(int n){
        if(n==0){
            return 1;
        }
        int count=0;
        for(int i=1; i<=n; i++){
            count +=countZero(i);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the any number :");
        int n= sc.nextInt();
        System.out.println(count(n));

    }
}
