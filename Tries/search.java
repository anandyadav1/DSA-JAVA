import java.util.*;

public class search {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String words) {
        Node curr = root;
        for (int i = 0; i < words.length(); i++) {
            int idx = words.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow==true;
    }

    public static boolean wordBreak(String word){
        if(word.length()==0){
            return true;
        }
        for(int i=1; i<=word.length(); i++){
            if(search(word.substring(0,i)) && wordBreak(word.substring(i)) ){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String words[] = { "anand", "yadav", "hello", "adarsh" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println();
        System.out.println(search("a"));
        System.out.println(search("yadav"));
        System.out.println(wordBreak("h"));
        System.out.println(wordBreak("anandyadav"));
        System.out.println(wordBreak("anandyadavs"));

    }
}
