// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV-AAAAAAABXKp-eYako79rQn-jfq6gsw?e=5cVa6I


import java.util.Arrays;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int a[]={1,423,6,46,34,23,13,53,4};
        approachOne(a);

        approachTwo();
    }

    public static void approachOne(int[] a) {
         //Implemented inbuilt function to sort array
        Arrays.sort(a);
      
         // after sorting the value at 0th position will minimum and 
         //nth position will be maximum
        System.out.println("Minimum is "+a[0]+"  "+"Maximum is "+a[a.length-1]);
    }

    public static void approachTwo() {
        int nums[] = { 12, 1234, 45, 67, 1 };
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Minimum element of array: " + min);
        System.out.println("Minimum element of array: " + max);
    }
}
