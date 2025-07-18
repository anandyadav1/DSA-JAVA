import java.util.*;
class Edge{
    int src;
    int dest;
    Edge(int src, int dest){
        this.src=src;
        this.dest=dest;
    }
}
public class findAllPath {
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void printAllPath(ArrayList<Edge> graph[], int src, int dest, String path){
        if(src==dest){
            System.out.println(path+dest);
            return;
        }

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            printAllPath(graph, e.dest, dest, path+src);
        }
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src=4;
        int dest=3;
        printAllPath(graph, src, dest, " ");
    }
}
