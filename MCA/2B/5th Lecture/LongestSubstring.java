// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_Vfst5h4-0Cdvc4OE?e=p68d0m
// Problems on Sliding Window
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        //bucket
        HashSet<Character> set = new HashSet<>();
        int ans = 0;

        while(j<s.length()) {
            // j processed
            char ch = s.charAt(j);
            if(set.contains(ch)) { //jth character already exist in the set
                    while(s.charAt(i) != ch) {  //ba ---> i=0 j=3
                        set.remove(s.charAt(i));
                        i++;
                    }
                    set.remove(s.charAt(i));
                    i++;
                    ans = Math.max(ans, j-i+1);

            } else {
                set.add(ch);
                ans = Math.max(ans, j-i+1);
                j++;
            }
         }

         return ans;
    }
}
