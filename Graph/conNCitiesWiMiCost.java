
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
class Pair implements Comparable <Pair>{
    int u;
    int cost;
    Pair(int u, int c){
        this.u=u;
        this.cost=c;
    }
    public int compareTo(Pair p){
        return this.cost-p.cost;
    }

}

public class conNCitiesWiMiCost {
    public static void createGraph(ArrayList<Edge> graph[], int cities[][], int V){
        for(int i=0; i<V; i++){
            graph[i]=new ArrayList<Edge>();
        }
        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                if(cities[i][j]!=0){
                    graph[i].add(new Edge(i, j, cities[i][j]));
                }
            }
        }
    }

    public static int findConnectingCitiesMinimmumCost(ArrayList<Edge> graph[], int V){
        boolean vis[]=new boolean[V];
        int finalCost=0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair curr=pq.poll();
            if(!vis[curr.u]){
                vis[curr.u]=true;
                finalCost +=curr.cost;
                for(Edge e : graph[curr.u]){
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }

        return finalCost;
    }
    public static void main(String[] args) {
        // int cities[][]={{0,1,2,3,4},{1,0,5,0,7},{2,5,0,6,0},{3,0,6,0,0},{4,7,0,0,0}};
        int cities[][]={{0,10,15,30},{10,0,0,40},{15,0,0,50},{30,40,50,0}};
        int V=cities.length;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph,cities,V);
        System.out.println(findConnectingCitiesMinimmumCost(graph, V));
    }
}
