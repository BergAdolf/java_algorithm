public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;

        while(n != 0){
        	count += (1 & n);
        	n = n >>> 1;//n>>1不是一个语句
        	//>>>是对无符号数的，>>是对有符号数的
        }
        return 0;
    }
}