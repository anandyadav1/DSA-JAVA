import java.util.*;

public class lis_increasing {
    public static int tabulations(int arr1[],int  arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int dp[][]=new int[n+1][m+1];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String args[]) {
        int arr[] = { 50, 3, 10, 7, 40, 80 };
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int arr2[]=new int[set.size()];
        int i=0;
        for(int num:set){
            arr2[i]=num;
            i++;
        }
        System.out.println(tabulations(arr, arr2));
    }
}
