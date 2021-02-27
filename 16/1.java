class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        if(target < nums[0] + nums[1] + nums[2])  //如果小于最小的三个值，则三个值为最接近的值
            return nums[0] + nums[1] + nums[2];
        if(target > nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3])
            return nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];

        int minValue = nums[0] + nums[1] + nums[2]; //全局最小值
        int d = Math.abs(minValue - target);
        int a,b;
        for(int i = 0; i < nums.length - 2; i++)
        {   
            a = i + 1;
            b = nums.length - 1;
            while(a < b){
                if(Math.abs(nums[a] + nums[b] + nums[i] - target) < d)
                {
                    minValue = nums[a] + nums[b] + nums[i];
                    d = Math.abs(minValue - target);
                }
                //顺序不要颠倒

                if(nums[a] + nums[b] + nums[i] == target){
                    return target;
                }
                else if(nums[a] + nums[b] + nums[i] > target){
                    b--;
                }
                else{
                    a++;
                }
            }

        }
        return minValue;
    }
}