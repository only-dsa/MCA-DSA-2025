// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQCYFjAAkscMGZzU?e=WJbEci

public class Fibonacci {
    public static int fibo(int n) {
        if(n <= 1) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println(ans);
    }
}
