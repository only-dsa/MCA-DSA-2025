// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV-AAAAAAABXKp-eYako79rQn-jfq6gsw?e=5cVa6I

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
