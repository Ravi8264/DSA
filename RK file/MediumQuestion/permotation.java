import java.util.*;

class permotation {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        List<List<Integer>> ans = (new Solution().permute(a));
        System.out.println(ans);

    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // You can code here
        List<List<Integer>> finalList = new ArrayList<>();

        // List<List<Integer>> sortedListOfList = new ArrayList<>();

        finalList = permutationHelper(nums, 0, nums.length - 1, finalList);

        Collections.sort(finalList, new a());

        return finalList;
    }

    public List<List<Integer>> permutationHelper(int[] a, int left, int right, List<List<Integer>> finalList) {
        // Base case
        if (left == right) {
            List<Integer> al = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                al.add(a[i]);
            }
            finalList.add(al);
        }

        // Algo
        for (int i = left; i <= right; i++) {
            swap(a, i, left);
            permutationHelper(a, left + 1, right, finalList);
            swap(a, i, left);
        }
        return finalList;
    }

    // Swapping
    private static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}

class a implements Comparator<List<Integer>> {
    @Override
    public int compare(List<Integer> o1, List<Integer> o2) {
        int size = Math.min(o1.size(), o2.size());
        for (int i = 0; i < size; i++) {
            int cmp = o1.get(i).compareTo(o2.get(i));
            if (cmp != 0) {
                return cmp;
            }
        }
        return Integer.compare(o1.size(), o2.size());
    }

}
