public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
        // System.out.println(binary(nums, 4));
        // System.out.println(bianrySearchRecursive(nums, 4, 0, nums.length - 1));
        System.out.println(firstoccurance(nums, 2));
    }

    static int binary(int[] a, int k) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == k)
                return m;
            if (k < a[m])
                r = m - 1;
            else if (k > a[m])
                l = m + 1;
        }
        return -1;
    }

    static int bianrySearchRecursive(int a[], int k, int l, int r) {
        if (l > r)
            return -1;
        int m = l + (r - l) / 2;
        if (a[m] == k)
            return m;
        if (k < a[m])
            return bianrySearchRecursive(a, k, l, m - 1);
        return bianrySearchRecursive(a, k, m + 1, r);
    }

    static int firstoccurance(int a[], int k) {
        int l = 0, r = a.length - 1;
        int ans = -1;
        while (l <= r) {
            System.out.println(l + "  " + r);
            int m = l + (r - l) / 2;
            if (k < a[m]) {
                r = m - 1;
            } else if (k > a[m])
                l = m + 1;
            else {
                r = m - 1;
                ans = m;
            }
        }
        return ans;
    }

    static int lastccurance(int a[], int k) {
        int l = 0, r = a.length - 1;
        int ans = -1;
        while (l <= r) {
            System.out.println(l + "  " + r);
            int m = l + (r - l) / 2;
            if (k < a[m]) {
                r = m - 1;
            } else if (k > a[m])
                l = m + 1;
            else {
                l = m + 1;
                ans = m;
            }
        }
        return ans;
    }

    static int countoccurance(int a[], int k) {
        int fo = firstoccurance(a, k);
        int lo = lastccurance(a, k);
        return lo- fo  + 1;
    }
}
