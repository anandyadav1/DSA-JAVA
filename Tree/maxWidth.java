import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int d) {
        this.data = d;
    }

}

class Pair {
    TreeNode node;
    int index;

    Pair(TreeNode n, int i) {
        node = n;
        index = i;
    }
}

public class maxWidth {
    public static int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int maxWidth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int minIndex = q.peek().index;
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                int currIndex = p.index - minIndex;
                TreeNode currNode = p.node;

                if (i == 0)
                    first = currIndex;
                if (i == size - 1)
                    last = currIndex;

                if (currNode.left != null)
                    q.add(new Pair(currNode.left, 2 * currIndex));
                if (currNode.right != null)
                    q.add(new Pair(currNode.right, 2 * currIndex + 1));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        root.left.left.left = new TreeNode(6);
        root.right.right.left = new TreeNode(7);
        System.out.println(widthOfBinaryTree(root));
    }
}
