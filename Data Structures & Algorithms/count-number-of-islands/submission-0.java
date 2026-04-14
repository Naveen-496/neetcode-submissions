class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

         int noOfIslands = 0;
        for ( int i = 0; i < rows; i++) {
            for ( int j = 0; j < cols; j++) {
                if ( grid[i][j] == ('1')) {
                    noOfIslands += 1;
                    searchAdjacent(grid, i , j);
                }
            }
        }

        return noOfIslands;
    }

    public void searchAdjacent(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if ( i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        searchAdjacent(grid, i + 1, j);
        searchAdjacent(grid, i - 1, j);
        searchAdjacent(grid, i, j + 1);
        searchAdjacent(grid, i, j - 1);
    }
}
