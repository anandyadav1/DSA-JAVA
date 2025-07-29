import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int v) {
        this.val = v;
    }
}

public class printAllNodDistWith_K {
    public static void findPar(TreeNode root, Map<TreeNode, TreeNode> par) {
        if (root == null)
            return;
        if (root.left != null)
            par.put(root.left, root);
        if (root.right != null)
            par.put(root.right, root);
        findPar(root.left, par);
        findPar(root.right, par);
    }

    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Map<TreeNode, TreeNode> par = new HashMap<>();
        findPar(root, par);
        Set<TreeNode> vis = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                vis.add(curr);
                if (k == 0)
                    res.add(curr.val);
                if (curr.left != null && !vis.contains(curr.left))
                    q.add(curr.left);
                if (curr.right != null && !vis.contains(curr.right))
                    q.add(curr.right);
                if (par.containsKey(curr) && !vis.contains(par.get(curr)))
                    q.add(par.get(curr));
            }
            k--;
            if (k < 0)
                break;
        }
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode target = root.left;
        int k = 2;
        List<Integer> res = distanceK(root, target, k);
        System.out.println(res);
    }
}