import java.util.*;

public class _0_1_matrix_having_1 {

    public static int[][] updateMatrix(int mat[][]){
        int m=mat.length;
        int n=mat[0].length;
        int dist[][]=new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==1){
                    dist[i][j]=0;
                    q.add(new int[]{i,j});
                }else{
                    dist[i][j]=-1;
                }
            }
        }
        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int cell[]=q.poll();
            int x=cell[0];
            int y=cell[1];
            for(int d[]:dir){
                int nx=d[0]+x;
                int ny=d[1]+y;
                if(nx>=0 && nx<m && ny>=0 && ny<n && dist[nx][ny]==-1){
                    dist[nx][ny]=dist[x][y]+1;
                    q.add(new int[]{nx,ny});
                }
            }
        }

        return dist;
    }
    public static void main(String[] args) {
        // Questions
        /*
         * Given a binary grid of n*m. Find the distance of the nearest 1 in the grid
         * for each cell.
         * The distance is calculated as |i1 - i2| + |j1 - j2|, where i1, j1 are the row
         * number and column number of the current cell, and i2, j2 are the row number
         * and column number of the nearest cell having value 1. There should be atleast
         * one 1 in the grid.
         */

        // int mat[][] = {{0,1,1,0}, {1,1,0,0}, {0,0,1,1}};   //Output: [[1,0,0,1], [0,0,1,1], [1,1,0,0]]
        int mat[][] = {{1,0,1}, {1,1,0}, {1,0,0}};   //Output: [[0,1,0], [0,0,1], [0,1,2]]

        int dist[][]=updateMatrix(mat);
        for(int m[]:dist){
            for(int v:m){
                System.out.print(v+" ");
            }
            System.out.println();
        }

    }
}