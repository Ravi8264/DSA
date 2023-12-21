
public class uniquenumberinpair {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 6, 2, 4 };
        // xor is more important
        xor(arr);

    }

    static void xor(int arr[]) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = arr[i] ^ xor;
        }
     
        int mask=xor &(-xor);
        int firstNumber=0;
        for(int e:arr){
            if((mask&e)==0){
               firstNumber=firstNumber^e;
            }
        }
        int secondNumber=xor^firstNumber;
        System.out.println(firstNumber+"  "+secondNumber);

    }

}
