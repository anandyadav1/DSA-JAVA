import java.util.ArrayList;

public class _1_CourseSchedule {
    public static boolean dfs(ArrayList<Integer>graph[],int src, int vis[]){
        vis[src]=1;
        for(int dest : graph[src]){
            if(vis[dest]==1) return true;
            if(vis[dest]==0 && dfs(graph,dest,vis)){
                return true;
            }
        }
        vis[src]=2;
        return false;
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> graph[]=new ArrayList[numCourses];
        for(int i=0; i<numCourses; i++){
            graph[i]=new ArrayList<>();
        }
        for(int pre[]:prerequisites){
            int dest=pre[0];
            int src=pre[1];
            graph[src].add(dest);
        }
        int vis[]=new int[numCourses];
        for(int i=0; i<numCourses; i++){
            if(vis[i]==0){
                if(dfs(graph,i,vis)) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Questions
        /*
         * There are a total of numCourses courses you have to take, labeled from 0 to
         * numCourses - 1. You are given an array prerequisites where prerequisites[i] =
         * [ai, bi] indicates that you must take course bi first if you want to take
         * course ai.
         * For example, the pair [0, 1], indicates that to take course 0 you have to
         * first take course 1.
         * Return true if you can finish all courses. Otherwise, return false.
         */

        // int numCourses = 2, prerequisites[][] = {{1,0}};   //Output: true
        //Explanation: There are a total of 2 courses to take.
        //To take course 1 you should have finished course 0. So it is possible.

        int numCourses = 2, prerequisites[][] = {{1,0},{0,1}};      //Output: false
        //Explanation: There are a total of 2 courses to take. 
        //To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
        System.out.println(canFinish(numCourses, prerequisites));

    }
}
