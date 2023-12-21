import java .util.*;
public class LongestCommonprefix {
    public static void main(String[] args) {
        String []arr={"hello","help","heskel"};
        System.out.println(longestCommonPrefix(arr));
    }
    
    
        public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        String ans = "";
        ans = checkcommonPrefix(strs[0], strs[1]);
        for (int i = 2; i < strs.length; i++) {
            ans = checkcommonPrefix(ans, strs[i]);
        }

        return ans;

    }

   static  String checkcommonPrefix(String a, String b) {
        int i = 0, j = 0;
        String ans = "";
        while (a.length() > i && b.length() > j) {
            if (a.charAt(i) == b.charAt(i)) {
                ans += a.charAt(i);
                i++;
                j++;
            } else {
                break;
            }
        }
        return ans;
    }

    
    
}
