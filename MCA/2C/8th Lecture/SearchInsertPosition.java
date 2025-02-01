// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQCYFjAAkscMGZzU?e=WJbEci

// https://leetcode.com/problems/search-insert-position/description/


public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0 , end = nums.length-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                // [1,2,3,4,mid,6,7] ---> target = 3, mid = 5
                end = mid - 1;

            } else if(nums[mid] < target) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int pos = searchInsert(nums, target);
        System.out.println(pos);
    }
}
