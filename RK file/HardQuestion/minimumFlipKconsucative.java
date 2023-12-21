import java.util.*;

public class minimumFlipKconsucative {
    public static void main(String[] args) {
        // int[] nums = { 0, 0, 0, 1, 0, 1, 1, 0 };
        // System.out.println(new Solution().minKBitFlips(nums, 3));
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        System.out.println(new Solution().minKBitFlips(array, k));

    }

}

// class Solution {
// public int minKBitFlips(int[] nums , int k) {
// Queue<Integer> q = new ArrayDeque<>();
// int n = nums.length;
// int count = 0;
// for (int i = 0; i < n; i++) {
// if (nums[i] == 0) {

// ++count;
// for (int j = 0; j < k; j++) {

// if (i + j > n - 1)
// return -1;
// else if (nums[i + j] == 0) {
// nums[i + j] = 1;
// } else {
// nums[i + j] = 0;
// }
// }
// }
// q.add(nums[i]);
// }
// return count;
// }

// }

// nums = [0,0,0,1,0,1,1,0], k = 3
// import java.util.ArrayDeque;
// import java.util.Queue;

class Solution {
    public int minKBitFlips(int[] nums, int k) {
        Queue<Integer> flip = new ArrayDeque<>();
        int flips = 0;
        for (int i = 0; i < nums.length; i++) {
            if (flip.size() > 0 && flip.peek() < i - k + 1) {
                flip.poll();
            }

            if ((flip.size() % 2 == nums[i] % 2)) {
                if (i + k > nums.length) {
                    return -1;
                }
                flip.offer(i);
                flips++;
            }
        }

        return flips;
    }

}
