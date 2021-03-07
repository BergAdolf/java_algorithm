class Solution {
	//栈
	//加上哨兵
	public int largestRectangleArea(int[] heights) {
		Deque<Integer> stack = new ArrayDeque<Integer>(); //创建一个栈;
		if(heights.length < 1)
			return 0;
		if(heights.length < 2)
			return heights[0];

		int maxValue = heights[0];
		int width;
		int[] num = new int[heights.length + 2];

		for(int i = 0; i < heights.length; i++){
			num[i + 1] = heights[i];
		}
		num[0] = -1;
		num[heights.length + 1] = -1;

		stack.addFirst(0);
		for(int i = 1; i < heights.length + 2; i++){
			while(num[stack.peekFirst()] > num[i]){
				int height = num[stack.removeFirst()];

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
		return maxValue;
	}	
class Solution {
	//栈
	//加上哨兵
	public int largestRectangleArea(int[] heights) {
		Deque<Integer> stack = new ArrayDeque<Integer>(); //创建一个栈;
		if(heights.length < 1)
			return 0;
		if(heights.length < 2)
			return heights[0];

		int maxValue = heights[0];
		int width;
		int[] num = new int[heights.length + 2];

		for(int i = 0; i < heights.length; i++){
			num[i + 1] = heights[i];
		}
		num[0] = -1;
		num[heights.length + 1] = -1;

		stack.addFirst(0);
		for(int i = 1; i < heights.length + 2; i++){
			while(num[stack.peekFirst()] > num[i]){
				int height = num[stack.removeFirst()];

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
		return maxValue;
	}	
}