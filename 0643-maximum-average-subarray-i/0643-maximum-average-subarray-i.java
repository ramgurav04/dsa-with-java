class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: Compute the sum of the first window of size k
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        double maxSum = currentSum;

        // Step 2: Slide the window from index k to the end of the array
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        // Step 3: Return the maximum average
        return maxSum / k;
    }
}