class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        //to max area of water contained
        int ans = 0;
        while(i < j){
            //to calculate area
            int t = Math.min(height[i], height[j]) * (j - i);
            ans = Math.max(ans, t);
            if(height[i] < height[j]){
                ++i;
            }else{
                --j;
            }
        }
        return ans;
    }
}