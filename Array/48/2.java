class Solution {
    public void rotate(int[][] matrix) {
        //找规律
        int temp;
        int len = matrix[0].length;
        for(int i = 0; i < len/2; i++){
            for(int j = 0; j < len - len / 2; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[len - j - 1][i];
                matrix[len - j - 1][i] = matrix[len - i - 1][len - j - 1];
                matrix[len - i - 1][len - j - 1] = matrix[j][len - i - 1];                
                matrix[j][len - i - 1] = temp;
            }
        }

    }
}
