//递归法、会有堆栈溢出风险
class Solution {
    public double myPow(double x, int n) {
        
        if(x == 1.0){
            return 1;
        }
        boolean flag = false;
        if(n < 0){
            flag = true;
            return 1 / getMyPow(x, -n);
        }

        return getMyPow(x, n);
    }
    public double getMyPow(double x, int n){
        if(n == 0)
            return 1;
        if(n == 1)
            return x;

        double result = getMyPow(x, n >> 1);
        result *= result;

        if((n & 1) == 1){
            result = result * x;
        }
        return result;
    }
}