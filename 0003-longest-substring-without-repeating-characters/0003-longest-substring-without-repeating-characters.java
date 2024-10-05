class Solution {
    public int lengthOfLongestSubstring(String s) {
       int right = 0, left = 0;
        int max = 0;
        Set<Character> seen = new HashSet<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            if (seen.add(c)) {
                // If 'c' is added successfully (not a duplicate)
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                // If 'c' is a duplicate, move the left pointer
                while (s.charAt(left) != c) {
                    seen.remove(s.charAt(left));
                    left++;
                }
                
                seen.remove(c);
                // Move left pointer to skip the duplicate character
                left++;
                // Increment right to continue checking
                //right++;
            }
        }

        return max;
    }
}