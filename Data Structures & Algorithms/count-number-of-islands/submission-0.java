class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0},
                                               {0, 1}, {0, -1}};
    public int numIslands(char[][] grid) {
        int n = grid.length, c = grid[0].length;
        int island = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < c; j++) {
                if(grid[i][j] == '1') {
                    dfs(grid, i, j);
                    island++;
                }
            }
        }
        return island;
    }

    private void dfs(char[][] grid, int i, int j) {
        if ( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        for (int[] d : directions) {
            dfs(grid, i + d[0], j + d[1]);
        }
    }
}
