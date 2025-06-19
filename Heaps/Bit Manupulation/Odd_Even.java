import java.util.*;

public class Odd_Even {
    public static void check(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 1) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number");
        int n = sc.nextInt();
        check(n);

    }
}
