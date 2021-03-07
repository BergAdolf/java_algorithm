class Solution {
    //双指针
    public void moveZeroes(int[] nums) {
        int left= 0, right = 0;
        while(nums.length > right){//right用于侦测是否为0

            if(nums[right] != 0){
                swap(nums, left, right);
                left = left + 1;
            }
            right++;
        }

    }
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}