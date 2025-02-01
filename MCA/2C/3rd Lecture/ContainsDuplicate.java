// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQCYFjAAkscMGZzU?e=WJbEci

// Learn about HashMap and HashSet along with the methods then solve the question with different approaches

// https://leetcode.com/problems/contains-duplicate/description/


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }

    // Approach - 1  (Using Brute Force)
    // TC:- O(N^2)
    // SC:- O(1)

    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }


    // Approach - 2 (Using Sorting)
    // TC:- O(NlogN)
    // SC:- O(1)

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }


    // Approach - 3 (Using HashSet) 
    // TC:- O(N)
    // SC:- O(N)

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }


    // Approach - 4 (Using HashMap)
    // TC:- O(N)
    // SC:- O(N)

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}
