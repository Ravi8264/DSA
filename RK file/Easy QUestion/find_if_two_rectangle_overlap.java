public class find_if_two_rectangle_overlap {
    public static void main(String[] args) {
      int a[]=  {1, 4, 2, 8};
       int b[]=  {1, 3, 2, 4};
       System.out.println(new Solution().isRectangleOverlap(a, b));
    }
}
 class Solution {
	public boolean isRectangleOverlap(int[] rec1, int[] rec2)
    {
      boolean X_axix=rec1[0]<rec2[2] && rec1[2]>rec2[0];
      boolean Y_axix=rec1[1]<rec2[3] && rec1[3]>rec2[1];

      return X_axix && Y_axix;
      
    
    }
}