import java.util.*;

public class AssignMicetoHoles {
    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(100));
    }

    public static int monotoneIncreasingDigits(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int max = digits.length;
        for (int i = digits.length - 1; i > 0; i--) {// 117753939
            if (digits[i] < digits[i - 1]) {
                int c = (digits[i - 1] - '0') - 1;
                digits[i - 1] = (char) (c + '0');
                max = i - 1;
            }
        }
        for(int i=max+1; i<digits.length; i++){
            digits[i]='9';
        }
        String ans = "";
        for (char i : digits)
            ans = ans + i;
        return Integer.parseInt(ans);

        // }
        // public static int monotoneIncreasingDigits(int n) {
        // char[] digits = Integer.toString(n).toCharArray();
        // int length = digits.length;
        // int marker = length;
        // for (int i = length - 1; i > 0; i--) {// 117753939
        // if (digits[i] < digits[i - 1]) {
        // marker = i - 1;
        // digits[i - 1]--;
        // }
        // }
        // System.out.println(marker);

        // for (int i = marker + 1; i < length; i++) {
        // digits[i] = '9';
        // }

        // return Integer.parseInt(new String(digits));
        // }

    }
}