

import java.util.*;

import static java.util.Collections.checkedCollection;
import static java.util.Collections.swap;

public class Maximum_unsorted_Arrays {
     public static void main(String[] args) {
         List<Integer> val=List.of(1,3,2,2,2);
         System.out.println(subUnsort(new ArrayList<>(val)));
     }



     public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
         ArrayList<Integer> st = new ArrayList<>(A);
         Collections.sort(st);
         int min = A.size(), max = 0;

         for (int i = 0; i < A.size(); i++) {
             if (A.get(i) != st.get(i)) {
                 min = Math.min(i, min);
                 max = Math.max(i, max);

             }
         }
         ArrayList<Integer> ans = new ArrayList<>();
         if (max == 0) {
             ans.add(-1);
         } else {
             ans.add(min);
             ans.add(max);
         }
         return ans;
     }



    //  public static  ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
    //   ArrayList<Integer> st=new ArrayList<>(A);
    //   Collections.sort(st);
    //     boolean flag=true;
    //    int  last=0,first=0;
    //   ArrayList<Integer> ans=new ArrayList<>();
    //   for(int i=0; i<A.size(); i++){
    //       if(A.get(i)!=st.get(i)){
    //           if(flag){
    //               first=i;
    //               flag=!flag;
    //           }
    //           else{
    //               last=i;
    //           }
    //       }
    //   }
    //     if(last!=0){
    //         ans.add(first);
    //         ans.add(last);

    //     }
    //     else{
    //         ans.add(-1);
    //     }
    //  return ans;
    //  }
}