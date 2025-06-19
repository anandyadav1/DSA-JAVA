import java.util.*;

class Edge {
    int src;
    int dest;

    Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

public class detectCycleDirected {

    public static boolean dfsUtil(int src, boolean vis[], boolean pathCheck[], ArrayList<Edge> adj[]) {
        vis[src] = true;
        pathCheck[src] = true;
        for (int i = 0; i < adj[src].size(); i++) {
            int curr = adj[src].get(i).dest;
            if (pathCheck[curr])
                return true;
            if (!vis[curr] && dfsUtil(curr, vis, pathCheck, adj)) {
                return true;
            }
        }
        pathCheck[src] = false;

        return false;
    }

    public static boolean dfs(boolean vis[], ArrayList<Edge> adj[]) {
        boolean pathCheck[] = new boolean[adj.length];
        for (int i = 0; i < adj.length; i++) {
            if (!vis[i]) {
                if (dfsUtil(i, vis, pathCheck, adj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> adj[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        adj[0].add(new Edge(0, 2));

        adj[1].add(new Edge(1, 0));

        adj[2].add(new Edge(2, 3));

        adj[3].add(new Edge(3, 0));

        boolean vis[] = new boolean[V];
        System.out.println(dfs(vis, adj));
    }
}
