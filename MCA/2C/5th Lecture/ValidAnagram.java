// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWAAAAAAAAB0M3lPSNdqbbSKwLYZYKKAg?e=S9ZWhy

// Valid Anagram

// https://leetcode.com/problems/valid-anagram/

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    // APPROACH - 1 (USING SORTING)
    // TC:- O(NlogN)
    // SC:- O(N+M)  ---> N is the length of s and M is the length of t

    public static boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }

    
    // APPROACH - 2 (USING MAP)

    // TC:- O(N+M) ---> N is the length of s and M is the length of t
    // SC:- O(26) ~ O(1)

    public static boolean isAnagram(String s, String t) {
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


    // APPROACH - 3 (USING 2 ARRAYS)
    // Time Complexity :- O(N)
    // Space Complexity :- O(26) + O(26) ~ O(1)

    public static boolean isAnagram(String s, String t) {
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


    // APPROACH - 4 (Using 1 Array)
    // Time Complexity :- O(N)
    // Space Complexity :- O(26) ~ O(1)

    public static boolean isAnagram(String s, String t) {
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
