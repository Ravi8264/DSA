import java.util.ArrayList;

public class RatMazeproblem {
    public static void main(String[] args) {
        int b[][] = { { 1, 1 }, { 1, 1 } };
        int n = 2;
        System.out.println(new Solution().findPath(b, n));
    }
}
class Solution {

    public static ArrayList<String> findPath(int[][] arr, int n) {
        boolean[][] visited = new boolean[n][n];
        ArrayList<String> ans = new ArrayList<>();
        visited[0][0] = true;
        if (arr[0][0] == 0)
            return ans;
        path(arr, arr.length, arr[0].length, visited, "", 0, 0, ans);
        return ans;
    }
    public static void path(int c[][], int n, int m, boolean visited[][], String path, int i, int j,
            ArrayList<String> ans) {

        if (i == n - 1 && j == m - 1) {
            System.out.println(path);
            ans.add(path);
            return;
        }
        if (isValid(c, visited, m, n, i + 1, j)) {
            visited[i + 1][j] = true;
            path(c, n, m, visited, path + 'D', i + 1, j, ans);
            visited[i + 1][j] = false;
        }
        if (isValid(c, visited, m, n, i - 1, j)) {
            visited[i - 1][j] = true;
            path(c, n, m, visited, path + 'U', i - 1, j, ans);
            visited[i - 1][j] = false;
        }
        if (isValid(c, visited, m, n, i, j + 1)) {
            visited[i][j + 1] = true;
            path(c, n, m, visited, path + 'R', i, j + 1, ans);
            visited[i][j + 1] = false;
        }
        if (isValid(c, visited, m, n, i, j - 1)) {
            visited[i][j - 1] = true;
            path(c, n, m, visited, path + 'L', i, j - 1, ans);
            visited[i][j - 1] = false;

        }
    }

    static boolean isValid(int c[][], boolean visted[][], int m, int n, int i,
            int j) {

        if (i < n && j < m && i >= 0 && j >= 0 && c[i][j] == 1 && !visted[i][j]) {
            return true;

        }
        return false;

    }

}
