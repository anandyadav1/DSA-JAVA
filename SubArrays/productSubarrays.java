import java.util.*;

public class productSubarrays {

    public static int maximumProductSubArrays(int a[]){
        int n=a.length;
        int max=a[0];
        int min=a[0];
        int res=a[0];
        for(int i=1; i<n; i++){
            if(a[i] < 0){
                int temp=min;
                min=max;
                max=temp;
            }
            max=Math.max(a[i],max*a[i]);
            min=Math.min(a[i], min*a[i]);

            res=Math.max(res, max);
        }
        return res;
    }

    public static int minimumProductSubArrays(int a[]){
        int n=a.length;
        int maxp=a[0];
        int minp=a[0];
        int res=a[0];

        for(int i=1; i<n; i++){
            if(a[i] < 0){
                int temp=minp;
                minp=maxp;
                maxp=temp;
            }
            maxp=Math.max(a[i],a[i]*maxp);
            minp=Math.min(a[i],a[i]*minp);

            res=Math.min(res, minp);
        }
        return res;
    }

    public static int subArraysWithProductEqToK(int[] a, int k) {
        int n = a.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);

        int count = 0;
        int prod = 1;

        for (int v : a) {
            if (v == 0) {
                prod = 1;
                map.clear();
                map.put(1, 1);
                if (k == 0) count++;
                continue;
            }

            prod *= v;

            if (prod % k == 0) {
                int target = prod / k;
                count += map.getOrDefault(target, 0);
            }

            map.put(prod, map.getOrDefault(prod, 0) + 1);
        }

        return count;
    }


    public static int longestProductEqualK(int[] arr, int k) {
        int n = arr.length;
        Map<Long, Integer> map = new HashMap<>();
        long prod = 1;
        int maxLen = 0;

        map.put(1L, -1);

        for (int i = 0; i < n; i++) {
            prod *= arr[i];

            if (prod == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            if (prod != 0 && k != 0 && prod % k == 0) {
                long target = prod / k;
                if (map.containsKey(target)) {
                    int len = i - map.get(target);
                    maxLen = Math.max(maxLen, len);
                }
            }

            if (!map.containsKey(prod)) {
                map.put(prod, i);
            }

            if (arr[i] == 0) {
                prod = 1;
                map.clear();
                map.put(1L, i);
            }
        }

        return maxLen;
    }


    public static int smallestProduct(int[] arr, int k) {
        int n = arr.length;
        Map<Long, Integer> map = new HashMap<>();
        long prod = 1;
        int minLen = Integer.MAX_VALUE;

        map.put(1L, -1);

        for (int i = 0; i < n; i++) {
            prod *= arr[i];

            if (prod == k) {
                minLen = Math.min(minLen, i + 1);
            }

            if (prod != 0 && k != 0 && prod % k == 0) {
                long target = prod / k;
                if (map.containsKey(target)) {
                    int len = i - map.get(target);
                    minLen = Math.min(minLen, len);
                }
            }

            map.put(prod, i);

            if (arr[i] == 0) {
                prod = 1;
                map.clear();
                map.put(1L, i);
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public static int countXOR(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int xor = 0, count = 0;
        map.put(0, 1);
        for(int num : arr) {
            xor ^= num;
            count += map.getOrDefault(xor ^ k, 0);
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4, 1, 2, 3};
        System.out.println("Max product of SubArrays : "+maximumProductSubArrays(arr));
        System.out.println("Min product of SubArrays : "+minimumProductSubArrays(arr));
        System.out.println("Total product of SubArrays is qual to K : "+subArraysWithProductEqToK(arr,6));
        System.out.println("Longest product of SubArrays is equal to K : "+longestProductEqualK(arr,6));
        System.out.println("smallest product of SubArrays is equal to K : "+smallestProduct(arr,6));
    }
}





