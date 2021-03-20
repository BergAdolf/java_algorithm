class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        int temp;

        while(i >= 0){
        	if(nums[i] < nums[i + 1])
        	{
        		int j = nums.length - 1;
        		while(j > i){
        			if(nums[j] > nums[i]){
        				temp = nums[i];
        				nums[i] = nums[j];
        				nums[j] = temp;
        				break;
        			}
        			j--;
        		}

                int left = i + 1;
                int right = nums.length - 1;
                while(left < right){
                	temp = nums[left];
                	nums[left] = nums[right];
                	nums[right] = temp;
                	right--;
                	left++;
                }
                break;
        	}
        	i--;
        }
        if(i == -1)
        {
        	Arrays.sort(nums);
        }
    }
}