import java.util.*;
class Edge{
    int src;
    int dest;
    Edge(int src, int dest){
        this.src=src;
        this.dest=dest;
    }
}
public class dfs {

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

    public static List<Integer> callDfs(int src, boolean vis[], List<Integer> list, ArrayList<Edge> adj[]){
        vis[src]=true;
        list.add(src);
        for(int i=0; i<adj[src].size();  i++){
            int nei=adj[src].get(i).dest;
            if(!vis[nei]){
                callDfs(nei, vis, list, adj);
            }
        }

        return list;

    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> adj[] = new ArrayList[V];
        createGraph(adj);
        System.out.println(callDfs(0,new boolean[V], new ArrayList<>(),adj));
    }
}
