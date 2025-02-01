// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VfDAaT6aQi5e26wk?e=cJVFSZ

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
