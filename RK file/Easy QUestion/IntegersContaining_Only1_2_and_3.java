import java.util.*;

class IntegersContaining_Only1_2_and_3 {
  public static void main(String[] args) {
    int arr[] = { 123, 21322122, 213321, 21311333, 96, 213, 68, 21322233 };
    System.out.println(new Solution().find123Digits(arr, arr.length));

  }
}

class Solution {
  public static List<Integer> find123Digits(int[] arr, int n) {
    List<Integer> ans = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      boolean one = false, two = false, three = false;
      int k = arr[i];

      while (k > 0) {
        int data = k % 10;
        if (data == 1)
          one = true;
        if (data == 2)
          two = true;
        if (data == 3)
          three = true;
         k = k / 10;
      }
     
      if (one== true && two == true && three == true) {
         ans.add(arr[i]);
      }
    }
    Collections.sort(ans);
    return ans;
  }
}

// class Solution {
// public static List<Integer> find123Digits(int[] arr, int n) {
// Set<Integer> hm = new HashSet<>(Arrays.asList(1, 2, 3));
// List<Integer> ans = new ArrayList<Integer>();
// for (int i = 0; i < n; i++) {
// boolean flag3,flag1,flag2;
// boolean flag = flag1 = flag2 = flag3 = true;
// int k = arr[i];
// int index = 0;
// // System.out.println();
// while (k > 0) {
// int k1=k%10;
// if (hm.contains(k1)) {

// if (index > 2) {
// break;
// }
// if (k1 == 1 && flag1) {
// flag1=!flag1;
// ++index;
// }
// if (k1 == 2 && flag2) {
// flag2=!flag2;
// ++index;
// }
// if (k1 == 3 && flag3) {
// flag3=!flag3;
// ++index;
// }

// }
// k = k / 10;
// }
// if (flag && index > 2)
// ans.add(arr[i]);
// }

// if (ans.size() == 0) {
// ans.add(0);
// return ans;
// }
// Collections.sort(ans);
// return ans;
// }
// }