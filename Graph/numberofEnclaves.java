import java.util.*;

public class numberofEnclaves {

    public static void dfs(int grid[][],int i, int j, int m, int n){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0) return;
        grid[i][j]=0;
        dfs(grid,i+1,j,m,n);
        dfs(grid,i-1,j,m,n);
        dfs(grid,i,j+1,m,n);
        dfs(grid,i,j-1,m,n);
    }
    public static void main(String[] args) {
        // Questions
        /*
         * You are given an m x n binary matrix grid, where 0 represents a sea cell and
         * 1 represents a land cell.
         * A move consists of walking from one land cell to another adjacent
         * (4-directionally) land cell or walking off the boundary of the grid.
         * Return the number of land cells in grid for which we cannot walk off the
         * boundary of the grid in any number of moves.
         */
        int grid[][] = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};          //Output: 3
        // int grid[][] = {{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};          //Output: 0

        int m=grid.length;
        int n=grid[0].length;
        for(int i=0; i<m; i++){
            dfs(grid,i,0,m,n);
            dfs(grid,i,n-1,m,n);
        }
        for(int j=0; j<m; j++){
            dfs(grid,0,j,m,n);
            dfs(grid,m-1,j,m,n);
        }

        int count=0;
        for(int g[]:grid){
            for(int v:g){
                if(v==1) count++;
            }
        }
        System.out.println("Total Enclaves = "+count);
    }
}