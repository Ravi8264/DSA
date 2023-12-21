import java.util.*;
public class gridpath {
    public static void main(String[] args) {
        int [][]grid= {{1,0,0,0},{0,0,0,0},{0,0,0,2}};
        System.out.println(new Solution().uniquePathsIII(grid));
    }
}

// class Solution {
//     public static int uniquePathsIII(int[][] grid) {
//         int obstucle = 0;
//         int start_X = 0;
//         int start_Y = 0,n=grid.length,m=grid[0].length;
//         // for (int[] row : grid) {
//         // for (int element : row)

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (grid[i][j] == 0)
//                     ++obstucle;
//                 if (grid[i][j] == 1) {
//                     start_X = i;
//                     start_Y = j;
//                 }
//             }
//         }
//         int[] path_X = { 1, -1, 0, 0 };
//         int[] path_y = { 0, 0, 1, -1 };
//         ++obstucle;
//         ArrayList<Integer> st=new ArrayList<>();
//         backtrack(grid, start_X, start_Y, obstucle,n,m,st,0,path_X,path_y);
//         return st.size();
//     }

//     private static void
//     backtrack(int[][] grid, int start_X, int start_Y, int obstucle,int n,int m,ArrayList<Integer> st,int count,int []path_X,int[]path_y) {
//         if(valid_path(grid,start_X,start_Y,n,m)){
//             if(grid[start_X][start_Y]==2){
//                 if(obstucle==count){
//                     st.add(1);
//                 }
//                 return;
//             }
//             grid[start_X][start_Y]=-1;
//             for(int i=0; i<4; i++){
//                 int curr_X=start_X+path_X[i];
//                 int curr_y=start_Y+path_y[i];
//                 backtrack(grid,curr_X,curr_y,obstucle,n,m,st,count+1,path_X,path_y);
//             }
//             grid[start_X][start_Y]=0;
//         }
//         return;
//     }

//     private static boolean valid_path(int[][] grid, int x, int y, int n, int m) {
//         return x >= 0 && x < n && y >= 0 && y < m && grid[x][y] != -1;
//     }

// }


class Solution {
    static int ans=0;
    public static int uniquePathsIII(int[][] grid) {
        int obstucle = 0;
        int start_X = 0;
        int start_Y = 0,n=grid.length,m=grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0)
                    ++obstucle;
                if (grid[i][j] == 1) {
                    start_X = i;
                    start_Y = j;
                }
            }
        }
        int[] path_X = { 1, -1, 0, 0 };
        int[] path_y = { 0, 0, 1, -1 };
        ++obstucle;
        ans=0;
        backtrack(grid, start_X, start_Y, obstucle,n,m,0,path_X,path_y);
        return ans;
    }

    private static void
    backtrack(int[][] grid, int start_X, int start_Y, int obstucle,int n,int m,int count,int []path_X,int[]path_y) {
        if(valid_path(grid,start_X,start_Y,n,m)){
            if(grid[start_X][start_Y]==2){
                if(obstucle==count){
                    ++ans;
                }
                return;
            }
            grid[start_X][start_Y]=-1;
            for(int i=0; i<4; i++){
                int curr_X=start_X+path_X[i];
                int curr_y=start_Y+path_y[i];
                backtrack(grid,curr_X,curr_y,obstucle,n,m,count+1,path_X,path_y);
            }
            grid[start_X][start_Y]=0;
        }
        return;
    }

    private static boolean valid_path(int[][] grid, int x, int y, int n, int m) {
        return x >= 0 && x < n && y >= 0 && y < m && grid[x][y] != -1;
    }

}