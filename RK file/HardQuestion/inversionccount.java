import java.util.Arrays;

public class inversionccount {
    public static void main(String[] args) {
        long[] m = { 2, 4, 1, 3, 5 };

        System.out.println(countInversions(m));

        //System.out.println(new Solution().countInversions(m) );

    }

    public static long countInversions(long[] A) {

        return merge(A, 0, A.length - 1);

    }

  private static long merge(long[] a, long l, long h) {
    long cnt = 0;
    if (l < h) {
        long m = l + (h - l) / 2;
        cnt += merge(a, l, m);
        cnt += merge(a, m + 1, h);
        cnt += mergerArray(a, l, m, h);
    }
    return cnt;
}


    private static long mergerArray(long[] a, long l, long m, long h) {
        long n1 = m - l + 1;
        long n2 = h - m;
        long cnt = 0;
        long arr1[] = new long[(int) n1];
        long arr2[] = new long[(int) n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = a[(int) l + i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = a[(int) m + i + 1];
        }

        int i = 0, j = 0, k = (int) l;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                a[k] = arr1[i];
                i++;
            } else {
                a[k] = arr2[j];
               
                j++;
                 cnt += n1 - i; 
            }
            k++;
        }
        while (i < n1) {
            a[k++] = arr1[i++];
        }
        while (j < n2) {
            a[k++] = arr2[j++];
        }
        return cnt;

    }

}

//  class Solution {

//     public static long countInversions(long[] A) {
//         return merge(A, 0, A.length - 1);
//     }

//     private static long merge(long[] a, long l, long h) {
//         long cnt = 0;
//         if (l < h) {
//             long m = l + (h - l) / 2;
//             cnt += merge(a, l, m);
//             cnt += merge(a, m + 1, h);
//             cnt += mergerArray(a, l, m, h);
//         }
//         return cnt;
//     }

//     private static long mergerArray(long[] a, long l, long m, long h) {
//         long n1 = m - l + 1;
//         long n2 = h - m;
//         long cnt = 0;
//         long arr1[] = new long[(int) n1];
//         long arr2[] = new long[(int) n2];
//         for (int i = 0; i < n1; i++) {
//             arr1[i] = a[(int) l + i];
//         }
//         for (int i = 0; i < n2; i++) {
//             arr2[i] = a[(int) m + i + 1];
//         }

//         int i = 0, j = 0, k = (int) l;
//         while (i < n1 && j < n2) {
//             if (arr1[i] <= arr2[j]) {
//                 a[k] = arr1[i];
//                 i++;
//             } else {
//                 a[k] = arr2[j];
//                 cnt += n1 - i;
//                 j++;
//             }
//             k++;
//         }
//         while (i < n1) {
//             a[k++] = arr1[i++];
//         }
//         while (j < n2) {
//             a[k++] = arr2[j++];
//         }
//         return cnt;
//     }
// }
