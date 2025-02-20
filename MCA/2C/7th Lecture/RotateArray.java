// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWAAAAAAAAB0M3lPSNdqbbSKwLYZYKKAg?e=S9ZWhy
// https://leetcode.com/problems/rotate-array/description/


class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate1(nums, k);
        rotate(nums, k);
    }

    public static void rotate1(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        for(int rot = 1; rot <= k; rot++) {
            int temp = nums[len - 1];
            for(int i = nums.length - 2; i>=0; i--) {
                nums[i+1] = nums[i];
            }
            nums[0] = temp;
        }
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
