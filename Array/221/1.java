//递归法
class Solution {
    int maxValue;
    public int maximalSquare(char[][] matrix) {
        maxValue = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == '1'){
                    maxValue = (int)Math.max(maxValue,1);
                    searchMaxValue(matrix, i + 1, j + 1, 1);
                }
            }
        }
        return maxValue;
    }

    public void searchMaxValue(char[][] matrix, int n, int m, int t){
        if(n >= matrix.length || m >= matrix[0].length){
            return;
        }

        boolean flag = true;
        for(int i = m - t; i <= m; i++){
            if(matrix[n][i] == '0'){
                flag = false;
                break;
            }
        }
        if(flag){
            for(int j = n - t; j <= n; j++){
                if(matrix[j][m] == '0'){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            t++;
            maxValue = (int)Math.max(maxValue, Math.pow(t, 2));
            searchMaxValue(matrix, n + 1, m + 1, t);
        }
    }
}