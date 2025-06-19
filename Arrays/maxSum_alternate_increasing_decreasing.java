import java.util.*;

public class maxSum_alternate_increasing_decreasing {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = { 4, 3, 8, 5, 3, 8 };
        // int[] arr = {4,8,2,5,6,8};
        int sum = arr[0];
        boolean isIncreasing = false; // Start with decreasing

        for (int i = 1; i < n; i++) {
            if ((isIncreasing && arr[i] > arr[i - 1]) || (!isIncreasing && arr[i] < arr[i - 1])) {
                sum += arr[i];
                isIncreasing = !isIncreasing;
            }
        }

        System.out.println(sum);
    }
}
