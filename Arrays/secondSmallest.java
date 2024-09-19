import java.util.Arrays;

public class secondSmallest {
    public static void secondSmallestVslue(int arr[], int m, int i) {    // i=index
        if (i == m - 1) {
            return;
        }
        while (arr[i] == arr[i + 1]) {
            i = i + 1;
        }
        System.out.println(arr[++i]);
    }

    public static void main(String[] args) {
        // int arr[] = { 3, 9, 4, 6, 8, 1, 43, 5, 1, 23, 4, 1, 1, 24, 29, 28, 20, 23 };
        int arr[]={1,1,1,1,1,1,89};
        int n = arr.length;
        Arrays.sort(arr);
        for (int arrs : arr) {
            System.out.print(arrs + "   ");
        }
        System.out.println(" ");
        secondSmallestVslue(arr, n, 0);
    }
}
