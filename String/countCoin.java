import java.util.Scanner;

public class countCoin {
    public static int isCount(String str, String n){
        String st[] =str.split(",");
        int count=0;
        for(int i=0; i<st.length; i++){
            if(st[i].trim().equals(n)){
                count++;
            }
        }

        return count;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the any number:");
        String str=sc.nextLine();
        System.out.println("Enter the any one number for coin :");
        String n=sc.nextLine();
        System.out.println(isCount(str, n));
    }
}
