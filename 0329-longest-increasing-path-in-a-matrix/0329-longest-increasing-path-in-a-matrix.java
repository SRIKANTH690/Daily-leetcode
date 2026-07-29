class Solution {
    int [][] dp;
    int [][] dir = {{1,0} , {-1,0} , {0,1} , {0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        dp = new int[row][col];
        int ans = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans = Math.max(ans, dfs(matrix, i, j));
            }
        }
        return ans;
        
    }
    public int dfs(int [][] matrix , int i ,int j){
        if(dp[i][j] != 0 ){
            return dp[i][j];
        }

        int max = 1;
        for(int[] d : dir) {

            int ni = i + d[0];
            int nj = j + d[1];

            if(ni >= 0 && ni < matrix.length &&
               nj >= 0 && nj < matrix[0].length &&
               matrix[ni][nj] > matrix[i][j]) {

                max = Math.max(max, 1 + dfs(matrix, ni, nj));
            }
        }

        dp[i][j] = max;
        return max;
    }
}