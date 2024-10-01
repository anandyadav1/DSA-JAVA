import java.util.Stack;

public class isDuplicateParenthesis {
    public static boolean isDuplicate(String str){
        Stack<Character> s =new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            // for closing parenthesis ")"
            if(ch==')'){
                int count =0;
                while (s.peek() != '(') {
                    s.pop();
                    count ++;
                }
                if(count < 1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="(a+b)";
        String str2="((a+b))";
        String str3="((a+b)+(c+d))";
        String str4="(((a+b)+(c+d)))";
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
        System.out.println(isDuplicate(str3));
        System.out.println(isDuplicate(str4));

    }
}
