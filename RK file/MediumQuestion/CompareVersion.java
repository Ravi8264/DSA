import java.util.*;

public class CompareVersion {
    public static void main(String[] args) {
        String a = "1.01";
        String b = "1.001.0";
        System.out.println(new Solution().compareVersion(a, b));

    }

}

class Solution {
    public static int compareVersion(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        int n = Math.max(v1.length, v2.length);
       
        for (int i = 0; i < n; i++) {
            int a = i >= v1.length ? 0 : Integer.parseInt(v1[i]);
            int b = i >= v2.length ? 0 : Integer.parseInt(v2[i]);
            if (a == b) {
                continue;
            } else if (a > b)
                return 1;
            else
                return -1;

        }
        return 0;
    }
}
