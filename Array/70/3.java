class Solution {
	//时间复杂度:O(n)
	//空间复杂度：O(n)
    public int climbStairs(int n) {
    	int meno[] = new int[n + 1];
        return searchWay(n, memo);
    }
    public int searchWay(int n,int[] memo){
        if(memo[n] > 0){
            return memo[n];
        }
        if(n == 1){
            memo[n] = 1;
        }
        else if(n == 2)
        {
        	memo[n] = 2;
        }
        else{
        	memo[n] = searchWay(n - 1, memo) + searchWay(n - 2, memo);
        }
        return memo[n];
    }
}