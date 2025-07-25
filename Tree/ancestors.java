import java.util.*;

class Node {
    int data;
    Node l;
    Node r;

    Node(int v) {
        this.data = v;
    }
}

public class ancestors {

    public static boolean ancestor(Node root, int n, ArrayList<Integer> path) {
        if (root == null)
            return false;
        path.add(root.data);
        if (root.data == n)
            return true;
        boolean lr = ancestor(root.l, n, path);
        boolean rr = ancestor(root.r, n, path);
        if (lr || rr)
            return true;
        path.remove(path.size() - 1);

        return false;
    }

    public static int findAncestor(Node root, int n1, int n2) {
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ancestor(root, n1, p1);
        ancestor(root, n2, p2);
        int i = 0;
        for (; i < p1.size() && i < p2.size(); i++) {
            if (p1.get(i) != p2.get(i))
                break;
        }
        return p1.get(i - 1);
    }

    public static boolean kthAncestor(Node root, int n, ArrayList<Integer> path) {
        if (root == null)
            return false;
        path.add(root.data);
        if (root.data == n)
            return true;
        boolean lr = kthAncestor(root.l, n, path);
        boolean rr = kthAncestor(root.r, n, path);
        if (lr || rr)
            return true;
        path.remove(path.size() - 1);

        return false;
    }

    public static int findKthLevelAncestor(Node root, int n, int kth) {
        ArrayList<Integer> p = new ArrayList<>();
        kthAncestor(root, n, p);
        kth = p.size() - 1 - kth;
        return p.get(kth);
    }

    public static Node ancestors1(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2)
            return root;

        Node lr = ancestors1(root.l, n1, n2);
        Node rr = ancestors1(root.r, n1, n2);

        if (lr == null)
            return rr;
        else if (rr == null)
            return lr;
        else return root;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.l = new Node(2);
        root.r = new Node(3);
        root.l.l = new Node(4);
        root.l.r = new Node(5);
        root.r.l = new Node(6);
        root.r.r = new Node(7);
        int lca = findAncestor(root, 4, 6);
        System.out.println(lca);
        int kthLevelAnc = findKthLevelAncestor(root, 4, 1);
        System.out.println(kthLevelAnc);

        Node ancestorRoot=ancestors1(root, 4, 5);
        System.out.println(ancestorRoot.data);
    }
}
