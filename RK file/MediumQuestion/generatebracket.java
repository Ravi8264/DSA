import java.util.*;

public class generatebracket {
    public static void main(String[] args) {
        System.out.println(new Solution().AllParenthesis(3));
    }

}

class Solution {

    public List<String> AllParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        generenthesis(n,"",0,0,0,ans);

        return ans;

    }

    void generenthesis(int n, String cur, int i, int open, int close,  List<String> ans) {
      
        if (i == 2 * n) {
           ans.add(cur);
        }
        if (open < n) {
            cur += '(';
            generenthesis(n, cur, i+1, open+1, close,ans);
            cur = cur.substring(0, cur.length() - 1);
        }
        if (close < open) {
            cur += ')';
            generenthesis(n, cur, i+1, open, close+1,ans);
            cur = cur.substring(0, cur.length() - 1);
        }
    }
}
