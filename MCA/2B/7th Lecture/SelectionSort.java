// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_Vfst5h4-0Cdvc4OE?e=p68d0m

class SelectionSort {
    void sort(int a[])
    {
        int n = a.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
          
            // Find the minimum element in unsorted array
            int min_idx = i;
          
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx])
                    min_idx = j;
            }

            // Swap the found minimum element with the first
            // element
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }

    // main function
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int a[] = { 64, 25, 12, 22, 11 };

        ob.sort(a);
          
          int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");

    }
}