// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQJdJPx7IC_zRSw_?e=c0bhQS

// https://leetcode.com/problems/two-sum
Two Sum Problem

Approach - 1

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    int[] ans = new int[2];
                    ans[0] = i;
                    ans[1]= j;
                }
            }
        }
        return new int[]{}; // No solution found (or return null)
    }
}

APPROACH - 2

TWO PASS HASHMAP

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash map
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the remaining number in the hashmap after subtracting the current element from the target
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found
    }
}

APPROACH - 3

ONE PASS HASHMAP

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Find the remaining number after subtracting the current element from the target
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}

CHANGED QUESTION LITTLE BIT

1) I MADE ALL THE ELEMENTS UNIQUE IN THE ARRAY
2) BY MISTAKE, I AS A DEVELOPER SORT THE ARRAY (SO YOU AS A DEVELOPER CAN ADD SOME CODE ABOVE AND BELOW OF THE SORT LINE)
3) IF I SORTED THE ARRAY, THEN THE INDEX CHANGED SO YOU NEED TO RETURN THE ORIGINAL INDEX

NOTE
YOU CAN ADD ABOVE AND BELOW OF MY ADDED LINE
ARRAYS.SORT(NUMS);

TWO POINTER APPROACH ---> we use here because the array is sorted here
so one pointer i.e. start which points to the starting index and the other pointer is end which points to the last index element

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Array elements unique
        // galti se array sort
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }

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