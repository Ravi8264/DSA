import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class circularGame {
    public static void main(String[] args) {
        System.out.println(new Solution().findTheWinner(6, 2));
    }

}

class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);

        }

        while (q.size() > 1) {
            for (int i = 1; i < k; i++) {
                q.add(q.poll());
            }
            q.poll();
        }
        System.out.println(q);
        return q.poll();
    }
}