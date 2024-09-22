class Solution {
    public int mySqrt(int x) {
        if( x < 2){
            //0 & 1 are sqrt of itself
            return x;
        }
        //0 & 1 are sqrt of itself
        int left = 2, right = x/2;
        
        while(left <= right){
            //get mid first
            int mid = left + (right - left) / 2;
            
            //typecast to long
            long square = (long) mid*mid;
            
            if(square == x){
                return mid;
            }else if(square < x){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return right;
    }
}