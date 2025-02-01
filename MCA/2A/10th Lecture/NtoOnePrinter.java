// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VfDAaT6aQi5e26wk?e=cJVFSZ

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
