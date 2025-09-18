import java.util.*;

public class _0_1_matrix {
    public static int[][] updateMatrix(int mat[][]){
        int m=mat.length;
        int n=mat[0].length;
        int dist[][]=new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==0){
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
         * Given an m x n binary matrix mat, return the distance of the nearest 0 for
         * each cell.
         * The distance between two cells sharing a common edge is 1
         */
        // int mat[][] = {{0,0,0},{0,1,0},{0,0,0}};      //Output: [[0,0,0],[0,1,0],[0,0,0]]
        int mat[][] = {{0,0,0},{0,1,0},{1,1,1}};      //Output: [[0,0,0],[0,1,0],[1,2,1]]
        int dist[][]=updateMatrix(mat);
        for(int m[]:dist){
            for(int v:m){
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
}
