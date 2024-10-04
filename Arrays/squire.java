import java.util.*;

public class squire {

    public static boolean squireFun(int n){
        int i=1, j=n;
        while (i<j) {
            int sum=0;
            sum =i*i + j*j;
            if(sum == n){
                return true;
            }
            if(sum > n){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number :");
        int n=sc.nextInt();
        System.out.println(squireFun(n));
    }
}
