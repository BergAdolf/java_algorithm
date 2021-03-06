class Solution {
    //贪心法
    //最大值 当前值
    public int maxSubArray(int[] nums) {
        int maxValue = nums[0];//表示最大值
        //int currentValue = num[0];
        int currentValueOfSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            //currentValueOfSum = currentValueOfSum + nums[i];
            if(currentValueOfSum < 0){
                currentValueOfSum = 0;
            }
            currentValueOfSum = currentValueOfSum + nums[i];
            if(currentValueOfSum > maxValue){
                maxValue = currentValueOfSum;
            }
        }
        return maxValue;
    }
}