import java.util.*;
public class sentense {
    public static boolean isVowel(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        return set.contains(s.charAt(0));
    }

    public static String rev(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "That is a good elephant after bad apple";

        String arr[] = str.split(" ");
        for(String word:arr){
            System.out.print(word+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                arr[i] = rev(arr[i]);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            ans.append(arr[i]);
            ans.append(" ");
        }

        System.out.println(ans);
    }
}
