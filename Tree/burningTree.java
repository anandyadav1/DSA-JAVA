
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        this.data=d;
    }
}
public class burningTree {
    public static Node findTar(Node root, int tar){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.data == tar) return curr;
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        return null;
    }

    public static void findPar(Node root, Map<Node, Node> par){
        if(root == null) return;
        if(root.left != null) par.put(root.left, root);
        if(root.right != null) par.put(root.right, root);
        findPar(root.left, par);
        findPar(root.right, par);
    }

    public static int minTime(Node root, int target) {
        int burnTime = 0;
        Map<Node, Node> par = new HashMap<>();
        findPar(root, par);
        Set<Node> vis = new HashSet<>();
        Node tar = findTar(root, target);
        Queue<Node> q = new LinkedList<>();
        q.add(tar);
        vis.add(tar);

        while(!q.isEmpty()){
            int s = q.size();
            boolean check = false; 
            for(int i = 0; i < s; i++){
                Node curr = q.poll();
                if(curr.left != null && !vis.contains(curr.left)){
                    q.add(curr.left);
                    vis.add(curr.left);
                    check = true;
                } 
                if(curr.right != null && !vis.contains(curr.right)){
                    q.add(curr.right);
                    vis.add(curr.right);
                    check = true;
                } 
                if(par.containsKey(curr) && !vis.contains(par.get(curr))) {
                    q.add(par.get(curr));
                    vis.add(par.get(curr));
                    check = true;
                }
            }
            if(check) burnTime++;
        }

        return burnTime;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int target=2;

        System.out.println(minTime(root, target));
    }
}