
import java.util.*;
public class npositiveNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(new solution().printAllNum(n));
        
    }
    
}

class solution{
   ArrayList<Integer> printAllNum(int n){
    ArrayList<Integer> st=new ArrayList<>();
     printItRecursively(n,st);
     return st;
    }
    void printItRecursively(int n,ArrayList<Integer> q){
        q.add(n);
        if(n==0) return;
        else{
            printItRecursively(n-1,q);
            
        }

    }
    public void area(int[] a) {
    }

}
