// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV8AAAAAAABC61VCayPHysT_yPdrj7AEQ?e=PvzGUF

import java.util.Arrays;

// Merge sort in Java

class MergeSort {

  public static int[] merge2SortedArray(int[] nums1, int[] nums2) {
    int m = nums1.length;
    int n = nums2.length;
    int[] merged = new int[m+n];
    int s1 = 0, s2 = 0;
    int k = 0;
    while(s1 < m && s2 < n) {
        // compare
        if(nums1[s1] < nums2[s2]) {
            merged[k++] = nums1[s1];
            s1++;
        } else {
            merged[k++] = nums2[s2];
            s2++;
        }
    }

    while(s1 < m) {
        merged[k++] = nums1[s1];
        s1++;
    }

    while(s2 < n) {
        merged[k++] = nums2[s2];
        s2++;
    }

    return merged;
  }

  static int[] mergeSort(int[] nums, int start, int end) {
    if(start == end) {
        int[] arr = new int[1];
        arr[0] = nums[start]; // nums[end]
        return arr;
    }

    int mid = (start + end) / 2;
    int[] firstPart = mergeSort(nums, start, mid); // mid include
    int[] secondPart = mergeSort(nums, mid+1, end);
    return merge2SortedArray(firstPart, secondPart);
  }

  public static void main(String args[]) {

    // created an unsorted array
    int[] nums = { 6, 5, 12, 10, 9, 1 };

    int[] ans = mergeSort(nums, 0, nums.length-1);
  }
}