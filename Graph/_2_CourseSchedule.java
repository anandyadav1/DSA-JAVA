import java.util.*;

public class _2_CourseSchedule {

    // Approach 1 Using Kahn's Algorithm
    public static int[] findOrder1(int numCourses, int[][] prerequisites) {
        int res[] = new int[numCourses];
        int ind[] = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
            ind[prerequisites[i][0]]++;
        }
        for (int i = 0; i < ind.length; i++) {
            if (ind[i] == 0) {
                q.add(i);
            }
        }
        List<Integer> l = new ArrayList<>();
        while (!q.isEmpty()) {
            int curr = q.poll();
            l.add(curr);
            for (int nei : adj.get(curr)) {
                ind[nei]--;
                if (ind[nei] == 0) {
                    q.add(nei);
                }
            }
        }
        if (l.size() != numCourses)
            return new int[0];
        for (int i = 0; i < l.size(); i++) {
            res[i] = l.get(i);
        }
        return res;
    }

    // Approach 2 Using Topological Sort checking Detected Cycle Algorithm
    public static boolean dfs(ArrayList<Integer> graph[], int src, int vis[], List<Integer> list) {
        vis[src] = 1;
        for (int dest : graph[src]) {
            if (vis[dest] == 1)
                return true;
            if (vis[dest] == 0 && dfs(graph, dest, vis, list)) {
                return true;
            }
        }
        vis[src] = 2;
        list.add(src);
        return false;
    }

    public static int[] findOrder2(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> graph[] = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int pre[] : prerequisites) {
            graph[pre[1]].add(pre[0]);
        }
        int vis[] = new int[numCourses];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) {
                if (dfs(graph, i, vis, list)) {
                    return new int[0];
                }
            }
        }
        Collections.reverse(list);
        int res[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
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
         * Return the ordering of courses you should take to finish all courses. If
         * there are many valid answers, return any of them. If it is impossible to
         * finish all courses, return an empty array.
         */

        // int numCourses = 2, prerequisites[][] = {{1,0}};     // Output: [0,1]
        //Explanation: There are a total of 2 courses to take. To take course 1 you
        //should have finished course 0. So the correct course order is [0,1].

        int numCourses = 4, prerequisites[][] = {{1,0},{2,0},{3,1},{3,2}};      // Output: [0,2,1,3]
         //Explanation: There are a total of 4 courses to take. To take course 3 you
         //should have finished both courses 1 and 2. Both courses 1 and 2 should be
         //taken after you finished course 0.
         //So one correct course order is [0,1,2,3]. Another correct ordering is
         //[0,2,1,3].

        // int numCourses = 1, prerequisites[][] = {} ;    //Output: [0]


        int res1[] =findOrder1(numCourses,prerequisites);
        for(int val:res1)System.out.print(val+" ");
        System.out.println("\n");
        int res2[] =findOrder2(numCourses,prerequisites);
        for(int val:res2)System.out.print(val+" ");

    }
}
