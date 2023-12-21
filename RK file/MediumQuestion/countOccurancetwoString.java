import java.util.Scanner;

public class countOccurancetwoString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = "aaaa";
        String b = "a";
        System.out.println(new Solution().count(a, b));

    }
}


class Solution {
    public static int count(String text, String word) {
        //You can code here
    return occuranceOfstr1(text,word,0);
 }
  static int occuranceOfstr1(String text, String str,int i){
        if(i>text.length()-str.length()){
            return 0;
        }
 
        int subproblem= occuranceOfstr1(text, str, i+1);
        int result=text.substring(i,i+str.length()).equals(str)?1:0;
        return subproblem+result;
    }

}










//for loop method

// class Solution {
//     public static int count(String text, String word) {
//         int count = 0;
//         for (int i = 0; i < text.length(); i++) {
//             if (text.charAt(i) == word.charAt(0)) {
//                 if (text.length() >= i + word.length()  && text.substring(i, i + word.length()).equals(word))
//                     ++count;
//             }

//         }
//         return count;

//     }
// }



// recursion method
// class Solution2 {

//     public static int count(String text, String word) {

//         return NumberofOccurance(text,word,0);

//     }
//     static int NumberofOccurance(String text, String word, int index){
//         if(index>text.length()-word.length()){
//             return 0;
//         }
//         if(text.substring(index,index+word.length()).equals(word)){
//             return 1+NumberofOccurance(text, word,  ++index);
//         }
//         else{
//            return NumberofOccurance(text, word,  ++index);
//         }
//     }
// }

//  class Solution2 {
//      public static int count(String text, String word) {
//        //You can code here
//         return countOccurrencesHelper(text, word, 0);
//  }


 // public  static int countOccurrences(String t, String s) {
 //        return countOccurrencesHelper(t, s, 0);
 //    }




//     static int countOccurrencesHelper(String text, String word, int i) {
//         if (i > word.length() - text.length()) {
//             return 0;
//         } 
//             int subProblemKaAnswer = countOccurrencesHelper(text, word, i + 1);
//             boolean doStartingCharsMatch = word.substring(i, i + text.length()).equals(text);
//            if(doStartingCharsMatch) return  subProblemKaAnswer + 1;
//              else return subProblemKaAnswer;

//     }


// }