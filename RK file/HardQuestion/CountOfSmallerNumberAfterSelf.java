import java.util.ArrayList;
import java.util.List;

public class CountOfSmallerNumberAfterSelf {
    public static void main(String[] args) {
        int nus[] = { 11, 22, 8, 9 };
        System.out.println(countSmaller(nus));
    }

    public static List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        List<Integer> st = new ArrayList<>();
        int count[] = new int[n];
        int indexes[] = new int[n];

        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }
        merge(nums, indexes, count, 0, nums.length - 1);
        for (int c : count) {
            st.add(c);
        }

        return st;
    }

    private static void merge(int[] nums, int[] indexes, int[] count, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            merge(nums, indexes, count, left, mid);
            merge(nums, indexes, count, mid + 1, right);
            mergeSort(nums, indexes, count, left, mid, right);
        }
    }

    static void mergeSort(int nums[], int indexes[], int count[], int left, int mid, int right) {
        int n1 = mid - left + 1;
    int n2 = right - mid;

    int L[] = new int[n1];
    int R[] = new int[n2];

    for (int i = 0; i < n1; i++) {
        L[i] = indexes[left + i];
    }
    for (int j = 0; j < n2; j++) {
        R[j] = indexes[mid + j + 1];
    }

    int i = 0, j = 0, k = left;
    int rightcount = 0;

    while (i < n1 && j < n2) {
        if (nums[L[i]] <= nums[R[j]]) {
            indexes[k] = L[i];
            count[L[i]] += rightcount;
            i++;
        } else {
            rightcount++;
            indexes[k] = R[j];
            j++;
        }
        k++;
    }
        while (i < n1) {
            indexes[k] = L[i];
            count[L[i]] += rightcount;
            i++;
            k++;
        }
        while (j < n2) {
            indexes[k] = R[j];
            j++;
            k++;
        }
    }
}
