


import java.util.Scanner;

public class reverse {

    //using long process
    public static void call1(String str){
        int i=0;
        int j=str.length()-1;
        StringBuilder sb= new StringBuilder(str);
        while(i<j){
            char temp= sb.charAt(i);
            char temp1=sb.charAt(j);
            sb.setCharAt(i, temp1);
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(sb);
    }


    //Using sort way
    public static String call(String str){
        StringBuilder sb = new StringBuilder(str);
        str= sb.reverse().toString();
        return str;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the String :");
        String str=sc.nextLine();
        int n= str.length();
        System.out.println(call(str));
        // call1(str);
        System.out.println(n);
    }
}
