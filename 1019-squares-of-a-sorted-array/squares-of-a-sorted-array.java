class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length;
        int [] result = new int[n];

        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        int left = 0;
        int right = nums.length-1;

        for(int j = nums.length-1; j >= 0; j-- ){
            if(nums[left] > nums[right]){
                result[j] = nums[left];
                left++;
            }
            else{
                result[j] = nums[right];
                right--;
            }
        }
        return result;
    }
}