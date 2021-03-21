//递归法
//超出时间限制
class Solution {
    public int climbStairs(int n) {
        return searchWay(n, 0, 0);
    }
    public int searchWay(int n,int k, int sum){
        if(k == n){
            return sum + 1;
        }
        if(k > n)
            return sum;
        sum = searchWay(n, k + 1, sum);
        sum = searchWay(n, k + 2, sum);

        return sum;
    }
}