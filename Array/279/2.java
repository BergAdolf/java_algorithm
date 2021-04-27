//动态规划法
//时间复杂度O（n * sqrt(n)）
//空间复杂度 O（n）
class Solution {
    public int numSquares(int n) {
        
        int[] nums = new int[n + 1];
        Arrays.fill(nums, Integer.MAX_VALUE);
        int s = (int)Math.sqrt(n);
        int[] square_nums = new int[s + 1];

        square_nums[0] = 0; 
        for(int i = 1; i <= s; i++){
            square_nums[i] = (int)Math.pow(i, 2);
        }

        nums[0] = 0;
        
        for(int i = 1; i <= n; i++){
            for(int t = 1; t <= s; ++t){
                if(i < square_nums[t])
                    break;
                nums[i] = Math.min(nums[i], nums[i - square_nums[t]] + 1);
            }
        }

        return nums[n];
    }