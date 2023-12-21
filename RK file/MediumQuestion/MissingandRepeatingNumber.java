import java.util.*;
public class MissingandRepeatingNumber {
    public static void main(String[] args) {
       int a[]= { 4, 2, 3, 2};
       Vector ans=new Solution().findNumbers(a);
       System.out.println(ans);
    }
    
}

//  class Solution
// {
//     public static Vector<Integer> findNumbers(int[] a)
//     {
//       int n=a.length;
//       Arrays.sort(a);
//       int index=0,val=0;
//       Set<Integer> hm=new HashSet<>();
//       Vector<Integer> vac=new Vector<>();
//       for(int j=1; j<=n; j++){
//           hm.add(j);
//       }
//       for(int i=1; i<n; i++ ){
//         if(a[i]==a[i-1]){
//           val=a[i];
//         }
//       }
//       for(Integer i:a){
//         if(hm.contains(i)){
//           hm.remove(i);
//         }
//       }
//       vac.addAll(hm);
//       vac.add(val);
      
//       return vac;
//     }
// }


//  class Solution
// {
//     public static Vector<Integer> findNumbers(int[] a)
//     {

//       Vector<Integer> ans = new Vector<>();
//       int missingNo = -1;
//       int reapeatingNo = -1;
//       int n = a.length;

//       for(int i=1;i<=n;i++){//4, 2, 3, 2
          
//         int count =0;
//         for(int j=0;j<n;j++){
//           if(a[j] == i){
//             count++;
//           }
//         }
//          if(count == 2) reapeatingNo = i;
//           else if(count == 0) {
//             missingNo =i;
          
//       }
//     }
//         ans.add(missingNo);
//         ans.add(reapeatingNo);
//         return ans;


//     }
// }

class Solution
{
    public static Vector<Integer> findNumbers(int[] a)
    {
      Vector<Integer> ans = new Vector<>();
      int missingNo = -1;
      int reapeatingNo = -1;
      int n = a.length;
      for(int i=1;i<=n;i++){
//4, 2, 3, 2
        int count =0;
        for(int j=0;j<n;j++){
          if(a[j] == i){//i==1,2
            count++;
          }
        }
         if(count == 2) reapeatingNo = i;
          else if(count == 0) missingNo =i;
      }

        ans.add(missingNo);
        ans.add(reapeatingNo);
        return ans;


    }
}