public class ContainerWIthMostWater {
    public static void main(String[] args) {
        int a[]={1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution().maxArea(a));
    }
}


class Solution {
    public int maxArea(int[] height) {
        int i=0,max=0;
        int j=height.length-1;
        while(i<j){
            int water=j-i;
            int min=Math.min(height[i],height[j])*water;
            max=Math.max(min,max);
            if(height[i]>height[j])j--;
            else i++;
        }
        return max;
    }
}