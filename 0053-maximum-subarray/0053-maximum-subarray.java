class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            throw new IllegalArgumentException("Array can't be null");
        }
        
        int max_num = nums[0];
        int cur_num = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            
            cur_num = Math.max(nums[i], cur_num + nums[i]);
                max_num = Math.max(cur_num, max_num);
        }
        return max_num;
    }
}