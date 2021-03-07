class Solution{
	//采用双指针处理
	public int trap(int[] height){
		if(height.length < 3)
			return 0;

		int left_max = 0;
		int right_max = 0;
        int value = 0;
		int left = 0;
		int right = height.length - 1;
		while(left < right){
			if(height[left] < height[right]){
				if(height[left] > left_max){
					left_max = height[left];
                }
				else{
					value = value + left_max - height[left];
				}
				left = left + 1;
			}
            else{
				if(height[right] > right_max){
					right_max = height[right];
				}else{
					value = value + right_max - height[right];
				}
				right = right - 1;
			}
		}
        return value;
	}
}