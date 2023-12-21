import java.util.*;

public class sumofallsubmatrics {
    public static void main(String[] args) {

    }

    public int sumEqualTarget(int[][] M, int T) {
        int rows = M.length;
        int cols = M[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                M[i][j] += M[i][j - 1];
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < cols; i++) {
            for (int j = i; j < cols; j++) {
                int sum = 0;
                map.clear();
                map.put(0, 1);
                for (int k = 0; k < rows; k++) {
                    sum += (M[k][j] - (i > 0 ? M[k][i - 1] : 0));
                    int freq = map.getOrDefault(sum - T, 0);
                    ans += freq;
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }
        return ans;

    }
}
