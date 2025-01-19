// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQCYFjAAkscMGZzU?e=WJbEci

// Problems on String and Sliding Window
// https://leetcode.com/problems/valid-anagram/
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

                                VALID ANAGRAM

APPROACH - 1 (USING SORTING)

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}

APPROACH - 2 (USING MAP)

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        
        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        
        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }
        
        // Check if any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
    }
}


APPROACH - 3 (USING 2 ARRAYS)

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);  // ''a', 'b', 'c'
            sFreq[ch-'a'] ++;
        }

        for(int i=0;i<t.length();i++) {
            char ch = t.charAt(i);
            tFreq[ch-'a']++;
        }

        for(int i=0;i<26;i++) {
            if(sFreq[i] != tFreq[i]) {
                return false;
            }
        }

        return true;
    }
}

APPROACH - 4 (Using 1 Array)

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            freq[ch-'a']++; //increment
        }

        for(int i=0;i<t.length();i++) {
            char ch = t.charAt(i);
            freq[ch-'a']--;  // decrement
        }

        for(int i=0;i<26;i++) {
            if(freq[i] != 0){
                return false;
            }
        }

        return true;
    }
}


            LENGTH OF LONGEST SUBSTRING


class Solution {
    public int lengthOfLongestSubstring(String s) {
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