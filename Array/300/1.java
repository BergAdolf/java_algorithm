//dp
class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int maxValue = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if(nums[i] > nums[j])
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
            }
            maxValue = Math.max(dp[i], maxValue);
        }
        return maxValue;
    }
}