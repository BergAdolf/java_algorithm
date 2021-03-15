//动态规划，递归法
/*
时间复杂度 : O(n^2)

空间复杂度 : O(n)。
*/
class Solution {
    public int numTrees(int n) {
        if(n == 1)
            return n;
        int[] D = new int[n + 1];
        int k = 1;
        D[0] = 1;
        D[1] = 1;
        
        while(k < n){
        	k++;
            int temp = 0;
            for(int i = 0; i < k; i++){
                temp += D[k - i - 1] * D[i]; //注意
            }
            D[k] = temp;
            
        }
        return D[k];
    }
}