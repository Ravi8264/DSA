
class spinal_code{
public static void main(String[] args) {
            int n = 6;
            System.out.println(n);
            int ans[][] = spiralOrderMatrix(n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(ans[i][j] + "      ");
                }
                System.out.println();
            }
        
    }
    static int[][] spiralOrderMatrix(int n) {
        int ans[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = 0;
            }
        }
        int step = 1;
        int top = 0, left = 0, right = n - 1, bottom = n - 1;
        while (true) {
            if (valid(step, n)) {
                break;
            }
            // 1st
            for (int i = top; i <= right; i++) {
                ans[top][i] = step++;
            }
            ++top;
            if (valid(step, n)) {
                break;
            }
            // 2
            for (int j = top; j <= right; j++) {
                ans[j][right] = step++;
            }
            --right;
            if (valid(step, n)) {
                break;
            }
            // 3rd
            for (int k = right; k >= left; k--) {
                ans[bottom][k] = step++;
            }
            if (valid(step, n)) {
                break;
            }
            --bottom;
            for (int m = right; m >= top; m--) {
                ans[m][left] = step++;
            }
            ++left;
            if (valid(step, n)) {
                break;
            }
        }
        return ans;
    }

    static boolean valid(int step, int n) {
        if (step == n * n + 1) {
            return true;
        }
        return false;
    }
}