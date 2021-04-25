class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> map = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
        	if(map.contains(nums[i])){
        		return new int[]{nums[i], target - nums[i]};
        	}
        	map.add(target - nums[i]);
        }
        return new int[]{};
    }
}