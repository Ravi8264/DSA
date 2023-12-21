import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
  public static void main(String[] args) {
    int a[] = { 54, 83, 49, 7, 80, 41, 81 };
    Queue<Integer> v = new LinkedList<>();
    int n = a.length, i = 0;
    while (i < n) {
      v.add(a[i]);
      i++;
    }
    System.out.println(new Solution().reverseQueueFirstKElements(1, v));
  }

}

class Solution {
  public static Queue<Integer> reverseQueueFirstKElements(int k, Queue<Integer> queue) {
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < k; i++) {
      st.push(queue.poll());
    }

    System.out.println(st);
    while (!st.isEmpty()) {
      queue.add(st.pop());
    }
    for (int i = 0; i < queue.size() - k; i++) {
      queue.add(queue.poll());
    }
    return queue;
  }
}