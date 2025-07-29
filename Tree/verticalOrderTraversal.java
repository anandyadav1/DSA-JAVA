import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

class Pair {
    TreeNode node;
    int col;
    int level;

    Pair(TreeNode node, int col, int level) {
        this.node = node;
        this.col = col;
        this.level = level;
    }
}

public class verticalOrderTraversal {
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> tm = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        q.add(new Pair(root, 0, 0));
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            TreeNode node = curr.node;
            int col = curr.col;
            int lev = curr.level;
            if (!tm.containsKey(col))
                tm.put(col, new TreeMap<>());
            if (!tm.get(col).containsKey(lev))
                tm.get(col).put(lev, new ArrayList<>());
            tm.get(col).get(lev).add(node.val);
            if (node.left != null)
                q.add(new Pair(node.left, col - 1, lev + 1));
            if (node.right != null)
                q.add(new Pair(node.right, col + 1, lev + 1));
        }
        for (TreeMap<Integer, ArrayList<Integer>> e : tm.values()) {
            List<Integer> list = new ArrayList<>();
            for (ArrayList<Integer> sublist : e.values()) {
                Collections.sort(sublist);
                list.addAll(sublist);
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> res = verticalTraversal(root);
        System.out.println(res);
    }
}