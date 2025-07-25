import java.util.*;

class Node {
    int data;
    Node l;
    Node r;

    Node(int v) {
        this.data = v;
    }
}

public class findAllPath {
    public static void findAllPathRootToLeaf(Node root, List<List<Integer>> res, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.data);
        if (root.l == null && root.r == null)
            res.add(new ArrayList<>(list));
        findAllPathRootToLeaf(root.l, res, list);
        findAllPathRootToLeaf(root.r, res, list);
        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.l = new Node(5);
        root.l.r = new Node(6);
        root.l.l = new Node(3);
        root.l.l.l = new Node(1);
        root.l.l.r = new Node(4);
        root.r = new Node(10);
        root.r.r = new Node(11);
        root.r.r.r = new Node(14);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findAllPathRootToLeaf(root, res, list);
        System.out.println(res);
        TreeMap<Integer, List<Integer>> tm = new TreeMap<>();
        for (List<Integer> lst : res) {
            tm.put(lst.size(), lst);
        }

    }

}
