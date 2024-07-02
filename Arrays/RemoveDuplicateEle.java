public class RemoveDuplicateEle {

    public static void RemoveDuplicateElements(int nums[]) {
        int n = nums.length;
        int temp[] = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];
            }
        }

        temp[j++] = nums[n - 1];

        for (int k = 0; k < j; k++) {
            System.out.print(temp[k] + "   ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 7, 7, 7, 8 ,8 ,9, 9, 9,9 ,9};
        RemoveDuplicateElements(nums);
    }

}
