// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VfDAaT6aQi5e26wk?e=cJVFSZ
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

import java.util.*;

public class KeypadCombination {
    public static void main(String[] args) {
        String digits = "23";
        List<String> ans = letterCombinations(digits);
        System.out.println(ans);
    }

    public static List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return new ArrayList<>();
        }
        String[] words = new String[10];
        words[2] = "abc";
        words[3] = "def";
        words[4] = "ghi";
        words[5] = "jkl";
        words[6] = "mno";
        words[7] = "pqrs";
        words[8] = "tuv";
        words[9] = "wxyz";

        return recursion(digits, words);
    }

    public static List<String> recursion(String digits, String[] words) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) {
            ans.add("");
            return ans;
        }

        List<String> temp = recursion(digits.substring(1), words);
        int num = digits.charAt(0) - '0';
        String word = words[num];
        for(int i=0; i< word.length(); i++) {
            char ch =word.charAt(i);
            for(String s : temp) {
                ans.add(ch+s);
            }
        }

        return ans;
    }

}
