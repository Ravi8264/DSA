import java.util.Arrays;

class quicksort {
    public static void main(String[] args) {
        int a[] = { 4, 6, 2, 5, 7, 9, 1, 3 };
        quickSOrt(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    static void quickSOrt(int a[], int l, int h) {
        if (l < h) {
            int pivot = partition(a, l, h);
            quickSOrt(a, l, pivot - 1);
            quickSOrt(a, pivot + 1, h);
        }
    }

    static int partition(int a[], int l, int h) {
        int pivot = a[l];
        int i = l, j = h;
        while (i <= j) {
            while (i <= h && a[i] <= pivot)
                i++;
            while (j >= 0 && a[j] < pivot)
                j--;
            if (i < j)
                swap(a, i, j);

        }
        swap(a, l, j);
        return j;

    }

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}

