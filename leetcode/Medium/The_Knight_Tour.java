// import java.util.*;

// class The_Knight_Tour {
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
//         int c[][] = new Solution().knightTour(n, m);
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.println();
//             }
//         }
//     }

// }

// class Solution {

//     public static int[][] knightTour(int n, int m) {
//         // You can code here

//         int a[][] = new int[n][m];
//         int[] moveX = { 2, 1, -1, -2, -2, -1, 1, 2 };
//         int[] moveY = { 1, 2, 2, 1, -1, -2, -2, -1 };
//         int step=0;
//         helper(a,moveX,moveY,0);
//         return a;
//     }
// }

class problem_solution {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int ans[][] = knightTour(n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + "   ");
            }
            System.out.println();
        }

    }

    public static int[][] knightTour(int n, int m) {

        int move_X[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int move_y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        int ans[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = -1;
            }
        }
        ans[0][0] = 0;
        boolean k = knightTourhelper(ans, move_X, move_y, n, m, 0, 0, 0);
        if (!k) {
            ans[0][0] = -1;
        }
        return ans;
    }

    private static boolean knightTourhelper(int[][] ans, int[] move_X, int[] move_Y, int n, int m, int curr_X,
            int curr_Y, int step) {
        if (n * m - 1 == step)
            return true;
        for (int i = 0; i < 8; i++) {
            int next_X = curr_X + move_X[i];
            int next_Y = curr_Y + move_Y[i];
            if (check_Valid(ans, next_X, next_Y, m, n)) {
                ans[next_X][next_Y] = step + 1;
                System.out.print(ans[next_X][next_Y]);
                boolean result = knightTourhelper(ans, move_X, move_Y, n, m, next_X, next_Y, step + 1);
                if (result) {
                    return true;
                } else {
                    ans[next_X][next_Y] = -1;
                }
            }
        }
        return false;
    }

    private static boolean check_Valid(int[][] ans, int x, int y, int m, int n) {
        return x >= 0 && y >= 0 && x < n && y < m && ans[x][y] == -1;
    }
}