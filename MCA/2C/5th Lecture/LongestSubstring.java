// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWAAAAAAAAB0M3lPSNdqbbSKwLYZYKKAg?e=S9ZWhy
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
