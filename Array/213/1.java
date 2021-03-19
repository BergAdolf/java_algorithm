//dp[n + 1] = max(dp[n], dp[n - 1] + val)
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
    	return Math.max(maxValue(Arrays.copyOfRange(nums, 0, nums.length - 1)), maxValue(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    public int maxValue(int[] nums){
    	int dp1 = 0;//n - 1
    	int dp2 = 0;//n
    	int temp;
    	for(int i: nums){
    		temp = dp2;
    		dp2 = Math.max(dp2, dp1 + i);
    		dp1 = temp;
    	}

    	return dp2;
    }
}