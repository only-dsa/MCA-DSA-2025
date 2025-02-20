// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV8AAAAAAABC61VCayPHysT_yPdrj7AEQ?e=PvzGUF
// https://leetcode.com/problems/two-sum
// Two Sum Problem


import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        if(ans.length == 2) {
            System.out.println(ans[0]+"  "+ans[1]);
        } else {
            System.out.println("No result found");
        }
    }

    // Approach - 1 ----> Brute Force
    // Time Complexity : O(N^2)
    // Space Complexity : O(1)

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    int[] ans = new int[2];
                    ans[0] = i;
                    ans[1]= j;
                    return ans;
                }
            }
        }
        return null; // No solution found (or return null)
    }


    // APPROACH - 2 ---> TWO PASS HASHMAP
    // Time Complexity ----> O(N)
    // Space Complexity ----> O(N)

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

        return null; // No solution found
    }

    // Approach - 3 -----> One Pass HashMap
    // Time Complexity : O(N)
    // Space Complexity : O(N)

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