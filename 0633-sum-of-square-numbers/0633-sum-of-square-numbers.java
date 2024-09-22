public class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c); // Start right at the largest integer whose square is <= c

        while (left <= right) {
            long sumOfSquares = (long) left * left + (long) right * right;

            if (sumOfSquares == c) {
                return true; // Found a pair (a, b) such that a^2 + b^2 = c
            } else if (sumOfSquares < c) {
                left++; // Move left pointer up to increase the sum
            } else {
                right--; // Move right pointer down to decrease the sum
            }
        }

        return false; // No such pair found
    }
}
