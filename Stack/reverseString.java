import java.util.Stack;

public class reverseString {
    public static String reverse(String str){
        Stack<Character> s =new Stack<>();
        StringBuilder newStr = new StringBuilder(" ");
        int i=0;
        while (i != str.length()) {
            char currChar=str.charAt(i);
            s.push(currChar);
            i++;
        }

        while (!s.isEmpty()) {
            newStr.append(s.pop());
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("anand"));
        // reverse("anand");
    }
}
