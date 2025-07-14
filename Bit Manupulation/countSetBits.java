import java.util.Scanner;

public class countSetBits {
    public static int countsetBits(int m){
        int count =0;
        while(m>0){
            if((m & 1) != 0){
                count ++;
            }
            m=m>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number ");
        int n= sc.nextInt();
        System.out.println(countsetBits(n));

    }
}
