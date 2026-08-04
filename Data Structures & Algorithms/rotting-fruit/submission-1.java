class Solution {
    public int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int orangesRotting(int[][] grid) {
        var queue = new ArrayDeque<int[]>();
        int fresh = 0, time = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) queue.addLast(new int[] {i, j});
                if (grid[i][j] == 1) fresh++;
            }
        }

        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            time++;
            for (int i = 0; i < size; i++) {
                int[] cur = queue.pollFirst();
                int r = cur[0], c = cur[1];
                for(int[] d : dirs) {
                    int nc = c + d[1], nr = r + d[0];
                    if (nc < 0 || nr < 0 || nc >= grid[0].length || nr >= grid.length || grid[nr][nc] != 1) {
                        continue;
                    }
                    grid[nr][nc] = 2;
                    fresh--;
                    queue.addLast(new int[] {nr, nc});
                }
            }
        }
        return fresh == 0 ? time : -1;
    }
}
