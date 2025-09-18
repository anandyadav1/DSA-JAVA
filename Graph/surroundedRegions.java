import java.util.LinkedList;
import java.util.Queue;

public class surroundedRegions {
    public static String[][] solve(String[][] board) {
        int m = board.length;
        int n = board[0].length;
        Queue<int[]> q = new LinkedList<>();

        // Step 1: Boundary par jo "O" hain unko mark karo "#" aur queue me dalo
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == m - 1 || j == 0 || j == n - 1) && board[i][j].equals("O")) {
                    board[i][j] = "#";
                    q.add(new int[]{i, j});
                }
            }
        }

        // Step 2: BFS - boundary "O" ke connected sabhi "O" ko safe mark kar do
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            for (int[] d : dir) {
                int x = d[0] + cell[0];
                int y = d[1] + cell[1];
                if (x >= 0 && x < m && y >= 0 && y < n && board[x][y].equals("O")) {
                    board[x][y] = "#";
                    q.add(new int[]{x, y});
                }
            }
        }

        // Step 3: Final conversion
        String[][] ans = new String[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j].equals("O")) board[i][j] = "X";  // surrounded O → X
                if (board[i][j].equals("#")) board[i][j] = "O";  // safe → restore O
                ans[i][j] = board[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // Questions
        /*
         * You are given an m x n matrix board containing letters 'X' and 'O', capture
         * regions that are surrounded:
         * Connect: A cell is connected to adjacent cells horizontally or vertically.
         * Region: To form a region connect every 'O' cell.
         * Surround: The region is surrounded with 'X' cells if you can connect the
         * region with 'X' cells and none of the region cells are on the edge of the
         * board.
         * To capture a surrounded region, replace all 'O's with 'X's in-place within
         * the original board. You do not need to return anything.
         */

        String board[][] = {{"X","X","X","X"},{"X","O","O","X"},{"X","X","O","X"},{"X","O","X","X"}};
        //Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]

        String ans[][]=solve(board);
        for(String a[]:ans){
            for(String v:a){
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
}
