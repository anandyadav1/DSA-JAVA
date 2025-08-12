import java.util.*;

class subArraysWithSumK {

    public static int  subArraysWithSumEqToK(int a[], int k){
        int n=a.length;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0, count=0;
        for(int v:a){
           sum +=v;
           count +=map.getOrDefault(sum-k, 0);
           map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }

    public static int longestSubArraysWithSumEqToK(int arr[], int k) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) maxLen = Math.max(maxLen, i + 1);

            if (!map.containsKey(sum)) map.put(sum, i);

            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

        }
        return maxLen;
    }

    public static int smallestSubArraysWithSumEqToK(int arr[], int k) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) minLen = Math.min(minLen, i + 1);

            if (!map.containsKey(sum)) map.put(sum, i);

            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                minLen = Math.min(minLen, len);
            }

        }
        return minLen;
    }
    public static void main(String[] args) {
        int[] arr =  {1,1,1,2,3};
        int k = 3;
        System.out.println("Total subArrays equal to k = "+subArraysWithSumEqToK(arr, k));
        System.out.println("Longest subArrays equal to k = "+longestSubArraysWithSumEqToK(arr, k));
        System.out.println("Longest subArrays equal to k = "+smallestSubArraysWithSumEqToK(arr, k));
    }
}