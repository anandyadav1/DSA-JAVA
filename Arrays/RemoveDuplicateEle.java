import java.util.Arrays;

public class RemoveDuplicateEle {

    public static void RemoveDuplicateElements(int nums[]) {
        int n = nums.length;
        int temp[] = new int[n];
        int j = 0;
        Arrays.sort(nums);

        for (int i = 0; i < n-1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];
            }
        }
        temp[j++] = nums[n - 1];


        System.out.println("After removing duplicate  element :");
        for (int k = 0; k < j; k++) {
            System.out.print(temp[k] + "     ");
            // System.out.print("Index:"+k + "   = "+temp[k] + "   ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 43, 1, 2, 2, 56, 78, 23, 67, 2, 3, 3, 4, 4, 5, 5, 45, 76, 45,23, 5, 6, 7, 7, 7, 8 ,8 ,9, 9, 9, 45, 23, 56,67, 24, 77,9 ,9};
        // int nums[] ={1,1, 2, 3,3,3};
        RemoveDuplicateElements(nums);
    }

}
