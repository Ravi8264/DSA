public class mostWater {
    public static void main(String[] args) {
        int water[] = { 1, 2, 1, 8, 1, 1, 9, 2, 4 };
        System.out.println(maxwaterArea(water));
    }

    public static int maxwaterArea(int[] arr) {
        int i = 0, j = arr.length - 1;
        int maxwater = 0;
        System.out.println(j);
        while (i < j) {
            int waterContainer = (Math.min(arr[j], arr[i])) * (j - i);
            maxwater = Math.max(maxwater, waterContainer);
            if (arr[i] < arr[j])
                i++;
            else
                j--;

        }
        return maxwater;
    }

}
