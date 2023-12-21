import java.util.*;

public class WaveArray {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(new Solution().wave(a));
    }
    
}

class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
   	    Collections.sort(A);
      
      for(int i=1; i<A.size(); i++){
        if(A.get(i)>A.get(i-1)){
          swap(A,i,i-1);
        }
      }
   return A;
      
    }
   void swap(ArrayList<Integer> A, int i,int j){
     int temp1=A.get(i);
     int temp2=A.get(j);
      A.add(i,temp2);
     A.add(j,temp1);
   }
}