
// Java Program to find the smallest positive missing number
import java.util.*;
public class firstMissingInteger {
    public static void main(String[] args) {
     int []a={ 3, 4, -1, 1};
        System.out.println(new Solution().firstMissingPositive(a));
    }

}

//   class Solution {
// 	public int firstMissingPositive(int[] A) {
//     	int i = 0;
//     	while(i < A.length){
//         	if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length) i++;
//         	else if(A[A[i]-1] != A[i]) swap(A, i, A[i]-1);
//         	else i++;
//     	}
//        System.out.println(Arrays.toString(A));
//     	i = 0;
//     	while(i < A.length && A[i] == i+1) i++;
//     	return i+1;
// 	}
    
// 	private void swap(int[] A, int i, int j){
//     	int temp = A[i];
//     	A[i] = A[j];
//     	A[j] = temp;
// 	}
// }

//0,3,4,1,-4

 class Solution {
	public int firstMissingPositive(int[] A) {
      int i=0;
      int n=A.length;
      System.out.println(Arrays.toString(A));
    	while(i<A.length){
            // System.out.println(A[i]);
              if(A[i]<=n && A[i]>0 && A[A[i]-1] != A[i] && A[i]!=i+1){
                System.out.println(A[i]);
              int temp=A[i];
              A[i]=A[temp-1];
              A[temp-1]=temp;
             System.out.println(Arrays.toString(A));
          }
          else{
            ++i;
          }
        
        }
        for(int j=1; j<n; j++){
            if(A[j-1]!=j){
                return j;
            }
        }
        return n;
      
	}
    
}