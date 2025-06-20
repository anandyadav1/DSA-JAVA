import java.util.*;
import java.util.LinkedList;
class Edge{
    int src;
    int dest;
    Edge(int src, int dest){
        this.src=src;
        this.dest=dest;
    }
}
public class kahns_Algorithm {
    static List<Integer> list = new ArrayList<>();
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

    }

    public static void calculateIndegree(ArrayList<Edge> adj[], int indeg[]){
        for(int i=0; i<adj.length; i++){
            for(int j=0; j<adj[i].size(); j++){
                Edge e=adj[i].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void topoLogicalSort(ArrayList<Edge> adj[]){
        int indeg[]=new int[adj.length];
        calculateIndegree(adj,indeg);

        Queue<Integer> q= new LinkedList<>();
        for(int i=0; i<indeg.length; i++){
            if(indeg[i]==0) q.add(i);
        }

        while (!q.isEmpty()) {
            int curr=q.poll();
            list.add(curr);
            for(int i=0; i<adj[curr].size(); i++){
                Edge e=adj[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0) q.add(e.dest);
            }
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> adj[] = new ArrayList[V];
        createGraph(adj);
        topoLogicalSort(adj);

        System.out.println(list);
    }
}
