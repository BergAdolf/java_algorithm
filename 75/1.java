class Solution {
	//双指针，快速排序
    public void sortColors(int[] nums) {
    	if(len < 2)
    		return;

        int p0 = 0;
        int p2 = nums.length - 1;
        int i = 0;
        while(p2 >= i){
        	if(nums[i] == 0){
        		swap(nums, p0, i);
        		p0++;
                i++;
        	}
        	else if(nums[i] == 1){
        		i++;
        	}
        	else{
        		swap(nums, p2, i);
        		p2--;
        	}

        }
    }
    public void swap(int[] nums,int a, int b){
    	int temp;
    	temp = nums[a];
    	nums[a] = nums[b];
    	nums[b] = temp;
    }
}