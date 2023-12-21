
public class unique_path3 {
    public static void main(String[] args) {
        int grid[][] = { { 1, 0, 0 },
                { 0, 0, 2 } };
        System.out.println(new Solution().uniquePathsIII(grid));
    }
}

class Solution {
    static int result = 0;

    public static int uniquePathsIII(int[][] grid) {
        result = 0;
        int n = grid.length; // no of rows
        int m = grid[0].length; // no of columns
        int countZeros = 0; // to keep a check that all zeros traversed or not
        int sx = -1; // stores the starting x-index for 1(starting element)
        int sy = -1; // stores the starting y-index for 1(starting element)
        // boolean[][] visited = new boolean[n][m]; // intially all will contain "false"
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    countZeros++;
                } else if (grid[i][j] == 1) {
                    sx = i;
                    sy = j;
                }

            }
        }
        // System.out.println(sx + " " + sy);
        // visited[sx][sy] = true;
        // helper(grid, visited, sx, sy, n, m, countZeros);
        dfs(grid, sx, sy, countZeros);
        
        return result;
    }

    public static void dfs(int grid[][], int x, int y, int countZero) {
        // base condition
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1) {
            return;
        }
        if (grid[x][y] == 2)
            if (countZero == 0) {
              
                result=result+1;
            }

      

        if (grid[x][y] == 0) {
            countZero--;
            grid[x][y] = -1;

        }

        dfs(grid, x + 1, y, countZero);
        dfs(grid, x - 1, y, countZero);
        dfs(grid, x, y + 1, countZero);
        dfs(grid, x, y - 1, countZero);

        // backtracking
        grid[x][y] = 0;
        countZero++;

    }
}

// public static void helper(int[][] grid, boolean[][] visited, int i, int j,
// int n, int m, int countZeros) {
// // base case
// // if (grid[i][j]==2) {
// // if (i + 1 < n && grid[i + 1][j] == 2) {
// // result++;
// // }
// // if (i - 1 >= 0 && grid[i - 1][j] == 2) {
// // result++;
// // }
// // if (j + 1 < m && grid[i][j + 1] == 2) {
// // result++;
// // }
// // if (j - 1 >= 0 && grid[i][j - 1] == 2) {
// // result++;
// // }
// // }
// if(grid[i][j]==2){
// if(countZeros==-1){
// result++;
// }
// return;
// }

// // try to move down
// if (isValid(grid, visited, i + 1, j, n, m)) {
// visited[i + 1][j] = true;
// countZeros--;
// helper(grid, visited, i + 1, j, n, m, countZeros);
// visited[i + 1][j] = false;
// countZeros++;
// }

// // try to move left
// if (isValid(grid, visited, i, j - 1, n, m)) {
// visited[i][j - 1] = true;
// countZeros--;
// helper(grid, visited, i, j - 1, n, m, countZeros);
// visited[i][j - 1] = false;
// countZeros++;
// }

// // try to right move
// if (isValid(grid, visited, i, j + 1, n, m)) {
// visited[i][j + 1] = true;
// countZeros--;
// helper(grid, visited, i, j + 1, n, m, countZeros);
// visited[i][j + 1] = false;
// countZeros++;
// }

// // try to move up
// if (isValid(grid, visited, i - 1, j, n, m)) {
// visited[i - 1][j] = true;
// countZeros--;
// helper(grid, visited, i - 1, j, n, m, countZeros);
// visited[i - 1][j] = false;
// countZeros++;
// }
// }

// // is avlid funcxtion to check that current index is valid or not!✅✅✅
// public static boolean isValid(int[][] grid, boolean[][] visited, int i, int
// j, int n, int m) {

// if (i < n && i >= 0 && j < m && j >= 0 && (grid[i][j] == 0||grid[i][j]==2) &&
// visited[i][j] == false) {
// return true;
// } else {
// return false;
// }
// }

// }

// class Solution {
// static int result = 0;

// public int uniquePathsIII(int[][] grid) {
// int obstacle = 0;
// int n = grid.length;
// int m = grid[0].length;
// int start_x = 0;
// int start_y = 0;
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// if (grid[i][j] == 0)
// ++obstacle;
// if (grid[i][j] == 1) {
// start_x = i;
// start_y = j;
// }
// }
// }
// ++obstacle;
// int[] path_x = { 0, -1, 0, 1 };
// int[] path_y = { 1, 0, -1, 0 };
// result = 0;
// backtracking(grid, start_x, start_y, obstacle, n, m, 0, path_x, path_y);
// return result;
// }

// private void backtracking(int[][] grid, int start_x, int start_y, int
// obstacle, int n, int m, int count,
// int[] path_x,
// int[] path_y) {

// if (valid_path(grid, start_x, start_y, n, m)) {
// if (grid[start_x][start_y] == 2) {
// if (count == obstacle) {
// result = result + 1;
// }
// return;
// }
// grid[start_x][start_y] = -1;
// for (int i = 0; i < 4; i++) {
// int curr_x = start_x + path_x[i];
// int curr_y = start_y + path_y[i];
// backtracking(grid, curr_x, curr_y, obstacle, n, m, count + 1, path_x,
// path_y);
// }
// grid[start_x][start_y] = 0;

// }
// return;
// }

// private boolean valid_path(int[][] grid, int x, int y, int n, int m) {
// return x >= 0 && x < n && y >= 0 && y < m && grid[x][y] != -1;
// }
// }