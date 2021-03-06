class Solution {
    public boolean exist(char[][] board, String word) {
        boolean existValue;
        boolean[][] visited = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if((board[i][j]) == word.charAt(0)){
                    existValue = isexist(board, i, j, 0, word, visited);
                    if(existValue){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isexist(char[][] board, int i, int j,int k, String string, boolean[][] visited){

        if(board[i][j] != string.charAt(k)){
            return false;
        }else if(k == string.length() - 1){
            return true;
        }
        visited[i][j] = true;

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;

        for(int[] dir:directions){
            int newi = i + dir[0], newj = j + dir[1];
            if(newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length){
                if(!visited[newi][newj]){
                    boolean flag = isexist(board, newi, newj, k + 1, string, visited);
                    if(flag){
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }
}