import java.util.*;

public class subset {
    public static void main(String[] args) {
       int nums[]={1,2,3};
        
        System.out.println(new Solution().subsets(nums));

    }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> st=new ArrayList<>();
        Allsubset(nums,st,0,ans);
        return ans;
    }
    private void Allsubset(int[] nums,  ArrayList<Integer> s, int i,List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(s); 
            return;
        }
        Allsubset(nums,new ArrayList<>(s),i+ 1,ans);
        s.add(nums[i]);
        Allsubset(nums,new ArrayList<>(s),i+1,ans);
    }
}








// class Solution2 {
//     public List<List<Integer>> subsets(int[] nums) {
//         Arrays.sort(nums);
//         List<List<Integer>> ans = new ArrayList<>();
//         ans.add(new ArrayList<>());
//         for (Integer i : nums) {
//             int n = ans.size();
//             for (int j = 0; j < n; j++) {
//                 List<Integer> val = new ArrayList<>(ans.get(j));
//                 val.add(i);
//                 ans.add(val);
//             }
//         }
//         return ans;
//     }
// }