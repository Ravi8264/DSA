import java.util.*;

public class find_pair {
    public static void main(String[] args) {
        int a[] = { 1, 9, 10, 8, 2, 2, 10, 7, 9, 1 };

        List<List<Integer>> ans = new Solution().findPair(a);
        for (List<Integer> i : ans) {
            System.out.println(i);
        }
    }

}

class Solution {
  public static List<List<Integer>> findPair(int[] arr)
    {
        //You can code here
      List<List<Integer>> ans = new ArrayList<>();
      int n = arr.length;
      int[] x = Arrays.copyOf(arr,n);
      for(int i=0; i<n; i++){
        for(int j=i+1; j<n ; j++){
        if(exist(x,arr[i] + arr[j],n)){
          List<Integer> res = new ArrayList<>();
          res.add(arr[i]);
          res.add(arr[j]);
          ans.add(res);
        } 
        }
      }
//       ans.sort((x, y) -> {
//     for (int i = 0; i < x.size(); i++) {
//           int cmp = x.get(i).compareTo(y.get(i));
//                 if (cmp != 0) {
//                     return cmp;
//                 }
//     }
//     return Integer.compare(x.size(), y.size());
// });


  ans.sort((a,b)->{  //if size is same  a and b
        for(int i=0; i<a.size(); i++){
          if(a.get(i)!=(b.get(i))){
            System.out.println(a.get(i)-(b.get(i)));
            return a.get(i)-(b.get(i));
          }
        }
        return 0;
      });


          // ans.sort((x, y) -> {
          //   int minLen = Math.min(x.size(), y.size());
          //   for (int i = 0; i < minLen; i++) {
          //       int cmp = x.get(i).compareTo(y.get(i));
          //       if (cmp != 0) {
          //           return cmp;
          //       }
          //   }
        //     return Integer.compare(x.size(), y.size());
        // });
      return ans;

    }
    public static boolean exist(int [] arr, int sum, int n){
      for(int i=0; i<n; i++){
        if(arr[i] == sum)
          return true;
      }
      return false;
    }

}










// class Solution {
//     public List<List<Integer>> findPair(int[] arr) {
//         // Arrays.sort(arr);
//         int n = arr.length;
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> st = new ArrayList<>();
//         for (int i = 0; i < arr.length; i++)
//             st.add(arr[i]);
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (st.contains(arr[i] + arr[j])) {
//                     List<Integer> pair = new ArrayList<>();
//                     pair.add(arr[i]);
//                     pair.add(arr[j]);
//                     ans.add(pair);
//                 }
//             }
//         }
//         Collections.sort(ans, new ravi());
//         ;
//         return ans;
//     }
// }

// class ravi implements Comparator<List<Integer>> {
// @Override
// public int compare(List<Integer> o1, List<Integer> o2) {
// if (o1.get(0).equals(o2.get(0))) {
// return o1.get(1).compareTo(o2.get(1));
// }
// return o1.get(0).compareTo(o2.get(0));

// }
// }




// class ravi implements Comparator<List<Integer>> {
//     @Override
//     public int compare(List<Integer> o1, List<Integer> o2) {
//         int min = Math.min(o1.size(), o2.size());
//         for (int i = 0; i < min; i++) {
//             int comperarision = o1.get(i).compareTo(o2.get(i));
//             if (comperarision != 0)
//                 return comperarision;

//         }
//         return Integer.compare(o1.size(), o2.size());
//     }
// }

// class LexicographicComparator implements Comparator<List<Integer>> {
// @Override
// public int compare(List<Integer> o1, List<Integer> o2) {
// int size = Math.min(o1.size(), o2.size());
// for (int i = 0; i < size; i++) {
// int comparison = o1.get(i).compareTo(o2.get(i));
// if (comparison != 0) {
// return comparison;
// }
// }
// return Integer.compare(o1.size(), o2.size());
// }
// }