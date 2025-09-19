import java.util.ArrayList;
import java.util.List;

public class findSafeStates {

    public static boolean dfs(ArrayList<Integer> graph[],int src, int vis[]){
        vis[src]=1;
        for(int dest:graph[src]){
            if(vis[dest]==1) return true;
            if(vis[dest]==0 && dfs(graph,dest,vis)){
                return true;
            }
        }
        vis[src]=2;
        return false;
    }
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int V=graph.length;
        ArrayList<Integer> graphs[]=new ArrayList[V];
        for(int i=0; i<V; i++){
            graphs[i]=new ArrayList<>();
        }
        for(int i=0; i<V; i++){
            for(int j=0; j<graph[i].length; j++){
                graphs[i].add(graph[i][j]);
            }
        }

        int vis[]=new int[V];
        List<Integer> safeNode = new ArrayList<>();
        for(int i=0; i<V; i++){
            if(!dfs(graphs,i,vis)){
                safeNode.add(i);
            }
        }
        return safeNode;

    }
    public static void main(String[] args) {
        // Questions
        /*
         * There is a directed graph of n nodes with each node labeled from 0 to n - 1.
         * The graph is represented by a 0-indexed 2D integer array graph where graph[i]
         * is an integer array of nodes adjacent to node i, meaning there is an edge
         * from node i to each node in graph[i].
         * A node is a terminal node if there are no outgoing edges. A node is a safe
         * node if every possible path starting from that node leads to a terminal node
         * (or another safe node).
         * Return an array containing all the safe nodes of the graph. The answer should
         * be sorted in ascending order.
         */

        int graph[][] = {{1,2},{2,3},{5},{0},{5},{},{}};         //Output: [2,4,5,6]
        //Explanation: The given graph is shown above.
        //Nodes 5 and 6 are terminal nodes as there are no outgoing edges from either
        //of them.
        //Every path starting at nodes 2, 4, 5, and 6 all lead to either node 5 or 6.

        // int graph[][] = {{1,2,3,4},{1,2},{3,4},{0,4},{}};       // Output: [4]
        //Explanation: Only node 4 is a terminal node, and every path starting at node 4 leads to node 4.


        List<Integer> res = eventualSafeNodes(graph);
        System.out.println(res);

    }
}
