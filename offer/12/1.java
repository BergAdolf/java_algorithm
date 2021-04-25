class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    	int current = Integer.MIN_VAULE;
    	int max = Integer.MIN_VAULE;
    	List<Integer> list = new ArrayList<>();
    	int[] a;

    	for(int i = 0; i < nums.length; i++){
    		if(current + nums[i] < 0){
    			current = nums[i];
    			list.removeAll();
    			list.add(nums[i]);
    		}else{
    			current = current + num[i];
    			list.add(nums[i]);
    		}
    		if(curent > max){
    			max = current;
    			a = list.toArray();
    		}
    	}

    }
}