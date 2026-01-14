	class Solution {
    public boolean isPalindrome(int x) {
        // Special cases:
        // 1. Negative numbers are not palindromes (e.g., -121).
        // 2. Numbers ending in 0 (except 0 itself) are not palindromes (e.g., 10, 200).
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        
        // Reverse digits until we reach the middle of the number
        while (x > reversedHalf) {
            int lastDigit = x % 10;
            reversedHalf = (reversedHalf * 10) + lastDigit;
            x /= 10;
        }

        // For even-length numbers: x should equal reversedHalf (e.g., 1221 -> x=12, reversedHalf=12)
        // For odd-length numbers: x should equal reversedHalf/10 (e.g., 12321 -> x=12, reversedHalf=123)
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
