class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // 1. Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // 2. Assume first window has maximum sum
        int maxSum = sum;

        // 3. Slide the window
        for (int i = k; i < nums.length; i++) {

            // Remove old element and add new element
            sum = sum - nums[i - k] + nums[i];

            // Update maximum sum
            maxSum = Math.max(maxSum, sum);
        }

        // 4. Convert maximum sum into average
        return (double) maxSum / k;
    }
}