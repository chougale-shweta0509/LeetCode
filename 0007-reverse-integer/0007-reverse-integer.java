class Solution {
    public int reverse(int x) {
       long reverse = 0;
		int rem = 0;
		int num = x;
		
		while(num != 0) {
			rem = num % 10;
			reverse = (reverse * 10) + rem;
			num = num / 10;
		}
		
		if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
			return 0;
		}

		return (int)reverse;
    }
}