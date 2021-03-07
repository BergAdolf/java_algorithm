class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();

        if(nums.length < 3)
            return list;

        Arrays.sort(nums);
        int b,c;
        for(int i = 0; i < nums.length - 2; i++)
        {
            if(nums[i] > 0)  //大于0则不可能存在
                break;
            if(i != 0 && nums[i] == nums[i - 1])  //去除第一个相同的情况
                continue;
            b = i + 1;
            c = nums.length - 1;

            while(b < c){
                if(nums[i] + nums[b] + nums[c] == 0){
                    List<Integer> a = new ArrayList();
                    a.add(nums[i]);
                    a.add(nums[b]);
                    a.add(nums[c]);
                    list.add(a);
                    while(b < c)
                    {
                        b++;
                        if(nums[b] != nums[b - 1])
                            break;
                    }
                }
                else if(nums[i] + nums[b] + nums[c] < 0){
                    b++;
                }
                else{
                    c--;
                }

            }



        }
        return list;
    }
}