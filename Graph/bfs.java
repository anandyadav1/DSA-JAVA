import java.util.*;

class Edge {
    int src;
    int desti;

    Edge(int src, int desti) {
        this.src = src;
        this.desti = desti;
    }
}

public class bfs {
    public static void createGraph(ArrayList<Edge> adj[]) {
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
        adj[0].add(new Edge(0, 1));
        adj[0].add(new Edge(0, 2));

        adj[1].add(new Edge(1, 0));
        adj[1].add(new Edge(1, 3));

        adj[2].add(new Edge(2, 0));
        adj[2].add(new Edge(2, 4));

        adj[3].add(new Edge(3, 1));
        adj[3].add(new Edge(3, 4));
        adj[3].add(new Edge(3, 5));

        adj[4].add(new Edge(4, 2));
        adj[4].add(new Edge(4, 3));
        adj[4].add(new Edge(4, 5));

        adj[5].add(new Edge(5, 3));
        adj[5].add(new Edge(5, 4));
        adj[5].add(new Edge(5, 6));

        adj[6].add(new Edge(6, 5));

    }

    public static List<Integer> callBfs(ArrayList<Edge> adj[]) {
        List<Integer> list = new ArrayList<>();
        int V = adj.length;
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.poll();
            if (!vis[curr]) {
                list.add(curr);
                vis[curr] = true;
                for (int i = 0; i < adj[curr].size(); i++) {
                    int nei = adj[curr].get(i).desti;
                    if (!vis[nei]) {
                        q.add(nei);
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> adj[] = new ArrayList[V];
        createGraph(adj);
        // for (int i = 0; i < adj.length; i++) {
        // for (int j = 0; j < adj[i].size(); j++) {
        // int src = adj[i].get(j).src;
        // int dest = adj[i].get(j).desti;
        // System.out.print(src + " " + dest + " ");
        // }
        // System.out.println();
        // }
        System.out.println(callBfs(adj));

    }
}
