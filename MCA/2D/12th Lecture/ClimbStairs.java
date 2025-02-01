// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQJdJPx7IC_zRSw_?e=c0bhQS
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
