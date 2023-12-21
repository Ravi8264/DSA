import java.util.*;

public class NumberofExcellentPairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(countExcellentPairs(a, k));
    }



    public static long countExcellentPairs(int[] nums, int k) {
        Set<Integer> map = new HashSet<>();
        for (int i : nums) {
            map.add(i);
        }
        int n = map.size(), m = 0;
        int ans[] = new int[n];
        int start = 0, end = n - 1, result = 0;
        for (int i : map) {
            int check=count(i);
            ans[m++] = check;
            if(check*2>=k)result++;
        }
        Arrays.sort(ans);
        while (start < end) {
            if (ans[start] +ans[end] >= k) {
                result += (end - start) * 2;
                --end;
            } else {
                ++start;
            }
        }
        return result;
    }
    static int count(int a) {
        int count = 0;
        while (a > 0) {
            count += a & 1;
            a = a / 2;
        }
        return count;
    }
}











// public static long countExcellentPairs(int[] nums, int k) {
// Set<Integer> map = new HashSet<>();
// for (int i : nums) {
// map.add(i);
// }
// int sec[] = new int[map.size()];
// int m = 0;
// long ans = 0;
// for (int i : map) {
// int c = count(i) * 2;
// if (c >= k) {
// ans++;
// }
// sec[m++] = i;
// }
// int n = sec.length;
// long ans2 = 0;
// for (int i = 0; i < n; i++) {
// for (int j = i + 1; j < n; j++) {
// int a = sec[i];
// int b = sec[j];
// if (count(a & b) + count(a | b) >= k) {
// System.out.println(a + " " + b);
// ans2++;
// }
// }
// }
// return ans + ans2 * 2;

// }