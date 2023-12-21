import java.util.*;

class subSequence {

    public static ArrayList<ArrayList<Integer>> AllSubsets(ArrayList<Integer> nums) {
        nums.sort(null);
        ;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ans(nums, 0, new ArrayList<>(), result);

        return result;
    }

    static void ans(ArrayList<Integer> arr, int index, ArrayList<Integer> current,
            ArrayList<ArrayList<Integer>> result) {
        if (index == arr.size()) {
            if (!result.contains(current)) {
                current.sort(null);
                result.add(new ArrayList<>(current));
            }
            return;
        }

        current.add(arr.get(index));
        ans(arr, index + 1, current, result);
        current.remove(current.size() - 1);
        ans(arr, index + 1, current, result);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        ArrayList<ArrayList<Integer>> subsequences = AllSubsets(arr);

        for (List<Integer> subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }
}
