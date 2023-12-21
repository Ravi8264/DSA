public class Check_if_Array_sorted_or_not {
    public static void main(String[] args) {

        int a[]= { 10, 20, 40, 25 };
        System.out.println(new Solution().arraySortedOrNot(a,a.length));
        
    }
    
}


 class Solution{
    public static boolean arraySortedOrNot(int []arr, int n){
       

     for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i]>arr[j]) return false;
        }
     }
     return true;


      
    }
}