
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "baa"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char i : ransomNote.toCharArray())
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        for (char i : magazine.toCharArray())
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        System.out.println(map1);
        System.out.println(map2);
        int count = 0;
        for (Map.Entry<Character, Integer> i : map1.entrySet()) {
            char key = i.getKey();
            int val = i.getValue();
            if (map2.containsKey(key)) {
                if (map2.get(key) == val) {
                    ++count;
                } else {
                    return false;
                }
            }

        }
        return map1.size() == count;

    }

    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> second = new HashMap<>();
        int n = s.length(), cnt = 0;
        for (int i = 0; i < n; i++) {
            first.put(s.charAt(i), first.getOrDefault(s.charAt(i), 0) + 1);
            second.put(goal.charAt(i), second.getOrDefault(goal.charAt(i), 0) + 1);
            if (s.charAt(i) != goal.charAt(i))
                ++cnt;
        }

        System.out.println(first);
        System.out.println(second);

        boolean flag = false;
        for (Map.Entry<Character, Integer> i : first.entrySet()) {
            char key = i.getKey();
            int value = i.getValue();
            if (!second.containsKey(value) || value != second.get(key))
                return false;
            if (value % 2 == 0)
                flag = true;

        }
        if (cnt == 2)
            return true;

        return flag;
    }

    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        Map<Integer, Integer> start = new HashMap<>();
        Map<Integer, Integer> end = new HashMap<>();
        int n = nums.length, max = 0;
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(nums[i])) {
                end.put(nums[i], i);
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
                start.put(nums[i], i);
                end.put(nums[i], i);
            }
            max = Math.max(max, hm.get(nums[i]));

        }
        // System.out.println(hm);
        // System.out.println(start);
        // System.out.println(end);
        // System.out.println(max);
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> i : hm.entrySet()) {
            int val = i.getValue();
            int check = i.getKey();
            if (val == max) {
                // System.out.println(val);
                min = Math.min(min, (end.get(check) - start.get(check)) + 1);
            }
        }

        return min;

    }

    public static boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<>();

        while (n != 1 && !hs.contains(n)) {
            int c = 0;
            hs.add(n);
            while (n > 0) {
                int rem = n % 10;
                c += rem * rem;
                n = n / 10;
            }
            n = c;
        }
        return n == 1 ? true : false;

    }

    public static int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int j = 0;
        while (j < nums.length) {
            if (!set.contains(j)) {
                return j;
            }
            j++;
        }
        return j;

    }

    public static int longestConsecutive(int[] A) {

        TreeSet<Integer> map = new TreeSet<>();
        for (int i : A)
            map.add(i);

        int max = 0, j = 0;

        for (int k : map) {
            j = k;
            break;
        }
        int count = 0;
        for (int i : map) {
            System.out.print(i + " -> " + j + "     ");
            if (i != j) {
                j = i;
                count = 1;
            } else {

                ++count;
            }
            j++;
            max = Math.max(max, count);
        }
        System.out.println();
        return max;
    }

    public static char nonRepeatingCharacter(String S) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char i : S.toCharArray()) {
            if (map.get(i) < 2) {
                return i;
            }
        }
        return '#';

    }

    public static int colorful(int A) {

        ArrayList<Integer> st = new ArrayList<>();
        int r = A;
        while (r > 0) {
            int rem = r % 10;
            st.add(rem);
            r /= 10;
        }
        int n = st.size();
        TreeSet<Integer> map2 = new TreeSet<>();
        System.out.println(st);
        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = i; j < n; j++) {
                val *= st.get(j);
                if (map2.contains(val)) {
                    return 0;
                }

                map2.add(val);

            }
        }

        return 1;

    }

    public static int maxLen(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int totalSum = 0, sum = 0;
        int max = 0;
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            if (map.containsKey(totalSum - sum)) {
                max = Math.max(i - map.get(totalSum - sum), max);
            } else {
                map.put(totalSum, i);
            }
        }

        return max;
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int totalSum = 0;

        ArrayList<Integer> result = new ArrayList<>();
        map.put(0, -1);

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            if (map.containsKey(totalSum - sum)) {

                result.add(map.get(totalSum - sum) + 2);
                result.add(i + 1);
                return result;
            } else {
                map.put(totalSum, i);
            }
        }
        if (result.size() != 2) {
            result.add(-1);
        }
        return result;

        // Map<Integer, Integer> map = new HashMap<>();
        // List<Integer> subarray = new ArrayList<>();
        // int currSum = 0;
        // for (int i = 0; i < n; i++) {
        // currSum += arr[i];
        // if (map.containsKey(currSum - sum)) {
        // subarray.add(map.get(currSum - sum) + 2);
        // subarray.add (i + 1);
        // break;
        // }
        // map.put(currSum, i);
        // }
        // return new ArrayList<>(subarray);

    }

    static void frequecies(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }

    static int[] twosumusingMap(int a[], int x) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans[] = { -1, -1 };
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(x - a[i])) {
                ans[0] = map.get(x - a[i]);
                ans[1] = i;
                return ans;
            } else {
                map.putIfAbsent(a[i], i);
            }
        }
        return ans;
    }

    public static int findsum(int arr[], int n) {
        Set<Integer> hs = new HashSet<>();
        int sum = 0, count = 0;
        hs.add(0);
        for (int e : arr) {
            sum += e;
            if (hs.contains(sum)) {
                ++count;
            } else {
                hs.add(sum);
            }
        }
        return count;
    }

}
