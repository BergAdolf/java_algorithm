class Solution {
    //暴力解法
    //时间复杂度是O(N3),空间复杂度是O(n)
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() < 1){
            return 0;
        }
        int len = 0;
        int maxLen = 0;
        List<Character> a = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length();j++){
                if(a.contains(s.charAt(j))){  //substring 中间string不是大写的
                    a.clear();
                    len = 0;
                    break;
                }
                else{
                    len = len + 1;
                    a.add(s.charAt(j));
                    maxLen = Math.max(maxLen, len);
                }
            }
        }
        return maxLen;
    }
}