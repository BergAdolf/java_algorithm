//暴力解法
class Solution {
    public int maxArea(int[] height) {
        int h,max = 0;
        for(int i = 0; i < height.length; i++){
            for(int j = i + 1; j < height.length; j++){
              h = height[i] >= height[j]? height[j]:height[i];
              if(max < h * (j - i))
                max = h * (j - i);
            }
        }
        return max;
    }
}
