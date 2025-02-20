// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQJdJPx7IC_zRSw_?e=c0bhQS
// Valid Palindrome
// https://leetcode.com/problems/valid-palindrome

public class ValidPalindrome {

    public static void main(String[] args) {
        
    }

    public boolean isPalindrome(String s) {
        int n = s.length();
        int start = 0, end = n-1;
        while(start < end) {
            // jab tak character na mil jaye increase/decrease the pointer
            // while(start is not character and start< end) {
            //     start++;
            // }

            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }

            // while(end is not character and end>start) {
            //     end --
            // }
            while(end > start && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
                System.out.println(s.charAt(start) + "  " + s.charAt(end));
            // if(start character != end character) return false
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
