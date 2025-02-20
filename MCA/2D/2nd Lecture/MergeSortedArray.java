// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWCAAAAAAABcsdS1LfSEx34L_JmcV3Kdw?e=ZOlv7C

// MERGE 2 SORTED ARRAYS

// https://leetcode.com/problems/merge-sorted-array/


public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,5,6};
        merge(nums1, nums1.length, nums2, nums2.length);
    }


    // APPROACH - 1 ----> Merge both the array and then sort

    // Time Complexity :- O(NlogN)
    // Space Complexity :- O(N)

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
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


    // APPROACH - 2
    // Time Complexity :- O(N)
    // Space Complexity :- O(N)

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] merged = new int[m+n];

        while (i < m && j < n) {
          
        // Pick smaller of the two current elements and move ahead in the array of the picked element
            if (nums1[i] < nums2[j])
                merged[k++] = nums1[i++];
            else
                merged[k++] = nums2[j++];
        }

        // if there are remaining elements of the first array, move them
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        // Else if there are remaining elements of the second array, move them
        while (j < n) {
            merged[k++] = nums2[j++];
        }
    }
