
public class peakelement {

    public static void main(String[] args) {
        int nums[] = { 6, 5, 4, 3, 2, 3, 2 };
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        int max = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] < nums[m + 1]) {
               l=m+1;

            } else {
            
                r = m ;
            }
        }

        return l;
    }

}
