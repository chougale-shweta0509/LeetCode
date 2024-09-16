class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map <String, Integer> cnt1 = new HashMap<>();
        Map <String, Integer> cnt2 = new HashMap<>();
        
        for(String w : words1){
           cnt1.merge(w, 1, Integer :: sum);
        }
        
        for(String w : words2){
            cnt2.merge(w, 1, Integer :: sum);
        }
        
        int count = 0;
        for(var e : cnt1.entrySet()){
            if(e.getValue() == 1 && cnt2.getOrDefault(e.getKey(), 0) == 1){
                count++;
            }
        }
        return count;
    }
}