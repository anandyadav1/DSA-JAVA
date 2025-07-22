
import java.util.*;

class Edge implements Comparable<Edge> {
    int src;
    int dest;
    int wt;

    Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt = w;
    }

    @Override
    public int compareTo(Edge e) {
        return this.wt - e.wt;
    }
}

public class kruskalsAlgorithm {
    public static int find(int par[], int x) {
        if (x == par[x])
            return x;
        return par[x] = find(par, par[x]);
    }

    public static void union(int a, int b, int par[], int rank[]) {
        int parA = find(par, a);
        int parB = find(par, b);
        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void createGraph(ArrayList<Edge> graph, int matrix[][]) {
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix.length; j++){    //Agar Undirected graph hoga to j=i+1   and  Directed hoga to j=0
                if(matrix[i][j]!=0){
                    graph.add(new Edge(i, j, matrix[i][j]));
                }
            }
        }
    }
    public static void kruskalAlgorithm(int matrix[][]){
        int V = matrix.length;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph,matrix);
        int par[] = new int[V];
        int rank[] = new int[V];
        for (int i = 0; i < V; i++)
            par[i] = i;
        Collections.sort(graph);   //Sort to the Weight basis
        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < V - 1; i++) {
            Edge e = graph.get(i);
            int parA = find(par, e.src);
            int parB = find(par, e.dest);

            if (parA != parB) {
                union(parA, parB, par, rank);
                mstCost += e.wt;
                count++;
            }
        }
        System.out.println(mstCost);

    }

    public static void main(String[] args) {
        int matrix[][]={{0,10,15,30},{10,0,0,40},{10,0,0,50},{30,40,50,0}};
        kruskalAlgorithm(matrix);
    }
}
