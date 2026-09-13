public class WaterContainer {
    public int maxArea(int[] height) {
        int st = 0;
        int end = height.length - 1;
        int maxArea = 0;

        while (st < end) {
            // Calculate width and height to find current area
            int currentArea = Math.min(height[st], height[end]) * (end - st);
            maxArea = Math.max(currentArea, maxArea);

            // Move the pointer pointing to the shorter line inward
            if (height[st] < height[end]) {
                st++;
            } else {
                end--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        WaterContainer solution = new WaterContainer();

        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area: " + solution.maxArea(height1)); // Expected: 49
    }
}
