import java.util.*;
class Node{
    int data;
    Node l;
    Node r;
    Node(int v){this.data=v;}
}
public class transformToSumTree {
    public static int transformToSumOfTree(Node root){
        if(root==null) return 0;
        int lr=transformToSumOfTree(root.l);
        int rr=transformToSumOfTree(root.r);
        int data=root.data;
        int newl=(root.l==null) ? 0 : root.l.data;
        int newr=(root.r==null) ? 0 : root.r.data;

        root.data=lr+rr+newl+newr;

        return data;
    }
    public static void preeOrder(Node root){
        if(root!=null){
            System.out.print(root.data+"  ");
            preeOrder(root.l);
            preeOrder(root.r);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.l=new Node(2);
        root.r=new Node(3);
        root.l.l=new Node(4);
        root.l.r=new Node(5);
        root.r.l=new Node(6);
        root.r.r=new Node(7);
        System.out.println("Without Transform sum of Tree:");
        preeOrder(root);
        transformToSumOfTree(root);
        System.out.println("\nAfter Transform sum of Tree:");
        preeOrder(root);
    }
}
