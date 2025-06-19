
public class maxProductOfSubArray {
    public static int maxProduct(int[] nums) {
        int result = nums[0];
        int maxProd = nums[0];
        int minProd = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);
            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4, 6};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums));
    }
}
