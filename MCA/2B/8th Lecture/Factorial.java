// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_Vfst5h4-0Cdvc4OE?e=p68d0m

public class Factorial {
    public static int fact(int n) {
        if(n <= 1) {
            return 1;
        }

        return n * fact(n-1);
    }

    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }
}
