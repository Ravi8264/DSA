public class chunck {
    public static void main(String[] args) {
        int a[] = {3,8,1,0,2,5,4,6,7 };
        System.out.println(maxChunksToSorted(a));
    }

    public static int maxChunksToSorted(int[] arr) {
        // You can code here
        int n = arr.length ;
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
            if (i == max) {
                ++count;
            }
        }
        return count;
    }

}