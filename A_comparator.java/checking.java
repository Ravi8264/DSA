
import java.util.*;

public class checking {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        List<List<Integer>> ans = new Solution().findPair(a);
        // for (List<Integer> j : ans) {
        // System.out.println(j.get(0)+" "+j.get(1));
        // }
    }

}

class Solution {
    public static List<List<Integer>> findPair(int[] arr) {
        // You can code here
        // List<List<Integer>> ans = new ArrayList<>();
        // int n = arr.length;
        // int[] x = Arrays.copyOf(arr, n);
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // if (exist(x, arr[i] + arr[j], n)) {
        // List<Integer> res = new ArrayList<>();
        // res.add(arr[i]);
        // res.add(arr[j]);
        // ans.add(res);
        // }
        // }
        // }

        // ans.sort((a, b) -> {
        // for (int k = 0; k < a.size(); k++) {
        // if (!a.get(k).equals(b.get(k))) {
        // return a.get(k) - (b.get(k));
        // }
        // }
        // return 0;
        // });

        // 2nd method

        // ans.sort((a, b) -> {
        // for (int k = 0; k < a.size(); k++) {
        // if ((a.get(k).compareTo(b.get(k))!=0)) {
        // return a.get(k) - (b.get(k));
        // }
        // }
        // return 0;
        // });

        // ans.sort((a, b) -> {
        // for (int k = 0; k < a.size(); k++) {
        // if (!a.get(k).equals(b.get(k))) {
        // return a.get(k) - (b.get(k));
        // }
        // }
        // return 0;
        // });

        // int a=2;
        // int b=2;
        // System.out.println(a==b);
        List<Integer> st1 = List.of(1, 9, 10,99,128);
        List<Integer> st2 = List.of(1, 9, 10,99,128);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(st1);
        ans.add(st2);

        ans.sort((a, b) -> {
            for (int k = 0; k < a.size(); k++) {
                System.out.println(a.get(k) + " -> " + b.get(k));
                System.out.println("checking1...." + (a.get(k) == b.get(k)));
                System.out.println("checking2 " + a.get(k).equals(b.get(k)));
                if (a.get(k) != (b.get(k))) {

                    return a.get(k) - (b.get(k));
                }
            }
            return 0;
        });

        return ans;
    }

    public static boolean exist(int[] arr, int sum, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == sum)
                return true;
        }
        return false;
    }

}

// class Solution {
// public List<List<Integer>> findPair(int[] arr) {
// // Arrays.sort(arr);
// int n = arr.length;
// List<List<Integer>> ans = new ArrayList<>();
// List<Integer> st = new ArrayList<>();
// for (int i = 0; i < arr.length; i++)
// st.add(arr[i]);
// for (int i = 0; i < n; i++) {
// for (int j = i + 1; j < n; j++) {
// if (st.contains(arr[i] + arr[j])) {
// List<Integer> pair = new ArrayList<>();
// pair.add(arr[i]);
// pair.add(arr[j]);
// ans.add(pair);
// }
// }
// }
// Collections.sort(ans, new ravi());
// ;
// return ans;
// }
// }

// class ravi implements Comparator<List<Integer>> {
// @Override
// public int compare(List<Integer> o1, List<Integer> o2) {
// if (o1.get(0).equals(o2.get(0))) {
// return o1.get(1).compareTo(o2.get(1));
// }
// return o1.get(0).compareTo(o2.get(0));

// }
// }

// class ravi implements Comparator<List<Integer>> {
// @Override
// public int compare(List<Integer> o1, List<Integer> o2) {
// int min = Math.min(o1.size(), o2.size());
// for (int i = 0; i < min; i++) {
// int comperarision = o1.get(i).compareTo(o2.get(i));
// if (comperarision != 0)
// return comperarision;

// }
// return Integer.compare(o1.size(), o2.size());
// }
// }

// class LexicographicComparator implements Comparator<List<Integer>> {
// @Override
// public int compare(List<Integer> o1, List<Integer> o2) {
// int size = Math.min(o1.size(), o2.size());
// for (int i = 0; i < size; i++) {
// int comparison = o1.get(i).compareTo(o2.get(i));
// if (comparison != 0) {
// return comparison;
// }
// }
// return Integer.compare(o1.size(), o2.size());
// }
// }