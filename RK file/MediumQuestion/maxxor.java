import java.util.*;

public class maxxor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = scn.nextInt();
        System.out.println(new Solution().findMaximumXOR(nums));

    }

}

// class Solution {
// public int findMaximumXOR(int[] nums) {
// int n = nums.length;
// int max = 0;
// for (int i = 0; i < n; i++) {
// for (int j = i + 1; j < n; j++) {
// max = Math.max(max, nums[i] ^ nums[j]);
// }
// }

// return max;

// }
// }

// class Solution {
// class TrieNode {
// TrieNode Zero, one;
// }

// void insert(TrieNode root, int n) {
// TrieNode curr = root;
// for (int i = 31; i >= 0; i--) {
// int bit = (n >> i) & 1;
// if (bit == 0) {
// if (curr.Zero == null) {
// TrieNode newNode = new TrieNode();
// curr.Zero = newNode;
// }
// curr = curr.Zero;
// } else {
// if (curr.one == null) {
// TrieNode newNode = new TrieNode();
// curr.one = newNode;
// }
// curr = curr.one;
// }
// }
// }

// int max(TrieNode root, int n) {
// TrieNode curr = root;
// int ans = 0;
// for (int i = 31; i >= 0; i--) {
// int bit = (n >> i) & 1;
// if (bit == 1) {
// if (curr.Zero != null) {
// ans += (1 << i);
// curr = curr.Zero;
// } else {
// curr = curr.one;
// }
// } else {
// if (curr.one != null) {
// ans += (1 << i);
// curr = curr.one;
// } else {
// curr = curr.Zero;
// }
// }

// }
// return ans;
// }

// public int findMaximumXOR(int[] nums) {
// TrieNode root = new TrieNode();
// int ans = 0;
// int n = nums.length;
// for (int i = 0; i < n; i++) {
// insert(root, nums[i]);
// }
// for (int i = 1; i < n; i++) {
// ans = Math.max(ans, max(root, nums[i]));
// }
// return ans;
// }
// }

class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxXOR = 0;
        int mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            Set<Integer> prefixes = new HashSet<>();
            for (int num : nums) {

                prefixes.add(num & mask);
            }
            int candidate = maxXOR | (1 << i);
            for (int prefix : prefixes) {
                if (prefixes.contains(candidate ^ prefix)) {
                    maxXOR = candidate;

                    break;
                }
            }
        }
        return maxXOR;
    }
}