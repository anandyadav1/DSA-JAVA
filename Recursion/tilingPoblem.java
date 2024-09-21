import java.util.Scanner;

public class tilingPoblem {
    public static int tilingPoblems(int n){
        if(n==0 || n==1){
            return 1;
        }

        //VerticalJJ
        int Tnm1 = tilingPoblems(n-1);

        //HoraZontal 
        int Tnm2 = tilingPoblems(n-2);
        int toWays =Tnm1 + Tnm2;

        return toWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the any number for floor base:");
        int n= sc.nextInt();
        System.out.println("Total Ways =  "+tilingPoblems(n));
    }
}
