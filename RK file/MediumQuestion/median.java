import java.util.*;
public class median {
   public static void main(String[] args) {
    int a[][]={{3,63,42},
            {18,12,12},
            {15,21,18},
            {33,84,24}};
     int k=2;
        System.out.println(makeMatrixEqual(a,k));
    }

    static int makeMatrixEqual(int a[][], int k) {
        int n=a.length;
        int m=a[0].length;
        int b[]=new int[n*m];
        int total=m*n;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                b[i*m+j]=a[i][j];
            }
        }
        Arrays.sort(b);
        int median=b[total/2];
        return makeMatrixEqualHelper(b,median,k);
    }
    static  int makeMatrixEqualHelper(int b[],int m,int k){
        int count=0;
        for(int i=0; i<b.length; i++){
            if(b[i]%k!=0)return 0;
            count+=Math.abs(b[i]-m)/k;
        }
        return  count;
    }

}
