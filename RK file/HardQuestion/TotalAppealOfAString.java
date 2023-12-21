import java.util.*;

public class TotalAppealOfAString {
    public static void main(String[] args) {
        System.out.println(appealSum("code"));

    }

    //public static long appealSum(String s) {

        // int ans = 0;
        // Set<Character> set = new HashSet<>();
        // for (int i = 0; i < s.length(); i++) {
        //     set.clear();
        //     for (int j = i; j < s.length(); j++) {
        //         set.add(s.charAt(j));
        //         ans += set.size();
        //     }
        // }
        // return ans;
    //}
    public static long appealSum(String s) {
        int[] a = new int[26];
        long c = 0;
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            c -= a[s.charAt(i) - 'a'];
            ans += c += a[s.charAt(i) - 'a'] = i + 1;
            System.out.println("->"+ans);
        }
        return ans;
    }

}
