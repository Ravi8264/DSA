import java.util.*;

public class ticketCounter {
    public static void main(String[] args) {
        System.out.println(new Solution().distributeTicket(5, 1));
    }

}

class Solution {
    public static int distributeTicket(int N, int K) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            dq.add(i + 1);
        }
        int ans = 0;
        while (!dq.isEmpty()) {
            int v = K;
            while (!dq.isEmpty() && v > 0) {
                ans = dq.removeFirst();
                v--;
            }
            v = K;
            while (!dq.isEmpty() && v > 0) {
                ans = dq.removeLast();
                v--;
            }
        }

        return ans;
    }
}