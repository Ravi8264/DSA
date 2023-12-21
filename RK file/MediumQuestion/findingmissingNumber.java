import java.util.ArrayDeque;
import java.util.Queue;

public class findingmissingNumber {
    public static void main(String[] args) {
        long n = 12;
        System.out.println(new Solution().nthPosition(n));
    }

}

// class Solution {
// public static long nthPosition(long n) {
// Queue<Long> q1 = new ArrayDeque<>();
// Queue<Long> q2 = new ArrayDeque<>();
// for (long i = 1; i <= n; i++) {
// if ((i & 1) == 0)
// q1.add(i);
// }
// int i = 1, flag = 1;
// while (true) {
// if ((q1.size() == 1 && q2.size() == 0) || (q2.size() == 1 && q1.size() == 0))
// {
// break;
// }
// if (flag == 1) {
// if (q1.size() == 0) {
// flag = 0;
// i = 1;
// }
// }
// if (flag == 0) {
// if (q2.size() == 0) {
// flag = 1;
// i = 1;
// }
// }
// if (flag == 1) {
// if (i % 2 == 0) {
// long a = q1.poll();
// q2.add(a);
// } else {

// q1.poll();
// }
// }

// if (flag == 0) {
// if (i % 2 == 0) {
// q1.add(q2.poll());
// } else {
// q2.poll();
// }
// }

// ++i;
// }
// if (!q1.isEmpty())
// return q1.peek();
// return q2.peek();
// }
// }

// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
// 2 4 6 8 10 12 14

class Solution {
    public long nthPosition(long n) {
        long res = 0;
        for (long i = n; i >= 1; i--) {

            if ((i & (i - 1)) == 0) {
                res = i;
                break;
            }
        }
        return res;
    }
}