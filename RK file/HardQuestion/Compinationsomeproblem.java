import java.util.*;

public class Compinationsomeproblem {
    public static void main(String[] args) {
        int candies[] = { 4, 3, 4, 2, 2, 2, 2, 3 };
        int target= 23;
        System.out.println(new Solution().combinationSum2(candies, target));

    }

}

// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         Arrays.sort(candidates);
//         List<List<Integer>> result = new ArrayList<>();
//         backtrack(result, new ArrayList<>(), candidates, target, 0);
//         return result;
//     }

//     private void backtrack(List<List<Integer>> result, List<Integer> path, int[] candidates, int target, int start) {
//         if (target == 0) {
//             result.add(new ArrayList<>(path));
//             return;
//         }

//         for (int i = start; i < candidates.length; i++) {
//             if (i>start && candidates[i] == candidates[i - 1]) {
//                 continue; 
//             }

//             if (candidates[i] > target) {
//                 break; 
//             }

//             path.add(candidates[i]);
//             backtrack(result, path, candidates, target - candidates[i], i+1);
//             path.remove(path.size() - 1);
//         }
//     }
// }


class Solution{
    public List<List < Integer>> combinationSum2(int[] candidates, int target)
    {
        //You can code here
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
       System.out.println(Arrays.toString(candidates));
       List<Integer > a=new ArrayList<>();
        helperCombination(candidates, ans, 0, target,a );
        return ans;
    }

    public void helperCombination(int[] a, List<List<Integer>> ans, int index, int sum, List<Integer> curr){
        //Base case
      if(sum == 0){
        List<Integer> currCopy = new ArrayList<Integer>(curr);
        ans.add(currCopy);
        return;
      }
          // { 4, 3, 4, 2, 2, 2, 2, 3 };  
      for(int i=index; i<a.length; i++){
        if (i > index && a[i] == a[i - 1])continue;
        System.out.println(index+"     "+i);

         curr.add(a[i]);
         helperCombination(a, ans, i+1, sum-a[i], curr);

         //Backtrack
         curr.remove(curr.size()-1);
      }
    }
}