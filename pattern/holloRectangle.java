import java.util.Scanner;

public class holloRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for row");
        int row=sc.nextInt();
        System.out.println("Enter the value for column");
        int column=sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(i==0 || i==row-1 ||  j==0 || j==column-1){
                    System.out.print("4");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
