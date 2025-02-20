// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWAAAAAAAAB0M3lPSNdqbbSKwLYZYKKAg?e=S9ZWhy
// https://leetcode.com/problems/generate-parentheses/description/

import java.util.ArrayList;

public class GenerateParenthesis {
    static ArrayList<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        int n = 3;
        recursion(n, n, "");
        System.out.println(ans);
    }

    public static void recursion(int open, int closed, String s) {
        if(open == 0 && closed == 0) {
            ans.add(s);
            return;
        }

        // System.out.println(open +"  "+closed);

        if(open == closed) {
            // only 1 option ---> add open bracket then open-1
            recursion(open-1, closed, s+"(");
        } else if(open == 0) {
            recursion(open , closed-1, s+")");
        } else if(open < closed) {
            recursion(open-1, closed, s+"(");
            recursion(open, closed-1, s+")");
        } 
    }
}
