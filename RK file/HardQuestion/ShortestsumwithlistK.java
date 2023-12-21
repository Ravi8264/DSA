import java.util.*;

public class ShortestsumwithlistK {
    public static void main(String[] args) {
        int nums[] = { -28, 81, -20, 28, -29 };
        int k = 89;
        System.out.println(new Solution().shortestSubarray(nums, k));

    }

}

// class Solution {
// public int shortestSubarray(int[] A, int K) {
// TreeMap<Integer, Integer> map = new TreeMap<>();
// int n = A.length;
// int sum = 0;
// Queue<Integer> q = new LinkedList<>();
// int min = Integer.MAX_VALUE;
// for (int i = 0; i < n; i++) {
// if (A[i] >= K)
// return 1;
// sum += A[i];
// if (sum >= K) {
// min = Math.min(min, i + 1);
// }
// int remainSum = sum - K;
// Map.Entry<Integer, Integer> entry = map.floorEntry(remainSum);
// while (entry != null) {
// int index = entry.getValue();
// min = Math.min(min, i - index);
// entry = map.floorEntry(entry.getKey() - 1);
// }
// map.put(sum, i);
// }

// return min == Integer.MAX_VALUE ? -1 : min;
// }
// }

class Solution {
    public int shortestSubarray(int[] A, int K) {
        int min = Integer.MAX_VALUE, n = A.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                if (K <= sum) {
                    System.out.println(sum);
                    min = Math.min(min, j - i + 1);
                    j = n;
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
