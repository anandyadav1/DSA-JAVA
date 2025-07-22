import java.util.*;
class Edge{
    int src;
    int dest;
    int wt;
    Edge(int s, int d, int w){
        this.src=s;
        this.dest=d;
        this.wt=w;
    }
}
class Info{
    int u;
    int cost;
    int stops;
    Info(int u, int c, int s){
        this.u=u;
        this.cost=c;
        this.stops=s;
    }
}
public class chipestFlights {
    public static void createGraph(ArrayList<Edge> graph[], int V, int flights[][]){
        for(int i=0; i<V; i++){
            graph[i]=new ArrayList<Edge>();
        }
        for(int f[]:flights){
            int u=f[0];
            int v=f[1];
            int c=f[2];
            graph[u].add(new Edge(u, v, c));
        }
    }
    public static int findChipestFlightsWithKthStop(int flights[][],int src, int dest, int k){
        int V=flights.length;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph,V,flights);
        int dist[]=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));
        while (!q.isEmpty()) {
            Info curr=q.poll();
            if(curr.stops>k) break;
            for(Edge e : graph[curr.u]){
                int u=e.src;
                int v=e.dest;
                int c=e.wt;
                if(dist[u]+c<dist[v]){
                    dist[v]=dist[u]+c;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }
        if(dist[dest]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int flights[][]={{0,1,100},{1,2,100},{1,3,600},{2,0,100},{2,3,200}};
        // int flights[][]={{0,1,100},{1,2,100},{0,2,500}};
        int k=1;
        int src=0;
        int dest=3;
        System.out.println(findChipestFlightsWithKthStop(flights,src,dest,k));
    }
}

