//动态规划法
class Solution {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] m = new int[row][col];
        int maxValue = 0;
        for(int i = 0; i < row; i++){
            if(matrix[i][0] == '0'){
                m[i][0] = 0;
            }else{
                m[i][0] = 1;
                maxValue = 1; 
            }
        }

        for(int j = 0; j < col; j++){
            if(matrix[0][j] == '0'){
                m[0][j] = 0;
            }else{
                m[0][j] = 1;
                maxValue = 1;
            }
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(matrix[i][j] == '0'){
                    m[i][j] = 0;
                    continue;
                }

                if(m[i - 1][j - 1] == 0){
                    m[i][j] = 1;
                }else{
                    int t = m[i - 1][j - 1];
                    while(t >= 1) {
			            boolean flag = true;
			            for(int k = i - t; k <= i; k++){
			                if(matrix[k][j] == '0'){
			                    flag = false;
			                    break;
			                }
			            }
			            if(flag){
			                for(int k = j - t; k <= j; k++){
			                    if(matrix[i][k] == '0'){
			                        flag = false;
			                        break;
			                    }
			                }
			            }
			            if(flag) {
			            	m[i][j] = t + 1;
			            	break;
			            }
			            t = t - 1;
                    }
                    if(m[i][j] == 0){
                        m[i][j] = 1;
                    }
                }

                maxValue = (int)Math.max(maxValue, Math.pow(m[i][j], 2));
            }
        }
        return maxValue;
    }
}