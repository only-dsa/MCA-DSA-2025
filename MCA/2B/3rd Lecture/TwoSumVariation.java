// CHANGED QUESTION LITTLE BIT

// 1) I MADE ALL THE ELEMENTS UNIQUE IN THE ARRAY
// 2) BY MISTAKE, I AS A DEVELOPER SORT THE ARRAY (SO YOU AS A DEVELOPER CAN ADD SOME CODE ABOVE AND BELOW OF THE SORT LINE)
// 3) IF I SORTED THE ARRAY, THEN THE INDEX CHANGED SO YOU NEED TO RETURN THE ORIGINAL INDEX


// NOTE
// YOU CAN ADD ABOVE AND BELOW OF MY ADDED LINE
// ARRAYS.SORT(NUMS);
// When we sort the array then it will changed the original index, so before sorting we need to store the index that's why we are using map to store the original index 
// TWO POINTER APPROACH ---> we use here because the array is sorted here
// so one pointer i.e. start which points to the starting index and the other pointer is end which points to the last index element


// Time Complexity : O(NLogN)
// Space Complexity : O(N)

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumVariation {
    public static void main(String[] args) {
        int[] nums = {11,2,7,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        if(ans.length == 2) {
            System.out.println(ans[0]+"  "+ans[1]);
        } else {
            System.out.println("No result found");
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        // Array elements unique

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }

        // galti se array sort
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length -1;
        int firstElement = 0, secondElement = 0;
        while(start < end) {
            // start and end 2 different element
            int sum = nums[start] + nums[end];
            if(sum == target) {
                firstElement = nums[start];
                secondElement = nums[end];
               // break;
            } else if(sum > target) {
                end--;
            } else if(sum < target) {
                start++;
            }
        }

        int[] ans = new int[2];
        ans[0] = map.get(firstElement);
        ans[1] = map.get(secondElement);
        return ans;

    }
}
