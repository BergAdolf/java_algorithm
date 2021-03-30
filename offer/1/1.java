//二分法
class Solution {
    public int search(int[] nums, int target) {
    	int left = 0;
    	int high = nums.length - 1;
    	int mid = (left + high)>>1;		//注意修改

    	boolean flag = false;
    	while(left <= high){
    		if(nums[mid] > target){
    			high = mid - 1;
    		}else if(nums[mid] < target){
    			left = mid + 1;
    		}else{
    			flag = true;
    			break;
    		}
            mid = (left + high)>>1;		//1循环变化
    	}

    	int midleft = mid;
    	int midright = mid;
    	int number = -1;
    	if(!flag){
    		return 0;
    	}else{//记得边界啊
    		while((midleft >=0 && nums[midleft] == target) || (midright <= nums.length - 1 && nums[midright] == target)){
    			if(midleft >=0 && nums[midleft] == target){//要和上面一样啊
    				midleft--;
    				number++;
    			}
    			if(midright <= nums.length - 1 && nums[midright] == target){
    				midright++;
    				number++;
    			}
    		}
    	}

   		return number;
    }
}