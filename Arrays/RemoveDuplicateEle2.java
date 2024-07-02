import java.util.Arrays;

public class RemoveDuplicateEle2 {
    public static void RemoveDuplicateElements(int nums[]){
        int j=1;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1; i<n; i++){
            if(nums[i] != nums[i-1]){
                nums[j++] = nums[i];
            }
        }

        for(int i=0; i<j; i++){
            System.out.print(nums[i]+ "      ");
        }

    //     int nums2[] = new int[j];
    //     for(int i=0; i<j; i++){
    //         nums2[i]=nums[i];
    //         System.out.print(nums2[i]+ "      ");
    //     }
    }
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 43, 1, 2, 2, 56, 78, 23, 67, 2, 3, 3, 4, 4, 5, 5, 45, 76, 45,23, 5, 6, 7, 7, 7, 8 ,8 ,9, 9, 9, 45, 23, 56,67, 24, 77,9 ,9};
        // int nums[] ={1,1, 2, 3,3,3};
        RemoveDuplicateElements(nums);
    }
}
