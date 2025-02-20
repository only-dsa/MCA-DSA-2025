// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV8AAAAAAABC61VCayPHysT_yPdrj7AEQ?e=PvzGUF
// https://leetcode.com/problems/climbing-stairs/description/

public class ClimbStairs {
    public static void main(String[] args) {
        int n = 4;
        int ans = climbStairs(n);
        System.out.println(ans);
    }

    public static int climbStairs(int n) {
        if(n == 0) {
            return 1;
        }

        if(n < 0) {
            return 0;
        }

      return  climbStairs(n-1) + climbStairs(n-2);
    }
}
