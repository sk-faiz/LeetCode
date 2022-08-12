class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int j : nums) {
            if (even(j)) {
                count++;
            }
        }
        return count;
    }
    
    static int digits2(int nu) {
        return (int)(Math.log10(nu) + 1);
    }
    
    
     boolean even (int num) {
        int eve = digits2(num);
        return eve % 2 == 0;
    }
    
}