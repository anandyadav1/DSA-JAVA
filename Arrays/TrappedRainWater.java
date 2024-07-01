public class TrappedRainWater {
    public static int TrappingWater(int height[]) {
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        // find left maximum boundary
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i] , leftMax[i - 1]);
        }

        // find right maximum boundary
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i] , rightMax[i + 1]);
        }

        // find Trapped Water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min( leftMax[i], rightMax[i]);

            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // int height[] = {5, 9, 2, 4, 6, 12};
        System.out.println(TrappingWater(height));

    }
}
