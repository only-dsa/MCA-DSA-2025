// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_Vfst5h4-0Cdvc4OE?e=p68d0m

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
