import java.util.*;

public class numberOfDistinctIslands {

    public static void dfs(int[][] grid, boolean[][] visited, int i, int j, StringBuilder path, String dir) {
        int n = grid.length, m = grid[0].length;
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0 || visited[i][j])
            return;

        visited[i][j] = true;
        path.append(dir); // add direction

        dfs(grid, visited, i + 1, j, path, "D"); // down
        dfs(grid, visited, i - 1, j, path, "U"); // up
        dfs(grid, visited, i, j + 1, path, "R"); // right
        dfs(grid, visited, i, j - 1, path, "L"); // left

        path.append("B"); // backtracking mark
    }

    public static int countDistinctIslands(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        Set<String> shapes = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    StringBuilder path = new StringBuilder();
                    dfs(grid, visited, i, j, path, "O"); // O = origin
                    shapes.add(path.toString());
                }
            }
        }
        return shapes.size();
    }
    public static void main(String[] args) {
        // int grid[][] = { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 1, 1 } };   //Output 1
        int grid[][] = {{1, 1, 0, 1, 1},{1, 0, 0, 0, 0},{0, 0, 0, 0, 1},{1, 1, 0, 1,1}};   //Output 3
        System.out.println(countDistinctIslands(grid));
    }
}