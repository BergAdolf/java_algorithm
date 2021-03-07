class Solution {
    //哈希表法
    //没有采用常数级别的内存
    public int firstMissingPositive(int[] nums) {
        if(nums.length < 1)
            return 1;
        Set<Integer> list = new HashSet<>();
        int maxValue = nums[0];
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
            if(maxValue < nums[i])
                maxValue = nums[i];
        }

        for(int i = 1; i <= maxValue; i++){
            if(!list.contains(i))
                return i;
        }
        if(maxValue <= 0)
            return 1;
        else{
            return maxValue + 1;
        }
        
    }
}