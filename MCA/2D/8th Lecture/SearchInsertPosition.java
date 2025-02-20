// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQJdJPx7IC_zRSw_?e=c0bhQS

// https://leetcode.com/problems/search-insert-position/description/


public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length  - 1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(nums[mid] == target) {
                return mid;
            } else {
                if(nums[mid] < target) {
                    left = mid + 1;
                } else {
                    // nums[mid] > target
                    right = mid - 1;
                }
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int pos = searchInsert(nums, target);
        System.out.println(pos);
    }
}
