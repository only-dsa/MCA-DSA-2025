// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQJdJPx7IC_zRSw_?e=c0bhQS

class BubbleSort {  
    void bubbleSort(int arr[])
    {
        int len = arr.length;
      
        for (int pass = 1; pass < len; pass++) {
            for (int j = 0; j < len - pass; j++) {
                if (arr[j] > arr[j + 1]) {
                  
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int a[] = { 64, 34, 25, 12 };
      
        ob.bubbleSort(a);
      
          int n = a.length;
      
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}