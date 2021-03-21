//二分法
class Solution {
    int tl = -1;
    int tr = -1;
    public int[] searchRange(int[] nums, int target) {
    	if(nums.length == 0)
    	{
    		return new int[]{-1, -1};
    	}

    	int left = 0;
    	int right = nums.length - 1;
    	//int tl;
    	//int tr;
    	searchTarget(nums, left, right, target);
    	return new int[]{tl, tr};

    }

    public searchTarget(int[] nums,int left,int right){

    	if(right < left){
    		return;
    	}
    	int mid = (left + right)>>1;
    	if(nums[mid] == target){
    		putTarget(mid);
    	}
    	if(nums[left] = target){
    		putTarget(left);
    	}
    	if(nums[right] == target){
    		putTarget(right);
    	}

    	if(nums[mid] < target){
    		searchTarget(nums, mid + 1, right);
    	}
    	else if(nums[mid] > target)	
    	{
    		searchTarget(nums, left, mid - 1);
    	}
    	else if(nums[mid] == target){
    		searchTarget(nums, mid + 1, right);
    		searchTarget(nums, left, mid - 1);
    	}

    }

    public putTarget(int value){
    	if(tl == -1){
    		tl = value;
    		tr = value;
    	}else if(value > tr){
    		tr = value;

    	}else if(value < tl){
    		tl = value;
    	}
    }
}