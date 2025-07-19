import java.util.*;

class Edge {
    int src;
    int dest;
    int wt;

    Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt=w;
    }
}


public class bellmanford {
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 6));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 4, 8));
        graph[2].add(new Edge(2, 0, 6));
        graph[2].add(new Edge(2, 3, 3));
        graph[3].add(new Edge(3, 1, 7));
        graph[3].add(new Edge(3, 2, 3));
        graph[4].add(new Edge(4, 1, 8));
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src){
        int dist[]=new int[graph.length];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        int V=graph.length;
        for(int k=0; k<V-1; k++){

            for(int i=0; i<graph.length; i++){
                for(Edge e:graph[i]){
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }
        for(int nm:dist){
            System.out.print(nm+" ");
        }
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        int src=0;
        dijkstra(graph, src);

    }
}
