class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length < 1)
            return 1;
        boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                flag = true;
                nums[i] = 1;
            }
            if(nums[i] <= 0)
                nums[i] = 1;
        }
        if(!flag){
            return 1;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= nums.length){
                nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
            }

        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i] >= 0){
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}class Solution {
    //使用原地哈希方法，对得到的数置负数，先判断1有没有存在，然后负数都放到里面去，如果有重复数的话，得加负号。
    public int firstMissingPositive(int[] nums) {
        if(nums.length < 1)
            return 1;
        boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                flag = true;
                nums[i] = 1;
            }
            if(nums[i] <= 0)
                nums[i] = 1;
        }
        if(!flag){
            return 1;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= nums.length){
                nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
            }

        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i] >= 0){
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}