//打家劫舍
//i.val + (i + 1).不偷 = i.偷
//max((i + 1).不偷,(i + 1).偷) = i.偷
//时间复杂度: O(n)
//空间复杂度：O(1)
class Solution {
    public int rob(int[] nums) {
        int i = nums.length - 1;
        int y = nums[i]; //上一个偷
        int n = 0;//上一个不偷
        
        i = i - 1;
        int temp = n;
        while(i  >= 0){
            temp = n;
            n = Math.max(y, n);
            y = nums[i] + temp;
            i--;
        }

        return Math.max(n, y);

    }
}