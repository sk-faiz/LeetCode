class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        
        if (n != 0) {
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        return b;    
        } else {
            return 0;
        }
        
    }
}