import java.util.*;

public class Longest_Substring_Without_Repeating_Character {
    public static void main(String[] args) {
        String a = "aab";
        System.out.println(new Solution().lengthOfLongestSubstring(a));
    }

}

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Queue<Character> q = new LinkedList<>();
        int n = s.length();
        int max = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            while (!q.isEmpty() && q.contains(c)) {
                q.poll();
            }
            q.add(c);
            max = Math.max(max, q.size());
        }
        if(max==0 && q.size()!=0) return q.size();
        return max;
    }

}