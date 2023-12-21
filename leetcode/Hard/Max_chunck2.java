public class Max_chunck2 {

    public static void main(String[] args) {
        int a[] = { 5};
        System.out.println(new Solution().maxChunksToSorted(a));
    }
}
 class Solution {
    public int maxChunksToSorted(int[] arr) {
    	int []min=new int[arr.length+1];
        min[arr.length]=Integer.MAX_VALUE;
        for(int i=arr.length-1; i>=0; i--){
            min[i]=Math.min(min[i+1],arr[i] );
        }
     int lmax=1;
     int count=0;
     for(int i=0; i<arr.length; i++){
        lmax=Math.max(lmax, arr[i]);
        if(lmax<=min[i+1]){
            ++count;
        }
     }
      return count;
    }
}
