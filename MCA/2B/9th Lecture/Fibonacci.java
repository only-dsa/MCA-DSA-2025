// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV-AAAAAAABXKp-eYako79rQn-jfq6gsw?e=5cVa6I

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
