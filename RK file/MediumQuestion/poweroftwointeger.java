public class poweroftwointeger {
    public static void main(String[] args) {
        System.out.println(new Solution().isPower(64));
    }

}

class Solution {
    public boolean isPower(int x) {

        for (int i = 2; i < Math.sqrt(x); i++) {
            int p = 2;
           double ans = Math.pow(i, p);
            while (ans <= x ) {
                if (ans == x) {
                    return true;
                }
                p++;
                ans = Math.pow(i, p);
            }

        }
        return false;

    }
}