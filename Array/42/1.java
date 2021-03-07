class Solution {
    //按两边列求解
    //两个循环实现
    public int trap(int[] height) {
        int max_left, max_right;
        int value = 0;
        for(int i = 0; i < height.length; i++){
            max_left = 0;
            max_right = 0;
            for(int j = 0; j <= i; j++)
            {
                max_left = Math.max(max_left, height[j])
            }
            for(int k = height.length - 1; k >= i; k--)
            {
                max_right = Math.max(max_right, height[k]);
            }
            value = value + Math.min(max_left, max_right) - height[i];;
        }
        return value;

    }
}