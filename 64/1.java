class Solution {
    //回溯法时间太长，无法使用
    public int minPathSum(int[][] grid) {

        int value;
        int m = grid.length;
        int n = grid[0].length;
        value = run(grid, Integer.MAX_VALUE, grid[0][0], 0, 0, m, n); //采用回溯法进行实现。
        return value;
    }

    public int run(int[][] grid, int min, int path,int i, int j, int m, int n){
        
        int temp;
        int r = 1; //表示向右
        int l = 1; //表示向下
        if(m - 1 == i && n - 1 == j){
            if(path < min){
                min = path;
            }
            return min;
        }
        if(i == m - 1){//i 表示竖轴的坐标，j表示横轴的坐标
            l = 0;
        }
        if(j == n - 1){
            r = 0;
        }
        if(r == 1){     //可往右边移动
            temp = run(grid, min, path + grid[i][j + 1], i, j + 1, m, n);
            min = min > temp? temp:min;
        }
        if(l == 1){      //可往下边移动
            temp = run(grid, min, path + grid[i + 1][j], i + 1, j, m, n);
            min = min > temp? temp:min;
        }
        return min;
    }

}