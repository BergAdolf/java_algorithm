//暴力解法
class Solution {
    public int maxProfit(int[] prices) {
        int maxValue = 0;
        for(int i = 0; i < prices.length - 1; i++){
            int right = prices[i + 1];
            for(int j = i + 1; j < prices.length; j++){
                if(right < prices[j]){
                    right = Math.max(right, prices[j]);
                }
            }
            maxValue = Math.max(maxValue, right - prices[i]);
        }
        return maxValue;
    }
}