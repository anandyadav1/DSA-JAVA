
import java.util.*;
class Node{
    int val;
    List<Node> children;
    Node(int v){
        this.val=v;
        this.children=new ArrayList<>();
    }
}
public class create_Using_Dynamic {
    public static void print(Node root, int level){
        if(root==null) return;
        for(int i=0; i<level; i++) System.out.print(" ");
        System.out.println(root.val);
        for(Node child:root.children){
            print(child, level+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for How man level for node:");
        int n=sc.nextInt();
        Map<Integer,List<Integer>> treeMap=new HashMap<>();
        for(int i=0; i<n; i++){
            System.out.println("Enter the value for parent:");
            int parent=sc.nextInt();
            System.out.println("Enter the value for how many children:");
            int child=sc.nextInt();
            List<Integer> children = new ArrayList<>();
            for(int j=0; j<child; j++){
                int val=sc.nextInt();
                children.add(val);
            }
            treeMap.put(parent, children);
        }

        System.out.println("Enter the value for root Node:");
        int rootVal=sc.nextInt();
        Node root=new Node(rootVal);
        Map<Integer,Node> nodeMap = new HashMap<>();
        nodeMap.put(rootVal, root);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr=q.poll();
            if(treeMap.containsKey(curr.val)){
                for(int childVal:treeMap.get(curr.val)){
                    Node child;
                    if(nodeMap.containsKey(childVal)){
                        child=nodeMap.get(childVal);
                    }else{
                        child=new Node(childVal);
                        nodeMap.put(childVal, child);
                    }
                    curr.children.add(child);
                    q.add(child);
                }
            }
        }

        print(root,0);
    }
}
