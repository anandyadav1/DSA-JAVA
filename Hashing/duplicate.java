import java.util.HashSet;
import java.util.Scanner;

public class duplicate {
    public static String dup(String str){
        HashSet<Character> set = new HashSet<>();
        StringBuilder newStr= new StringBuilder();
        for(int i=0; i<str.length(); i++){
            set.add(str.charAt(i));
        }

        for(Character ch:set){
            newStr.append(ch);
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        System.out.println(dup(str));
    }
}
