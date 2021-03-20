class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            }
            return -1;
        }

        if(target < nums[0] && target > nums[nums.length -1]){
            return -1;
        }
        
        int left = 0; 
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right)>>1;

            if(target == nums[mid])
            	return mid;
            if(nums[0] <= nums[mid]){//在A区域
                if(target > nums[mid]){
                    left = mid + 1;
                }
                else if(target < nums[0]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }

            }else{//在B区域
                if(target < nums[mid]){
                    right = mid - 1;
                }
                else if(target >  nums[nums.length - 1]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
               
        }
        return -1;

    }
}