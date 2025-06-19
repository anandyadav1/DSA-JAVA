import java.util.*;
public class insert {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;  //end of row
        public Node(){
            for(int i=0; i<26; i++){
                children[i]=null;
            }
        }
    }

    public  static Node root=new Node();

    public static void insert(String words){
        Node curr=root;
        for(int level=0; level<words.length(); level++){
            int idx=words.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static void main(String[] args) {
        String words[]={"anand", "anandyadav", "yadavji", "adarsh", "maurya"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
    }
}
