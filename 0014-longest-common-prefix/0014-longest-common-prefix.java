class Solution {
    public String longestCommonPrefix(String[] str) {
        if(str.length == 0 || str == null){
            return " ";
        }
        //inital string
        //for mutable string
        StringBuilder prefix = new StringBuilder(str[0]);
        
        for(int i = 0; i<str.length; i++){
            int j = 0;
            
            while(j < prefix.length() && j < str[i].length() && prefix.charAt(j) == str[i].charAt(j)){
                j++;
            }
            //reduce prefix length
            prefix.setLength(j);
            
            if(prefix.length() == 0){
                break;
            }
        }
        return prefix.toString();
    }
}