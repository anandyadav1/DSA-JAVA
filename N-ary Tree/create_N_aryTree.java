
import java.util.*;

class Node {
    int val;                        // node ka value
    List<Node> children;            // iske child nodes

    Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}
public class create_N_aryTree {

     public static void printTree(Node node, int level) {
        if (node == null) return;

        // Indentation ke liye
        for (int i = 0; i < level; i++) System.out.print("   ");
        System.out.println(node.val);

        for (Node child : node.children) {
            printTree(child, level + 1);
        }
    }
    public static void main(String[] args) {
        // Root node banaya
        Node root = new Node(1);

        // Root ke children banaye
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);

        // Root me children add kar diye
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        // Ab child2 ke bhi children banate hain
        Node child21 = new Node(5);
        Node child22 = new Node(6);
        child2.children.add(child21);
        child2.children.add(child22);

        // Output print karte hain
        printTree(root, 0);
    }
}