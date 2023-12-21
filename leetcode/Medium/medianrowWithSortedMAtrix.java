class medianrowWithSortedMAtrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
        System.out.println(searchMatrix2(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, m = matrix[0].length, j = m - 1, n = matrix.length;

        while (i < n && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] > target) {
                j--;
            } else
                i++;
        }
        return false;
    }

    public static boolean searchMatrix2(int matrix[][], int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0;
        int h = m - 1;
        int check = n * m - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int val = matrix[mid / check][mid % check];
            if (val == target)
                return true;
            else if (val < target)
                l = mid + 1;
            else
                h = mid - 1;

        }
        return false;
    }

}
