import java.util.Scanner;

public class Get_Ith_Bit {
    public static void findIthBit(int n, int i){
        int bitMask =1<<i;
        if((n & bitMask) == 0){
            System.out.println("Ith bit is 0 (Zero)");
        } else{
            System.out.println("Ith bit is 1 (One)");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number");
        int m=sc.nextInt();
        System.out.println("Enter the Ith bit find for "+ 35 + " number");
        int j=sc.nextInt();
        findIthBit(m, j);


    }
}
