


import java.util.Scanner;

public class reverse {

    public static String call(String str){
        StringBuilder sb = new StringBuilder(str);
        str= sb.reverse().toString();
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the String :");
        String str=sc.nextLine();
        System.out.println(call(str));
    }
}
