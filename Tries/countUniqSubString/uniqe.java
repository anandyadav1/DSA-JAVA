
public class uniqe {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
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

    public static int countNode(Node root){
        if(root==null){
            return 0;
        }

        int count=0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count +=countNode(root.children[i]);
            }
        }
        return count+1;
    }


    //Largset word in prefixes

    static String ans=" ";

    public static String largest(Node root, StringBuilder temp){
        if(root == null){
            return null;
        }

        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans=temp.toString();
                }
                largest(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String words[]={"a", "banana", "appl","app",  "ap", "apply", "apple"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(largest(root, new StringBuilder(" ")));
    }
}
