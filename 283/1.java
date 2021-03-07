class Solution {
    //单指针
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){        
            if(nums[i] != 0){
                nums[k] = nums[i];
                k = k + 1;
            }
        }
        while(k < nums.length){
            nums[k] = 0;
            k = k + 1;
        }

    }
}