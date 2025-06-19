import java.util.*;
class Edge{
    int src;
    int dest;
    Edge(int src, int dest){
        this.src=src;
        this.dest=dest;
    }
}
public class detectCycleUndirected {
    public static void createGraph(ArrayList<Edge> adj[]){
        for(int i=0; i<adg.length; i++){
            adj[i].add(new ArrayList<>());
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> adj[]=new ArrayList[V];
        createGraph(adj);
    }
}
