//维护一个数组，采用二分法进行替换操作
class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = 1, n = nums.length;
        if (n == 0) {
            return 0;
        }

        int[] d = new int[n + 1];
        d[len] = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] > d[len]) {
                d[++len] = nums[i];
            } else {
               int l = 1;
               int r = len;
               while(l < r){
                   int mid = (l + r) >> 1;
                   if(nums[i] > d[mid]){
                       l = mid + 1;
                   }else if(nums[i] < d[mid]){
                       r = mid;
                   }else{
                       break;
                   }
               }
                if(l == r)
                    d[l] = nums[i];
            }
        }
        return len;
    }
}