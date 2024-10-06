class Solution {
    public boolean rotateString(String s, String goal) {
        
        //1st step is check equals with s and goal
        //2nd step check concate contains goal
        return(s.length()==goal.length() && (s+s).contains(goal));
    }
}