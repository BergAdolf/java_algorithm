//动态规划法
//关键在于求出f(i) = max{f(i - 1) + nums[i],num[i]}
//f(i - 1)如果是零的话就不能加上
class Solution {
    public int maxSubArray(int[] nums) {
        int[] a = new int[nums.length];
        int b = 0;
        int temp;
        int max;
    	for(int i = 0; i < nums.length; i++){
    		if(b >= 0){
    			temp = b + nums[i];
    		}
    		else{
    			temp = nums[i];
    		}
    		b = temp;
    		if(temp > max)
    		{
    			max = temp;
    		}
    	}
    	return max;
}