class Solution {
    //哈希表
    //空间复杂度不满足
    public int findDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<>();

        for(int num:nums){
            if(list.contains(num)){
                return nums;
            }
            list.add(num);
        }
        return -1;
    }
}