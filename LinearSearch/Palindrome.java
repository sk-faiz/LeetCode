class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int match = x;
        if (x < 0) {
          return false;  
        } else {
            if (x == 0) {
                return true;
            } else {
                while (x != 0) {
                    int pop = x % 10;
                    x /= 10;
                    rev = rev * 10 + pop;
                }
                if (rev == match) {
                    return true;
                } else {
                    return false;
                }      
            }
        }
    }
}