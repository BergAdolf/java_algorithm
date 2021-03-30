//异或运算
//时间复杂度：O(n)
//空间复杂度：O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int temp = 0;

        for(int i: nums){
        	temp = temp ^ i;
        }

        return temp;
    }
}