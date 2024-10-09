class Solution {
    public char repeatedCharacter(String s) {
        
        HashSet<Character> hs = new HashSet<>();
        for(char c : s.toCharArray()){
            if(!hs.add(c)){
                return c;
            }
        }
        return 0;
    }
}