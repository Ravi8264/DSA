public class Second_Lacture {
    public static void main(String[] args) {
        // int nums[] = { 2, 3, 5, 8, 9, 15, 15 };
        int nums[] = { 10, 11, 13, 14, 1, 2, 4, 6, 7, 9 };
        System.out.println(findinsortedroattedArray(nums, 10));

    }

    static int upperBond(int nums[], int k) {
        int l = 0, r = nums.length - 1;
        int ans = nums.length;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] <= k) {
                l = m + 1;
            } else if (k < nums[m]) {
                ans = m;
                r = m - 1;
            }
        }
        return ans;
    }

    static int lowerbond(int nums[], int k) {
        int l = 0, r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (k > nums[m]) {
                ans = m;
                l = m + 1;
            } else if (k <= nums[m]) {
                r = m - 1;
            }

        }
        return ans;
    }

    static int findinsortedroattedArray(int a[], int k) {
        int l = 0, r = a.length - 1;
        while (l <= r) {

            int m = l + (r - l) / 2;
            if (a[m] == k)
                return m;
            if (a[m] == a[l] && a[m] == a[r]) {
                l++;
                r--;
            }
            else if (a[l] <= a[m]) {// left part is sorted
                if (a[l] <= k && k < a[m])
                    r = m - 1;
                else {
                    l = m + 1;
                }
            } else {// right part is sorted
                if (a[m] < k && k <= a[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return -1;
    }

}
