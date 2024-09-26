import java.util.Scanner;

public class ways {
    public static int  gridWays(int i, int j, int n, int m){
        //Base case
        if(i==n-1 && j==m-1){ //condition left call
            return 1;
        }else if(i==n || j==n){
            return 0;      //Boundary cross condition
        }

        int ways1=gridWays(i+1, j, n, m);
        int ways2 =gridWays(i, j+1, n, m);

        int totalWays=ways1+ways2;

        return totalWays;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for row :");
        int n=sc.nextInt();
        System.out.println("Enter the value for column :");
        int m=sc.nextInt();
        System.out.println("Total ways = "+gridWays(0, 0, n, m));
    }
}
