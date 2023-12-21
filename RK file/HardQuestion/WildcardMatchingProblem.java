import java.util.Scanner;

public class WildcardMatchingProblem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        System.out.println(isMatch(a,b));
    }
 public static boolean isMatch(String text, String pattern) {
     
        int textPointer = 0, patternPointer = 0;
        int textStar = -1, patternStar = -1;

        while (textPointer < text.length()) {
            if (patternPointer < pattern.length() && 
                (text.charAt(textPointer) == pattern.charAt(patternPointer) || pattern.charAt(patternPointer) == '?')) {
                textPointer++;
                patternPointer++;
            } else if (patternPointer < pattern.length() && pattern.charAt(patternPointer) == '*') {
                patternStar = patternPointer;
                textStar = textPointer;
                patternPointer++;
            } else if (patternStar != -1) {
                patternPointer = patternStar + 1;
                textPointer = textStar + 1;
                textStar++;
            } else {
                return false;
            }
        }
        while (patternPointer < pattern.length() && pattern.charAt(patternPointer) == '*') {
            patternPointer++;
        }

        return patternPointer == pattern.length();
    }




}


















//     public static int isMatch(String s, String p) {
//         int count1 = 0, count2 = 0;
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (c == '*') {
//                 count1 += 2;
//             } else {
//                 count1 += 1;
//             }

//         }
//         for (int j = 0; j < p.length(); j++) {
//             char m = p.charAt(j);
//             if (m == '*') {
//                 count2 += 2;
//             } else {
//                 count2 += 1;
//             }
//         }
//         if(count1!=count2)return 0;
//         int i = 0, j = 0;

//         while (s.length() > i && p.length() > j) {
//             if (s.charAt(i) == p.charAt(j) || s.charAt(i) == '?' || p.charAt(j) == '?') {
//                 ++i;
//                 ++j;
//             } else if (s.charAt(i) == '*') {
//                 if (p.charAt(j) != p.charAt(j + 1))
//                     return 0;
//                 j += 2;
//             } else if (p.charAt(j) == '*') {
//                 if (s.charAt(i) != s.charAt(i + 1))
//                     return 0;
//                 i += 2;
//             } else {
//                 return 0;
//             }

//         }
//         return 1;
//     }

// }


   


