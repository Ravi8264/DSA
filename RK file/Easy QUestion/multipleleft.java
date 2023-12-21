import java.util.Arrays;

public class multipleleft {
    public static void main(String[] args) {
        int []a={1 ,2 ,3, 4 ,5};
        int b[]={2,3};
        int [][]ans=new Solution().multipleLeftRotation(a,b);
        for(int i=0; i<b.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}

//  class Solution {
//     public int[][] multipleLeftRotation(int[] A, int[] B) {
//         //You Can Code Here
//       int n=A.length;
//       int m=B.length;
//       int ans[][]=new int[m][n];
//       int i=0; 
//       while(m>i){
//         leftRotation(A,ans,n,B[i]%n,i,0);
//         i++;
//       }

//       return ans;
//     }
//   void leftRotation(int []A,int [][]ans,int n,int curr,int index,int start){
  
//     for(int i=curr; i<n; i++){
//         ans[index][start++]=A[i];
//     }
//      for(int i=0; i<curr; i++){
//       ans[index][start++]=A[i];
//     }
//   }
// }

 class Solution
{
   	// Fills temp[] with two copies of arr[]
    public static void preprocess(int arr[], int n, int temp[])
    {
       	// Store arr[] elements at i and i + n
        for (int i = 0; i < n; i++)
            temp[i] = temp[i + n] = arr[i];
    }

   	// Function to left rotate an array k time
    public static int[] rotateLeft(int arr[], int n, int k,
        int temp[])
    {
       	// Starting position of array after k
       	// rotations in temp[] will be k % n
        int start = k % n;

        int[] nArr = new int[n];
        for (int i = start; i < start + n; i++)
            nArr[i - start] = temp[i];

        return nArr;
    }

    public int[][] multipleLeftRotation(int[] A, int[] B)
    {
        int n = A.length, m = B.length;
        int temp[] = new int[2 *n];
        preprocess(A, n, temp);
        System.out.println(Arrays.toString(temp));
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; ++i)
        {
            int k = B[i];
            ans[i] = rotateLeft(A, n, k, temp);
        }
      
        return ans;
    }
}