// public class printerproblem {
//     public static void main(String[] args) {
//         int a[] = { 55, 8, 33, 12, 48, 9, 1 };
//         System.out.println(getMinimumTime(a, a.length, 2));
//     }

//     public static int getMinimumTime(int arr[], int n, int k) {
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//             arr[i] = sum;
//         }
//         int b = sum / k;
//         int l = 0, r = arr.length - 1;
//         while (l <= r) {
//             int mid = l + (l + r) / 2;
//             System.out.println(l+" "+r+"  ");
//             if (arr[mid] == b) {
//                 return arr[mid];
//             } else if (arr[mid] < b) {
//                 l = mid + 1;
//             } else {
//                 r = mid - 1;
//             }

//         }
//         return 0;

//     }
// }

public class printerproblem {
    static int countPrinter(int a[], int time) {
        int count = 1, sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > time) {
                count++;
                sum = a[i];
            }
        }
        return count;
    }

    static int getMinimumTime(int[] a, int n, int k) {
        int l = -1, h = 0;
        for (int i : a) {
            l = Math.max(i, l);
            h += i;
        }
        int ans = 0;
        while (l <= h) {
            int mid = (l + h) / 2;
            int prntCount = countPrinter(a, mid);
            if (k == prntCount)
                ans = mid;
            if (prntCount > k) {
                l = mid + 1;
            } else {
                h = mid - 1;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = { 88, 12, 76, 91, 45, 58, 33, 77 };
        System.out.println(getMinimumTime(a, a.length, 4));
    }

}