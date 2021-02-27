//双指针法
class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while(j > i){
            if(height[i] <= height[j]){
                maxArea = (j - i) * height[i] > maxArea? (j - i) * height[i]:maxArea;
                i++;
            }
            else{
                maxArea = (j - i) * height[j] > maxArea? (j - i) * height[j]:maxArea;
                j--;
            }

        }
        return maxArea;
        
    }
}
