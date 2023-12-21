public class TrappingWater {
    public static void main(String[] args) {
        int a[]={1,8,2,7,5 };
        System.out.println(new Solution().trap(a));
    }
    
}

// class Solution {
//     public int trap(int[] height) {
//         int n=height.length;
//         int left[]=new int[n];
//         int right[]=new int[n];
//         int move_r=0;
//         int move_l=0;
//         for(int i=0; i<n; i++){
//              left[i]=Math.max(move_r,height[i]);
//              move_r=Math.max(move_r,height[i]);
//              right[n-i-1]=Math.max(move_l,height[n-i-1]);
//              move_l=Math.max(move_l,height[n-i-1]);
//         }
//         int result=0;
//         for(int i=0; i<n; i++){
//             result+=Math.min(left[i],right[i])-height[i];
//         }
//         return result;
          
//     }
// }

//0,1,0,2,1,0,1,3,2,1,2,1

 class Solution {
    public long trap(int[] h) {
        int left = 0, right= h.length - 1;
        int max_l= 0, max_r = 0; 
        long water= 0;

        while (left < right) {
            max_l= Math.max(max_l, h[left]);
             max_r= Math.max(max_r, h[right]);
            water += (max_l < max_r) ?max_l - h[left++] : max_r - h[right--];
        
        }

        return water;
    }
}