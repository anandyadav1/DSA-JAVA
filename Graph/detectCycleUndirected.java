import java.util.*;

class Edge {
    int src;
    int dest;

    Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

public class detectCycleUndirected {

    public static boolean dfsUtil(int src, int par, boolean vis[], ArrayList<Edge> adj[]){
        vis[src]=true;
        for(int i=0; i<adj[src].size(); i++){
            int curr=adj[src].get(i).dest;
            if(curr==par) continue;
            if(vis[curr]){
                return true;
            }else{
                if(dfsUtil(curr, src, vis, adj)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(boolean vis[], ArrayList<Edge> adj[]){
        for(int i=0; i<adj.length; i++){
            if(!vis[i]){
                if(dfsUtil(i,-1,vis,adj)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void createGraph(ArrayList<Edge> adj[]) {
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<Edge>();
        }

        adj[0].add(new Edge(0, 1));
        adj[0].add(new Edge(0, 2));
        adj[0].add(new Edge(0, 3));

        adj[1].add(new Edge(1, 0));

        adj[2].add(new Edge(2, 0));
        adj[2].add(new Edge(2, 3));

        adj[3].add(new Edge(3, 0));
        adj[3].add(new Edge(3, 2));

        boolean vis[] = new boolean[adj.length];
        System.out.println(dfs(vis,adj));

    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> adj[] = new ArrayList[V];
        createGraph(adj);
    }
}
