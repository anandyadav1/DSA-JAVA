import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int d) {
        this.data = d;
    }
}

public class boundaryTraversal {
    public static boolean isLeef(TreeNode node) {
        return (node.left == null) && (node.right == null);
    }

    public static void leftNode(TreeNode root, List<Integer> res) {
        TreeNode curr = root.left;
        while (curr != null) {
            if (!isLeef(curr))
                res.add(curr.data);
            if (curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }

    public static void leefNode(TreeNode root, List<Integer> res) {
        if (root == null)
            return;
        if (isLeef(root)) {
            res.add(root.data);
            return;
        }
        leefNode(root.left, res);
        leefNode(root.right, res);
    }

    public static void rightNode(TreeNode root, List<Integer> res) {
        TreeNode curr = root.right;
        Stack<Integer> temp = new Stack<>();

        while (curr != null) {
            if (!isLeef(curr))
                temp.push(curr.data);
            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }

        while (!temp.isEmpty()) {
            res.add(temp.pop());
        }
    }

    public static List<Integer> boundary(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        if (!isLeef(root))
            res.add(root.data);

        leftNode(root, res);
        leefNode(root, res);
        rightNode(root, res);

        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);

        List<Integer> res=boundary(root);
        System.out.println(res);
    }
}
