class Solution {
    public int[] twoSum(int[] nums, int target) {
       
       int left = 0;
       int right = nums.length - 1;

       while(right >= left){
       		if(nums[left] + nums[right] > target){
       			right--;
       		}
       		else if(nums[left] + nums[right] < target){
       			left++;
       		}else{
       			return new int[]{nums[left], nums[right]};
       		}
       }
       return new int[]{};

    }
}