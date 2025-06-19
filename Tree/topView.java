import java.util.*;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Map;

class Node {
    int v;
    Node l;
    Node r;
    Node(int v) {
        this.v = v;
    }
}
class Pair {
    int hd;
    Node node;

    Pair(int hd, Node node) {
        this.hd = hd;
        this.node = node;
    }
}

public class topView {
    public static Node constructTree(int a[]) {
        if (a.length == 0 || a[0] == -1) {
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(a[0]);
        q.add(root);
        int i = 1;
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (i < a.length && a[i] != -1) {
                Node nn = new Node(a[i]);
                curr.l = nn;
                q.add(nn);
            }
            i++;
            if (i < a.length && a[i] != -1) {
                Node nn = new Node(a[i]);
                curr.r = nn;
                q.add(nn);
            }
            i++;
        }
        return root;
    }

    public static void topViews(Node root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        int key = 0;
        q.add(new Pair(key, root));
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int hd=curr.hd;
            Node node=curr.node;
            if (!map.containsKey(hd)) {
                map.put(hd, node.v);
            }
            if(node.l!=null) q.add(new Pair(hd-1, node.l));
            if(node.r!=null) q.add(new Pair(hd+1, node.r));
        }

        for (Map.Entry<Integer,Integer> x : map.entrySet()){
            System.out.print(x.getKey()+"  ");
            System.out.println(x.getValue());
        }

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        Node root = constructTree(a);
        topViews(root);
    }
}
