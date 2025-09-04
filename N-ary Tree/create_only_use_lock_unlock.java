
import java.util.*;
class Node{
    int val;
    List<Node> children;
    boolean isLock;
    int isLockBy;
    Node(int val){
        this.val=val;
        this.children=new ArrayList<>();
        this.isLock=false;
        this.isLockBy=-1;
    }
}
public class create_only_use_lock_unlock {
     public static void print(Node root, int level) {
        if(root==null) return;
        for(int i=0; i<level; i++) System.out.print(" ");
        System.out.print(root.val);
        if(root.isLock) System.out.print(" [Locked by " + root.isLockBy + "]");
        System.out.println();
        for(Node child: root.children){
            print(child, level+1);
        }
    }
    public static boolean lock(Node root, int userID){
        if(root==null) return false;
        if(root.isLock || userID<0) return false;
        root.isLock=true;
        root.isLockBy=userID;
        return true;
    }
    public static boolean unLock(Node root, int userID){
        if(root==null) return false;
        if(!root.isLock || userID<0 || root.isLockBy!=userID) return false;
        root.isLock=false;
        root.isLockBy=-1;

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Relations in parent and children:");
        int n=sc.nextInt();
        Map<Integer,List<Integer>>  treeMap = new HashMap<>();
        for(int i=0; i<n; i++){
            System.out.println("Enter the value for parent:");
            int parent=sc.nextInt();
            System.out.println("Enter no count child:");
            int child=sc.nextInt();
            List<Integer> children = new ArrayList<>();
            for(int j=0; j<child; j++){
                int val=sc.nextInt();
                children.add(val);
            }
            treeMap.put(parent, children);
        }

        System.out.println("Enter the value for root:");
        int rootVal=sc.nextInt();
        Node root=new Node(rootVal);
        Map<Integer,Node> nodeMap = new HashMap<>();
        nodeMap.put(rootVal, root);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr=q.poll();
            if(treeMap.containsKey(curr.val)){
                for(int val:treeMap.get(curr.val)){
                    Node child;
                    if(nodeMap.containsKey(val)){
                        child=nodeMap.get(val);
                    }else{
                        child=new Node(val);
                        nodeMap.put(val, child);
                    }
                    curr.children.add(child);
                    q.add(child);
                }
            }
        }
        System.out.println("Now OutPut");
        lock(nodeMap.get(2), 11);
        lock(nodeMap.get(4), 12);
        unLock(nodeMap.get(2), 11);
        print(root, 0);
        System.out.println();

    }
}
