cclass Solution {
    //回溯法在面对较大的值的时候无能为力
    public int uniquePaths(int m, int n) {
        int value = run(m,n,1,1,0);
        return value;
    }
    
    public int run(int m, int n, int x, int y, int value){
        int temp = value;
        if(m == y && n == x) {
            value = 1;
            return value;
        }
        if(x == n && y != m){
            value += run(m, n, x, y + 1, value);
        }
        else if(y == m && x != n){
            value += run(m, n, x + 1, y, value);
        }
        else{
            value += run(m, n, x, y + 1, temp);
            value += run(m, n, x + 1, y, temp);  //调用的时候不能直接使用value的值进行调用，
                                                //会导致同一路线的总value加到另一支路上，使得值成倍增加
        }
        return value;
    }
}