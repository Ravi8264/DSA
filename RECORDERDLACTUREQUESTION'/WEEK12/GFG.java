import java.util.*;

class GFG {
    public static List<Integer> findSubarrayWithGivenSum(List<Integer> arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> subarray = new ArrayList<>();
        int currSum = 0;
        int n=arr.size();
     

        for (int i = 0; i < arr.size(); i++) {
            currSum += arr.get(i);
            if (map.containsKey(currSum - sum)) {
                System.out.println(map.get(currSum - sum) + 1 + "    " + (i + 1));
                subarray = arr.subList(
                        map.get(currSum - sum) + 1, i + 1);
                break;
            }
            map.put(currSum, i);
        }
        System.out.println(subarray);
        return subarray;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 7, 5);
        List<Integer> subarray = findSubarrayWithGivenSum(arr, 12);
        if (subarray.isEmpty()) {
            System.out.println(
                    "No subarray with given sum found");
        } else {
            System.out.print("Subarray: [ ");
            for (int i : subarray) {
                System.out.print(i + " ");
            }
            System.out.println("]");
        }
    }
}