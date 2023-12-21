
import java.util.*;
public class combination {
    public static void main(String[] args) {
        int a[]={8,1,3,7,2,1,5};
        int n=12;
        System.out.println(new Solution().combinationSum2(a,n));
    }
}

 class Solution
{
    public void helper(int currIdx , int[] candidates ,int target , List<List < Integer>> ans , List < Integer>ds){
      if(target == 0){
        ans.add(new ArrayList(ds));
        return;
      }
      for(int i = currIdx ; i<candidates.length ; i++){
        if(i>currIdx && candidates[i] == candidates[i-1]){
          continue;
        }
        if(target < candidates[i]) break;

        ds.add(candidates[i]);
        helper(i+1 , candidates , target-candidates[i] , ans ,ds);
        ds.remove(ds.size()-1);
      }
    }
    public List<List < Integer>> combinationSum2(int[] candidates, int target)
    {
        //You can code here
        List<List < Integer>> ans = new ArrayList();
        List < Integer> ds = new ArrayList();
        Arrays.sort(candidates);
        helper(0 , candidates , target , ans ,ds);
        return ans;
    }
}