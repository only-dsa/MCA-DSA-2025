// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV-AAAAAAABXKp-eYako79rQn-jfq6gsw?e=5cVa6I

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
