// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWAAAAAAAAB0M3lPSNdqbbSKwLYZYKKAg?e=S9ZWhy

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {5,2,9,1,4};
        quickSort(nums, 0, nums.length - 1);
        // nums will be sorted
        for(int ele : nums) {
            System.out.print(ele +"  ");
        }
    }

    public static void quickSort(int[] nums, int start, int end) {
        if(start >= end) {
            return;
        }

        int idx = partition(nums, start, end);
        quickSort(nums, start, idx-1);
        quickSort(nums, idx+1, end);
    }

    public static int partition(int[] nums, int start, int end) {
        int ele = nums[end];
        int idx = start;
        for(int i = start; i < end; i++) {
            if(nums[i] < ele) {
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i]= temp;
                idx++;
            }
        }

        int temp = nums[idx];
        nums[idx] = nums[end];
        nums[end]= temp;

        return idx;
    }
}