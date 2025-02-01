// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQCYFjAAkscMGZzU?e=WJbEci

public class NtoOnePrinter {
    public static void print(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    public static void main(String[] args) {
        print(10);
    }
}
