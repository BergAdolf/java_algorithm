class Solution {
	//采用两次旋转，第一次水平翻转，第二次对角线翻转
    public void rotate(int[][] matrix) {
        int temp = 0;
        int len = matrix[0].length;
        for(int i = 0; i < len/2; i++)
        {
            for(int j = 0; j < len; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[len - i - 1][j];
                matrix[len - i - 1][j] = temp;
            }
        }

        for(int i = 0; i < len; i++)
        {
            for(int j = i + 1; j < len; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}