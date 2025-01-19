// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQCYFjAAkscMGZzU?e=WJbEci

// MERGE 2 SORTED ARRAYS

https://leetcode.com/problems/merge-sorted-array/

APPROACH - 1

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m+n];
        int k=0;
        for (int i = 0; i < m; i++) {
            merged[k++] = nums1[i];
        }

        for (int i = 0; i < m; i++) {
            merged[k++] = nums1[i];
        }

        Arrays.sort(nums1);
    }
}

APPROACH - 2

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
          
            // Pick smaller of the two current elements and move ahead in the array of the picked element
            if (nums1[i] < nums2[j])
                merged[k++] = nums1[i++];
            else
                merged[k++] = nums2[j++];
        }

    // if there are remaining elements of the first array, move them
        while (i < m)
            merged[k++] = nums1[i++];

// Else if there are remaining elements of the second array, move them
        while (j < n)
            merged[k++] = nums2[j++];
    }
}