//回溯法
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        f(nums, 0, new ArrayList<>(), res);
        return res;
    }
    private void f(int[] nums, int idx, List<Integer> list, List<List<Integer>> res) {
        if(idx <= nums.length) {
            res.add(new ArrayList<>(list));
        }
        for(int i = idx; i < nums.length; i++) {
            list.add(nums[i]);
            f(nums, i + 1, list, res);
            list.remove(list.size()-1);
        }
    }
}