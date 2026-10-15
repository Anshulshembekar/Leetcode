class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int WindowSum = 0;
        for(int i = 0; i < k; i++){
            WindowSum += nums[i];
        }

        int MaxSum = WindowSum;

        for(int j = k; j < nums.length; j++){
            WindowSum = WindowSum + nums[j] - nums[j-k];

              MaxSum = Math.max(WindowSum,MaxSum);
        
        }
         return (double)MaxSum/k;
    }
   
}