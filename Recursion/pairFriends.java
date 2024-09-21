import java.util.Scanner;

public class pairFriends {
    public static int friendsPair(int n){
        if(n==1 || n==2){
            return n;
        }

        int fpnm1=friendsPair(n-1);

        int fpnm2 = friendsPair(n-2);
        int pairs =fpnm1 * fpnm2;

        int waysPairs = fpnm1 + pairs;

        return waysPairs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for n friends :");
        int n =sc.nextInt();
        System.out.println("Total ways of pairs  =  " +friendsPair(n));

    }
}
