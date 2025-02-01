// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQJdJPx7IC_zRSw_?e=c0bhQS

// Median Of 2 Sorted Array
// https://leetcode.com/problems/median-of-two-sorted-arrays


public class MedianTwoSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    // Approach - 1

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m+n];
        int k=0;
        for(int i=0;i<m;i++) {
            merged[k++] = nums1[i];
        }

        for(int j=0;j<n;j++) {
            merged[k++] = nums2[j];
        }

        // array sorted
        Arrays.sort(merged);

        // array even or odd
        if(merged.length % 2 == 0) {
                int len = merged.length;
                double sum = merged[len/2] + merged[len/2-1];
                return sum/2;
        } else {
            // odd
            int len = merged.length;
            int sum = merged[len/2];
            return sum;
        }
    }

    // Approach - 2

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int merged[] = new int[m+n];
        // compare loop
        int idx1 =0, idx2 = 0;
        int k = 0;
        while(idx1 < m && idx2 < n) {
            if(nums1[idx1] > nums2[idx2]) {
                // nums2 element is smaller
                merged[k++] = nums2[idx2];
                idx2++;
            } else {
                // nums1 element is smaller
                System.out.println(k+"  "+merged.length+"  "+idx1);
                merged[k++] = nums1[idx1];
                idx1++;
            }
         }

         while(idx1 < m) {
            merged[k++] = nums1[idx1];
            idx1++;
         }

         while(idx2 < n) {
            merged[k++] = nums2[idx2];
            idx2++;
         }

         int len = merged.length; // m+ n
         int median = len / 2;
         if(len % 2 == 0) {
            // even
            double sum = merged[median] + merged[median-1];
            return sum/2;
         } else {
            // odd
            return merged[median];
         }
    }
}
