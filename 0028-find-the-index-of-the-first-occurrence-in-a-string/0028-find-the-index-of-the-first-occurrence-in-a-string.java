class Solution {
    public int strStr(String str, String sub) {
        return str.indexOf(sub);
        
        //both are correct
//         int strleng = str.length();
//         int subleng = sub.length();
        
//         for(int i = 0; i <= strleng - subleng; i++){
//             if(str.substring(i , i + subleng).equals(sub)){
//                 return i;
//             }
//         }
//         return -1;
    }
}