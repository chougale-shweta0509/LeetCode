class Solution {
    public int majorityElement(int[] num) {
        int res = num[0];
        int count = 1;
        
        for(int i = 0; i< num.length; i++){
            int num1 = num[i];
            if(res == num1){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                res = num1;
                count = 1;
            }
        }
        return res;
    }
}