import java.util.Scanner;

public class Clear_ith_Bit {
    public static int clearIthBit(int m, int j){
        int bitMask = ~(1<<1);
        return m & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number for clear ith bit ");
        int n= sc.nextInt();
        System.out.println("Enter the any number for any index number");
        int i=sc.nextInt();
        System.out.println(clearIthBit(n, i));

    }
}
