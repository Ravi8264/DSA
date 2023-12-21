import java.util.*;

public class ReverseCardsInIncreasing {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nums[] = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = scn.nextInt();
    }
    System.out.println(Arrays.toString(new Solution().deckRevealedIncreasing(nums)));
  }
}

class Solution {
  public int[] deckRevealedIncreasing(int[] deck) {
    int ans[] = new int[deck.length];
    int n = deck.length;
    Arrays.sort(deck);
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      q.add(i);
    }
    for (int i = 0; i < n; i++) {
      ans[q.poll()] = deck[i];
      if (!q.isEmpty()) {
        q.add(q.poll());
      }

    }
    return ans;
  }
}

























// class Solution {
// public int[] deckRevealedIncreasing(int[] deck) {
// int ans[] = new int[deck.length];
// int n = deck.length;
// Arrays.sort(deck);
// Deque<Integer> dq = new ArrayDeque<>();
// for (int i = 0; i < n; i++) {
// dq.addLast(i);
// }
// System.out.println(Arrays.toString(deck));
// for (int i = 0; i < n; i++) {
// ans[dq.pollFirst()] = deck[i];
// if (!dq.isEmpty()) {
// dq.addLast(dq.pollFirst());
// }

// }
// return ans;
// }
// }

// 2,13,3,11,5,17,7]