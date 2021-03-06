//金字塔形式
//length - 1的所有子集加上nums[length]的就可以
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        if(nums.length < 1)
            return new ArrayList<List<Integer>>();  //返回空集

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        int number = 1;
        list.add(0,new ArrayList());
        int len;
        for(int i = 0; i < nums.length; i++){
            
            len = list.size();
            for(int j = 0; j < len; j++){
                sublist = new ArrayList(list.get(j));
                sublist.add(nums[i]);
                list.add(number,new ArrayList<>(sublist));
                number = number + 1;
            }
        }
        return list;
    }
}