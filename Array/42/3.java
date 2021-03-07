//堆栈法
class Solution{
	public int trap(int[] height){
		if(height.length < 3)
			return 0;

		Stack<Integer> stack = new Stack<Integer>();//创建一个stack
		int distance = 0;
		int value = 0;
		int top = 0;
		int current = 0;
		int tall = 0;

		while(height.length > current){
			while(!stack.empty() && height[current] > height[stack.peek()]){ //大于或者等于max,意味着可以弹出元素
				top = stack.pop();
				if(stack.empty())
					break;
				distance = current - stack.peek() - 1;
				tall = Math.min(height[current], height[stack.peek()]) - height[top];
				value = value + tall * distance;
			}
			stack.push(current);//，如果小于max,添加元素
			current = current + 1;
		}
		return value;

	}
}