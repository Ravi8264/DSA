import java.util.*;
import java.util.Scanner;

public class lettercombinationofaphoneNumber {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // String input = scn.nextLine();
        // System.out.println(new Solution().letterCombinations(input));

        int c=-1;
        int a=4;
        int b=0;
        try{
            c=a/b;
        }
        catch(Exception e){
            System.out.println("finaly");
        }
        finally{
            System.out.println("dnsjahfd");
        }
    }
}

// class Solution {
//     public List<String> letterCombinations(String digits) {
//         List<String> ans = new ArrayList<>();
//         if (digits.isEmpty() || digits == null)
//             return ans;
//         String Mobile_Keypad[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
//         // 0 1 2 3 4 5 6 7 8 9
//         helper(digits, ans, 0, "", Mobile_Keypad);
//         return ans;
//     }

//     void helper(String digits, List<String> ans, int index, String cur, String[] Mobile_Keypad) {
//         if (index == digits.length()) {
//             ans.add(cur);// ad ae af
//             return;
//         }

//         int val = digits.charAt(index) - '0'; // 2 3

//         String val_String = Mobile_Keypad[val]; // Mobile_Keypad[2]="abc" Mobile_Keypad[3]="def"
//         for (int i = 0; i < val_String.length(); i++) {
//             cur += val_String.charAt(i);
//             helper(digits, ans, index + 1, cur, Mobile_Keypad);
//             cur = cur.substring(0, cur.length() - 1);// backtracking
//         }
//     }

// }

// class Solution {
// public List<String> letterCombinations(String digits) {
// String Phonemap[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv",
// "wxyz" };
// List<String> ans = new ArrayList<>();
// if (digits.isEmpty() || digits == null)
// return ans;
// getAll_letter_combination(digits, Phonemap, ans, 0, "");
// return ans;
// }

// void getAll_letter_combination(String digits, String Phonemap[], List<String>
// ans, int index, String current) {
// if (index == digits.length()) {
// ans.add(current.toString());
// return;
// }
// char digit = digits.charAt(index);
// String letters = Phonemap[digit - '0'];
// for (char letter : letters.toCharArray()) {
// getAll_letter_combination(digits, Phonemap, ans, index + 1, current +
// letter);

// }
// }
// }

// class Solution {
// public List<String> letterCombinations(String digits) {
// String Phonemap[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv",
// "wxyz" };
// List<String> ans = new ArrayList<>();
// if (digits.isEmpty() && digits == null)
// return ans;

// // StringBuilder checking = new StringBuilder();
// getAll_letter_combination(digits, Phonemap, ans, 0, "");
// return ans;
// }

// void getAll_letter_combination(String digits, String Phonemap[], List<String>
// ans, int index,
// String checking) {
// if (index == digits.length()) {
// ans.add(checking.toString());
// return;
// }
// char digit = digits.charAt(index);
// String letters = Phonemap[digit - '1'];

// for (char letter : letters.toCharArray()) {
// checking += letter;
// getAll_letter_combination(digits, Phonemap, ans, index + 1, checking);
// checking = checking.substring(0, checking.length() - 1);

// }
// }
// }

// class Solution {
// public List<String> letterCombinations(String digits) {
// List<String> combinations = new ArrayList<>();

// if (digits == null || digits.length() == 0) {
// return combinations;
// }

// Map<Character, String> digitToLetters = new HashMap<>();
// digitToLetters.put('2', "abc");
// digitToLetters.put('3', "def");
// digitToLetters.put('4', "ghi");
// digitToLetters.put('5', "jkl");
// digitToLetters.put('6', "mno");
// digitToLetters.put('7', "pqrs");
// digitToLetters.put('8', "tuv");
// digitToLetters.put('9', "wxyz");

// combinations.add(" ");

// for (char digit : digits.toCharArray()) {
// String letters = digitToLetters.getOrDefault(digit, "");
// System.out.println(letters+" "+combinations.size());
// List<String> newCombinations = new ArrayList<>();

// for (String combination : combinations) {
// for (char letter : letters.toCharArray()) {
// newCombinations.add(combination + letter);
// }
// }

// combinations = newCombinations;
// }

// Collections.sort(combinations);

// return combinations;
// }
// }