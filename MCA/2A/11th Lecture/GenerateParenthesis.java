// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VfDAaT6aQi5e26wk?e=cJVFSZ
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
