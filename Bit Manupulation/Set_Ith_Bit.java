import java.util.Scanner;

public class Set_Ith_Bit {
    public static int SetIthBit(int n, int i){
        //i is position index
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number for Set ith number ");
        int m= sc.nextInt();
        System.out.println("enter the ith number");
        int j=sc.nextInt();
        System.out.println(SetIthBit(m, j));

    }
}
