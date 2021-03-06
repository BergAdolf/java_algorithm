class Solution {
    public int minPathSum(int[][] grid) {
    	int m = grid.length;
    	int n = grid[0].length;
    	int[][] path = new int[m][n];

    	path[0][0] = grid[0][0];
    	for(int i = 1; i < n; i++){
    		path[0][i] = grid[0][i] + path[0][i - 1];
    	}	
    	for(int j = 1; j < m; j++){
    		path[j][0] = grid[j][0] + path[j - 1][0];
    	}

    	for(int i = 1; i < m; i++){
    		for(int j = 1; j < n; j++){
    			if(path[i - 1][j] >= path[i][j - 1]){
    				path[i][j] = path[i][j - 1] + grid[i][j];
    			}
    			else{
    				path[i][j] = path[i - 1][j] + grid[i][j];
    			}
    		}
    	}
    	return path[m - 1][n - 1];
    }

}