class Solution {
	//栈
	public int largestRectangleArea(int[] heights) {
		Deque<Integer> stack = new ArrayDeque<Integer>(); //创建一个栈;
		if(heights.length < 1)
			return 0;
		if(heights.length < 2)
			return heights[0];

		int maxValue = heights[0];
		int width;
		for(int i = 0; i < heights.length; i++){
			while(!stack.isEmpty() && heights[stack.peekFirst()] > heights[i]){
				int height = heights[stack.removeFirst()];

				if(!stack.isEmpty()){
					width = i - stack.peekFirst() - 1;	
				}
                else{
					width = i;
				}

				maxValue = Math.max(maxValue, width * height);
			}
			stack.addFirst(i);
		}

		while(!stack.isEmpty()){
			int height = heights[stack.removeFirst()];

			if(!stack.isEmpty()){
				width = heights.length - stack.peekFirst() - 1;	
			}
            else{
				width = heights.length;
			}
            maxValue = Math.max(maxValue, width * height);
		}
		return maxValue;
	}	
