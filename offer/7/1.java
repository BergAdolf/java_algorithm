class Solution {
    public int singleNumber(int[] nums) {
    	int[] counts = new int[32];
    	for(int num: nums){
    		for(int j = 0; j < 32; j++){
    			counts[j] += num & 1;
    			num >>= 1;
    		}
    	}

    	int res = 0;
    	int m = 3;
    	for(int i = 0; i < 32; i++){
    		res <<= 1;
    		res |= counts[31 - i] % m;
    	}
    	return res;
    }

}