class Solution {
    //动态规划法
    public String longestPalindrome(String s) {
        if(s.length() < 2)
            return s;
        int len = s.length();
        int maxLen = 1;
        int left = 0;
        Boolean[][] a = new Boolean[len][len];

        for(int i = 0; i < len; i++){
            a[i][i] = true;
        }

        for(int j = 1; j < len; j++){
            for(int i = 0; i < j; i++){
                if(s.charAt(i) != s.charAt(j)){
                    a[i][j] = false;
                }
                else{
                    if(j - i < 3){
                        a[i][j] = true;
                    }
                    else{
                        a[i][j] = a[i + 1][j - 1]; 
                    }
                }

                if(a[i][j] && (j - i + 1 > maxLen)){
                    left = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(left, left + maxLen);
    }
}