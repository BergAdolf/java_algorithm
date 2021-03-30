//速度贼慢
class Solution {
    public int missingNumber(int[] nums) {
        
        int lastnumber = -1;
 		int temp;
 		//int tempIndex;
        for(int i = 0; i < nums.length; i++ ){
        	int k = i;

        	while(nums[k] != k && nums[k] != nums.length){
        		
        		temp = nums[nums[k]];
        		nums[nums[k]] = k;
        		nums[k] = temp;

        	}
        }

        for(int i = 0; i < nums.length; i++){
        	if(nums[i] != i)
        		return i;
        }
        return nums.length;
    }
}