class Solution {
	//左上角加上右上角，慢慢递推
    public int uniquePaths(int m, int n) {
        int[][] list = new int[m][n];
        int h,r;
    
        for(int i = 0; i < m; i++ ){
            for(int j = 0; j < n; j++){
                if(i == 0 && j != 0){
                    h = 0;
                    r = list[i][j - 1]; 
                }
                else if(i == 0 && j == 0){
                    r = 1;
                    h = 0;
                }
                else if(i != 0 && j == 0){
                    r = 0;
                    h = list[i - 1][j];
                }
                else{
                    r = list[i][j - 1];
                    h = list[i - 1][j];
                }
                list[i][j] = r + h;
            }
        }
        return list[m - 1][n - 1];

    }
}