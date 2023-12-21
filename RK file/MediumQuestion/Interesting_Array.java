public class Interesting_Array {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Solution {

    public static int isInteresting(int[] arr) {
        int n = arr.length;
        if (n < 1)
            return 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0)
                ++count;
        }

        if (count % 2 != 0)
            return 0;

        return 1;

    }
}