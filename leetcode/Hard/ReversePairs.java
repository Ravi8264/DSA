import java.util.*;
public class ReversePairs {
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        System.out.println(reversePairs(nums));
    }
    public static int reversePairs(int[] nums) {
        cnt = 0;
        mergeSort(nums, 0, nums.length - 1);
        return cnt;
    }
    private static void mergeSort(int[] nums, int l, int h) {
        if (l >= h)
            return;
        int m = l + (h - l) / 2;
        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, h);
        countpair(nums, l, m, h);
        mergeValue(nums, l, m, h);
    }
    private static void countpair(int[] nums, int l, int m, int h) {
        int right = m + 1;
        for (int i = l; i <= m; i++) {
            while (right <= h && nums[i] > 2 * nums[right]) {
                right++;
            }
            cnt += right - (m + 1);
        }
    }
    private static void mergeValue(int[] nums, int l, int m, int h) {
        int n1 = m - l + 1;
        int n2 = h - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = nums[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = nums[m + i + 1];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                nums[k++] = L[i++];
            } else {
                nums[k++] = R[j++];
            }

        }
        while (i < n1) {
            nums[k++] = L[i++];
        }
        while (j < n2) {
            nums[k++] = R[j++];
        }
    }

}
