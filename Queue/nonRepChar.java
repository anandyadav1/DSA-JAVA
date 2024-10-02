import java.util.*;
public class nonRepChar {
    public static void nonRepeatingChar(String str){
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];
        System.out.print("These are all character sample one by one moving =  \n");
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while (!q.isEmpty() && freq[q.peek()-'a'] >1) {
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 +" ");
            }else{
                System.out.print(q.peek()+" ");
            }

        }
        System.out.println();
        System.out.println("\nThese character is a non repeating =  " +q.peek());

    }
    public static void main(String[] args) {
        String str="aabccxbxf";
        nonRepeatingChar(str);
    }
}
