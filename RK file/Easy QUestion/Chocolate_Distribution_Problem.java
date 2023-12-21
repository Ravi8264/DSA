 
    
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

 class Chocolate_Distribution_Problem{
    public static void main(String[] args) {
      int[]  A = {7, 3, 2, 4, 9, 12, 56};
      int m=3;
        System.out.println(findMinDiff(A,m));
    }
    public static int findMinDiff(int[] arr, int m)
    {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length-m+1;i++){
            int curr_Min=arr[i+m-1]-arr[i];
            min=Math.min(min,curr_Min);
        }
       ArrayList<Integer> st1=new ArrayList<>();
       st1.add(4);
        if(st.get(0)!=st1.get(0)){{
            // System.out.println();
        }
        }
        return min;
    }

}