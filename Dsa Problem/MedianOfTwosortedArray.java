import java.util.Arrays;

public class MedianOfTwosortedArray {
    public static void main(String args[]) {

        int[] m = { 1, 3 };
        int n[] = { 2 };

        System.out.println((new Solution().findMedianSortedArrays(m, n)));
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int j = 0;
        int ans[] = new int[m + n];
        for (Integer i : nums1) {
            ans[j++] = i;
        }
        for (Integer k : nums2) {
            ans[j++] = k;
        }
        Arrays.sort(ans);
        double p = 0;

        int val=0;
        if (ans.length % 2 != 0) {
            val=ans.length/2;
            p=ans[val];

        } else {
          val=ans.length/2-1;
          p=(double)(ans[val]+ans[val+1])/2;
        }

        System.out.println(Arrays.toString(ans));
        return p;

    }
}



//time complexity of this code is  O(nlogn)


// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).
 

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.





