// package DSA-JAVA.Greedy;

import java.util.*;

public class activitySelections {
    public static void main(String[] args) {
        int start[]={5,8,0,1,3,5};
        int end[]={7,9,6,2,4,9};
        int n=start.length;
        int grid[][]=new int[n][2];
        for(int i=0; i<n; i++){
            grid[i][0]=start[i];
            grid[i][1]=end[i];
        }
        Arrays.sort(grid, (a, b) -> Integer.compare(a[1], b[1]));
        int maxActivity=1;
        ArrayList<Integer> l = new ArrayList<>();
        int lastEnd=grid[0][1];
        l.add(grid[0][0]);
        for(int i=1; i<n; i++){
            if(grid[i][0]>=lastEnd){
                maxActivity++;
                l.add(grid[i][0]);
                lastEnd=grid[i][1];
            }
        }
        System.out.println(maxActivity);
        System.out.println(l);
        for(int a[]:grid){
            for(int nm:a){
                System.out.print(nm+"  ");
            }
            System.out.println();
        }
    }
}
