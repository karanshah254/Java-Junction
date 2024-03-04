public class trapping_water_code {
    // Given n non negetive number representing an elevation map where widht of each
    // bar is 1, compute how much water it can trap after rain
    public static int trapped_water(int height[]) {
        int n = height.length;
        int trappedWater = 0;
        // calculate left max array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop for trapped water
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int waterLevel = trapped_water(height);
        System.out.println("The water level is " + waterLevel);
    }
}
