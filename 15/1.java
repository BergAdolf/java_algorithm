//测试用例全部通过，但所用时间很长。
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();

        if(nums.length < 3)
            return list;

        Arrays.sort(nums);
        int c;
        for(int i = 0; i < nums.length - 2; i++)
        {
            if(nums[i] > 0)
                break;
            if(i != 0 && nums[i] == nums[i - 1])
                continue;

            c = nums.length;  //设置标识使得第三重循环的起始点变化
            for(int j = i + 1; j <= c - 1; j++)
            {
                if(j != i + 1 && nums[j] == nums[j - 1])
                    continue;
                
                for(int k = c - 1; k > j; k--)
                {
                    if(nums[i] + nums[j] + nums[k] == 0)
                    {
                        c = k;
                        List<Integer> a = new ArrayList();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        list.add(a);
                        break;
                    }       
                }
            }
        }
        return list;
    }
