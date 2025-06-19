import java.util.*;

class Edge {
    int src;
    int dest;

    Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

public class topoLogicalSort {
    public static void createGraph(ArrayList<Edge> adj[]) {
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
        adj[2].add(new Edge(2, 3));

        adj[3].add(new Edge(3, 1));

        adj[4].add(new Edge(4, 0));
        adj[4].add(new Edge(4, 1));

        adj[5].add(new Edge(5, 0));
        adj[5].add(new Edge(5, 2));

        topoSort(adj);
    }

    public static void topoSort(ArrayList<Edge> adj[]) {
        boolean vis[] = new boolean[adj.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < adj.length; i++) {
            if (!vis[i]) {
                topoSortUtil(i, adj, vis, st);
            }
        }

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void topoSortUtil(int src, ArrayList<Edge> adj[], boolean vis[], Stack<Integer> st) {
        vis[src] = true;
        for (Edge nei : adj[src]) if (!vis[nei.dest]) topoSortUtil(nei.dest, adj, vis, st);

        // or

        // for(int i=0; i<adj[src].size(); i++){
        // int nei=adj[src].get(i).dest;
        // if(!vis[nei]){
        // topoSortUtil(nei, adj, vis, st);
        // }
        // }
        st.push(src);
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> adj[] = new ArrayList[V];
        createGraph(adj);
    }
}
