import java.lang.reflect.Array;
import java.util.*;

class Edge {
    int src;
    int dest;
    int wt;

    Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
}

class Pair implements Comparable<Pair> {
    int u;
    int cost;

    Pair(int u, int c) {
        this.u = u;
        this.cost = c;
    }

    @Override
    public int compareTo(Pair p2) {
        return this.cost - p2.cost;
    }
}

public class primsAlgo {

    public static void createGraph(ArrayList<Edge> graph[], int v) {
        for (int i = 0; i < v; i++)
            graph[i] = new ArrayList<Edge>();
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    public static void primsAlgorithm(ArrayList<Edge> graph[], int src) {
        boolean vis[] = new boolean[graph.length];
        int finalCost = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            if (!vis[curr.u]) {
                vis[curr.u] = true;
                finalCost += curr.cost;
                for (Edge e : graph[curr.u]) {
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }

        System.out.println("Minimum cost to connect all vertices (MST) :- " + finalCost);
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph, v);
        primsAlgorithm(graph, 0);
    }
}

