class Solution {
    //暴力解法
    //空间复杂度为O(n2),时间复杂度是O(1)
    //使用中也可不计算right，采用left+len的方法作为输出。
    //另一种暴力解法可由中心开始进行扩散，有奇数和偶数两种区别。在子函数中做判断即可。
    public String longestPalindrome(String s) {
        if(s.length() < 1)
            return "";
        int len = 0;
        int left = 0;
        int right = 1;

        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                if(j - i > len && isCircleString(s.substring(i,j))){
                    len = j - i;
                    left = i;
                    right = j;
                }
            }
        }
        return s.substring(left,right);

    }
    public Boolean isCircleString(String s1){
        int left = 0;
        int right = s1.length() - 1;
        while(left < right){
            if(s1.charAt(left) != s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}