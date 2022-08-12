class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int moni = 0; moni < accounts.length; moni++) {
            int money = 0;
            for (int cash = 0; cash < accounts[moni].length; cash++) {
                money += accounts[moni][cash];
            }

            if (money > ans) {
                ans = money;
            }
        }
        return ans;
    }

}