//找0算法，然后向前推

class Solution {
    public boolean canJump(int[] nums) {
    	int t; 
    	Boolean flag = false;

    	for(int i = 0; i < nums.length; i++){
    		if(nums[i] == 0){
    			t = i - 1;
    			while(t >= 0){
    				if(i - t < nums[t]){
    					flag =true;
    					break;
    				}
    				t--;
    			}

    			if(!flag)
    				return false;
    		}
    	}
    	return true;
    }
}