import java.util.Arrays;

public class MinimumNumberPlateform {


 
    public static void main(String[] args) {
        int arr[]={5,10,20,40,45};
        int dep[]={15,25,35,42,55};
        System.out.println(minPlateForms(arr, dep));
        
    }
    static int minPlateForms(int arr[],int dep[]){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count=0,i=0,j=0,n=arr.length,maxCount=0;
       while (i<n) {
        if(arr[i]<=dep[j]){
            ++count;
            maxCount=Math.max(maxCount, count);
            i++;
        }
        else{
           --count;
           j++;
        }
       }
       return maxCount;
    }
    
}
