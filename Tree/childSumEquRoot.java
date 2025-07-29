import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        this.data=d;
    }
}
public class childSumEquRoot {
    public static boolean check(Node root) {
        if (root == null || root.left == null && root.right == null)
            return true;

        int ls = (root.left != null) ? root.left.data : 0;
        int rs = (root.right != null) ? root.right.data : 0;

        if (root.data != ls + rs)
            return false;

        return check(root.left) && check(root.right);
    }

    public static int isSumProperty(Node root) {
        return (check(root) == true) ? 1 : 0;
    }
    public static void main(String[] args) {
        Node root = new Node(35);
        root.left = new Node(20);
        root.right = new Node(15);

        root.left.left = new Node(15);
        root.left.right = new Node(5);

        root.right.left = new Node(10);
        root.right.right = new Node(5);
        System.out.println(isSumProperty(root));
    }
}