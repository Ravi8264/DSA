import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        System.out.println(new Solution().isPalindrome(a));
    }

}

class Solution {
    public static boolean isPalindrome(String str) {

        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) == str.charAt(n - i - 1)) {
                continue;
            } else {
                return false;
            }
        }
        return true;

    }
}