import java.util.*;

class Edge {
    int src;
    int dest;

    Edge(int s, int d) {
        this.src = s;
        this.dest = d;
    }
}

public class kosaraju_Algorithm {
    public static void topoSort(ArrayList<Edge> graph[], int src, boolean vis[], Stack<Integer> st) {
        vis[src] = true;
        for (Edge e : graph[src]) {
            if (!vis[e.dest]) {
                topoSort(graph, e.dest, vis, st);
            }
        }
        st.push(src);
    }
    public static void dfs(ArrayList<Edge> transPoseGraph[], int src, boolean vis[]) {
        vis[src] = true;
        System.out.print(src+" ");
        for (Edge e : transPoseGraph[src]) {
            if (!vis[e.dest]) {
                dfs(transPoseGraph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        int adj[][] = { { 2, 3 }, { 0 }, { 1 }, { 4 },{}};
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj[i].length; j++) {
                graph[i].add(new Edge(i, adj[i][j]));
            }
        }
        //Step 1 find all toposort
        Stack<Integer> st = new Stack<>();
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topoSort(graph, i, vis, st);
            }
        }
        //Step 2 create transpose graph
        ArrayList<Edge> transPoseGraph[]= new ArrayList[V];
        for(int i=0; i<V; i++){
            transPoseGraph[i]=new ArrayList<Edge>();
        }
        Arrays.fill(vis,false);
        for(int i=0; i<V; i++){
            for(Edge e:graph[i]){
                transPoseGraph[e.dest].add(new Edge(e.dest, e.src));
            }
        }
        //Step 3 apply dfs on trasposeGraph
        System.out.println("This is the Strongly Connected Graph");
        while (!st.isEmpty()) {
            int curr=st.pop();
            if(!vis[curr]){
                dfs(transPoseGraph,curr,vis);
            }
            System.out.println();
        }
    }
}
