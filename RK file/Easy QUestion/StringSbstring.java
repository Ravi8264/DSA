public class StringSbstring {
    public static void main(String[] args) {
        String a = "kjibjnuzbx";
        System.out.println(new Solution().repeatedSubstringPattern(a));

    }

}

// class Solution {
// public boolean repeatedSubstringPattern(String s) {

// int n = s.length();
// for (int i = 1; i <= n / 2; i++) {
// if (n % i == 0) {
// String subString = s.substring(0, i);
// boolean flag = true;
// for (int j = i; j < n; j = j + subString.length()) {
// if (subString.equals(s.substring(j, j + subString.length())) && flag) {
// continue;
// } else {
// flag = false;
// }
// }
// if (flag) {
// return true;
// }

// }

// }
// return false;

// }
// }
// kjibjnuzbx
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                int m = n / i;
                StringBuilder sb = new StringBuilder();
                String sub = s.substring(0, i);
                for (int j = 0; j < m; j++) {
                    sb.append(sub);
                }
                System.out.println(sb);
                if (sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
}