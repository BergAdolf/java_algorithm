class Solution {
    public int[] singleNumbers(int[] nums) {
        int ret = 0;
        for (int n : nums) {
            ret ^= n;
        }
        int div = 1;
        while ((div & ret) == 0) { //&要括号
            div <<= 1;
        }
        int a = 0, b = 0;
        for (int n : nums) {
            if ((div & n) != 0) {//条件要清晰
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a, b};
    }
}