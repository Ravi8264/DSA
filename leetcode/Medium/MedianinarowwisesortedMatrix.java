import java.util.Arrays;

public class MedianinarowwisesortedMatrix {
    public static void main(String[] args) {
        int a[][] = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
       System.out.println(median(a, a.length, a[0].length));
    }

    public static int median(int matrix[][], int R, int C) {
        int a[] = new int[R * C], k = 0;
        for (int j = 0; j < C; j++) {
            for (int i = 0; i < R; i++) {
                a[k++] = matrix[j][i];
            }
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int min = a.length / 2;
        return (R * C) % 2 == 0 ? (a[min] + a[min + 1]) / 2 : a[min];
    }
}
