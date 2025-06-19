
public class findPreefix {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        int freq;

        public Node(){
            for(int i=0; i<children.length; i++){
                children[i]=null;
            }
            freq=1;
        }
    }

    public static Node root = new Node();

    public static void insert(String words){
        Node curr=root;
        for(int i=0; i<words.length(); i++){
            int idx=words.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }else{
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }


    public static void findPrefixes(Node root, String ans){
        if(root==null){
            return;
        }
        if(root.freq == 1){
            System.out.print(ans+"  ");
            return;
        }

        for(int i=0; i<root.children.length; i++){
            if(root.children[i] != null){
                findPrefixes(root.children[i], ans +(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        String words[]={"zebra", "dog", "dove","duck","anand","adarsh", "arun","aditya","anjali","ankit","prins","kajal","alok","pallvi"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        root.freq= -1;
        findPrefixes(root, "");
    }
}
