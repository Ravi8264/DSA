import java.util.*;

public class countLatticePointCircle {
    public static void main(String[] args) {

    }

    public int countLatticePoints(int[][] circles) {
        Set<int[]> ans = new HashSet<>();
        boolean[][] counted = new boolean[201][201];
        for (int[] circle : circles) {
            int x = circle[0];
            int y = circle[1];
            int r = circle[2];
            for (int i = x - r; i <= x + r; i++) {
                for (int j = y-r; j <= y + r; j++) {
                    if ((i - x) * (i - x) + (j - y) * (j - y) <= r * r && !counted[i][j]) {
                        ans.add(new int[] { i, j });
                        counted[i][j]=true;
                    }
                }
            }

        }
        return ans.size();

    }
}
