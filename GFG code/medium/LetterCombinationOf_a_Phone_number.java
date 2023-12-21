import java.util.*;

public class LetterCombinationOf_a_Phone_number {
    public static void main(String[] args) {
        String val = "23";
        System.out.println(new Solution().letterCombinations(val));
    }

}

class Solution {
    public List<String> letterCombinations(String digits) {
        String Phonemap[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv",
                "wxyz" };
        List<String> ans = new ArrayList<>();
        StringBuilder checking = new StringBuilder();
        getAll_letter_combination(digits, Phonemap, ans, 0, checking);
        return ans;
    }

    void getAll_letter_combination(String digits, String Phonemap[], List<String> ans, int index,
            StringBuilder checking) {
        if (index == digits.length()) {
            ans.add(checking.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = Phonemap[digit - '0'];
        
        for (char letter : letters.toCharArray()) {
            checking.append(letter);
            getAll_letter_combination(digits, Phonemap, ans, index + 1, checking);
            checking.deleteCharAt(checking.length() - 1);

        }
    }
}

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