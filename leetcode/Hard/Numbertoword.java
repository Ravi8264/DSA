import java.util.*;
public class Numbertoword {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println(new Solution().num_val(scn.nextInt()));
    }
}
class Solution {
    public String numberToWords(int num) {

        if (num == 0)
            return "Zero";
        return num_val(num);
    }
    String num_val(int num) {
        String ans = "";
        String first_twenty[] = {"", "One", "Two", "Three","Four", "Five", "Six", "Seven","Eight", "Nine", "Ten", "Eleven","Twelve", "Thirteen", "Fourteen", "Fifteen","Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };
        String tens[] = { "", "Twenty", "Thirty","Forty", "Fifty", "Sixty","Seventy", "Eighty", "Ninety" };
        if (num < 20) {
            ans = first_twenty[num];
        } else if (num < 100) {
            ans = tens[num / 10 - 1] + " " + first_twenty[num % 10];
        } else if (num < 1000) {
            ans = first_twenty[num / 100] + " Hundred " + num_val(num % 100);
        } else if (num < 1000000) {
            ans = num_val(num / 1000) + " Thousand " + num_val(num % 1000);
        } else if (num < 1000000000) {
            ans = num_val(num / 1000000) + " Million " + num_val(num % 1000000);
        } else {
            ans = num_val(num / 1000000000) + " Billion " + num_val(num % 1000000000);
        }
        return ans.trim();
    }
}










// class Solution {
// private static final String[] LESS_THAN_20 = new String[] {
// "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
// "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
// "Seventeen", "Eighteen", "Nineteen"
// };

// private static final String[] MULTIPLE_OF_TEN = new String[] {
// "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
// "Eighty", "Ninety"
// };

// public String numberToWords(int num) {
// if (num == 0)
// return "Zero";

// return helper(num);
// }

// private String helper(int num) {
// String ans = "";
// if (num < 20)
// ans = LESS_THAN_20[num];
// else if (num < 100)
// ans = MULTIPLE_OF_TEN[num / 10] + " " + helper(num % 10);
// else if (num < 1000)
// ans = helper(num / 100) + " Hundred " + helper(num % 100);
// else if (num < 1000000)
// ans = helper(num / 1000) + " Thousand " + helper(num % 1000);
// else if (num < 1000000000)
// ans = helper(num / 1000000) + " Million " + helper(num % 1000000);
// else
// ans = helper(num / 1000000000) + " Billion " + helper(num % 1000000000);

// return ans.trim();
// }
// }