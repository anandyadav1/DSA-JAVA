import java.util.*;

public class addTwoArray {
    public static void add(int arr1[], int arr2[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n = arr1.length + arr2.length;
        int brr[] = new int[n];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] >= arr2[j]) {
                brr[k++] = arr2[j++];
            } else {
                brr[k++] = arr1[i++];
            }
        }

        while (i < arr1.length) {
            brr[k++] = arr1[i++];
        }

        for (int h = 0; h < brr.length; h++) {
            System.out.print(brr[h] + "  ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 4, 5, 7, 7, 8, 8, 8, 8, 9, 10, 78, 88, 99 };
        int arr2[] = { 5, 6, 7, 7, 8, 9, 9, 9, 10, 10 };
        add(arr1, arr2);
    }
}
