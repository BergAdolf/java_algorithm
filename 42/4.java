package berg;
import java.util.*;
class test{
	public int trap(int[] height){
		if(height.length < 3)
			return 0;
		Deque<Integer> stack = new ArrayDeque<Integer>();//创建一个stack
		int temp = height[0];
		int value = 0;
		stack.addLast(height[0]);
		for(int i = 1; i < height.length; i++){
			if(height[i] >= temp){
				for(int j = 1; j < stack.size(); j++)
					value += temp - stack.removeLast();
				stack.removeLast();
				stack.addLast(height[i]);
				temp = height[i];
			}
			else{
				stack.addLast(height[i]);
			}
		}
		return value;

	}
}