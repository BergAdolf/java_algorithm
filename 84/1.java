class Solution {
	//暴力解法，无法通过全部，在实现中采用了两个哨兵
	public int largestRectangleArea(int[] heights) {

		int maxValue = 0,temp;

		int[] nums = new int[heights.length + 2];
		for(int i = 1; i < heights.length + 1; i++){
			nums[i] = heights[i - 1];
		}
		nums[0] = -1;
		nums[nums.length - 1] = -1;

		for(int i = 1; i < heights.length + 1; i++){
			int left = i - 1;
			int right = i + 1;
			while(nums[left] >= nums[i]){
				left = left - 1;
			}
			while(nums[right] >= nums[i]){
				right = right + 1;
			}

			temp = (right - left - 1) * nums[i];
			maxValue = temp > maxValue? temp:maxValue;
		}
        return maxValue;
	}	
}