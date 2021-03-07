class Solution{
	//单边列
	public int trap(int[] height){
        if(height.length < 3)
            return 0;

		int[] max_left = new int[height.length];
		int[] max_right = new int[height.length];
		int value = 0;
		int temp = height[0];
		for(int i = 0; i < height.length; i++){
			if(temp < height[i])
				temp = height[i];
			max_right[i] = temp;
		}

		temp = height[height.length - 1];
		for(int j = height.length - 1; j >= 0; j--)
		{
			if(temp < height[j])
				temp = height[j];
			max_left[j] = temp;
		}

        for(int i = 0; i < height.length; i++){
            temp = max_left[i] >= max_right[i]? max_right[i]:max_left[i];
            value = value + temp - height[i];
        }
        return value;
	}
}