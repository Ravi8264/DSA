import java.util.*;

public class minimuoperation {
    public static void main(String[] args) {
        int nums[] = { 2, 1, 3, 1, 1, 3, 1, 3 };
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        Map<Integer, Integer> evenOccurrences = new HashMap<>();
        Map<Integer, Integer> oddOccurrences = new HashMap<>();
        int arrayLength = nums.length;
        int maxEvenOccurrences = 0;
        int maxOddOccurrences = 0;
        int evenMaxElement = 0, oddMaxElement = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (i % 2 == 0) {
                evenOccurrences.put(nums[i], evenOccurrences.getOrDefault(nums[i], 0) + 1);
                if (maxEvenOccurrences < evenOccurrences.get(nums[i])) {
                    maxEvenOccurrences = evenOccurrences.get(nums[i]);
                    evenMaxElement = nums[i];
                }
            } else {
                oddOccurrences.put(nums[i], oddOccurrences.getOrDefault(nums[i], 0) + 1);
                if (maxOddOccurrences < oddOccurrences.get(nums[i])) {
                    maxOddOccurrences = oddOccurrences.get(nums[i]);
                    oddMaxElement = nums[i];
                }
            }
        }

        if (evenMaxElement != oddMaxElement) {

            return arrayLength - maxEvenOccurrences - maxOddOccurrences;
        }

        evenOccurrences.remove(evenMaxElement);
        oddOccurrences.remove(oddMaxElement);

        int nextMaxEvenOccurrences = 0;
        int nextMaxOddOccurrences = 0;

        for (Integer evenKey : evenOccurrences.keySet()) {
            nextMaxEvenOccurrences = Math.max(nextMaxEvenOccurrences, evenOccurrences.get(evenKey));
        }

        for (Integer oddKey : oddOccurrences.keySet()) {
            nextMaxOddOccurrences = Math.max(nextMaxOddOccurrences, oddOccurrences.get(oddKey));
        }

        return Math.min(arrayLength - nextMaxOddOccurrences - maxEvenOccurrences,
                arrayLength - nextMaxEvenOccurrences - maxOddOccurrences);

    }

}
