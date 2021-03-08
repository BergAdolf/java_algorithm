class Solution {
    public int lengthOfLongestSubstring(String s) {
        //使用哈希表和滑动窗口的方法
        
        if(s.length() < 1){
            return 0;
        }
        int len = 1;
        int maxLen = 1;
        int left = 1;
        int temp;
        Map<Character,Integer> list = new HashMap<>();
        list.put(s.charAt(0),0);
        for(int i = 1; i < s.length();i++){
            if(list.containsKey(s.charAt(i))){
                left = list.get(s.charAt(i)) + 1;
                temp = left;
                maxLen = Math.max(maxLen, len);
                list.clear();
                len = 0;
                while(temp <= i){
                    list.put(s.charAt(temp),temp);
                    temp = temp + 1;
                    len = len + 1;
                }             
            }
            else{
                list.put(s.charAt(i),i);
                len = len + 1;
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}