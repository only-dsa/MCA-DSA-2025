// OneNote Link:- https://1drv.ms/o/s!Ai9sXGetT-_VgQJdJPx7IC_zRSw_?e=c0bhQS

// Find the longest continuous 1 but we must have to delete 1 element

// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/

// USING SLIDING WINDOW

// TC:- O(N) 
// SC:- O(1)

public class LongestSubarray {
    
    public static void main(String[] args) {
       int[] nums = {1,1,0,1};
       System.out.println(longestSubarray(nums));
    }

    public int longestSubarray(int[] nums) {
        int i=0,j=0;
        int zero = 0; // cnt no of zeros
        int ans = 0;
        while(j < nums.length) {
            if(nums[j] == 0)
              zero++;

                if(zero == 2) {
                    // i will move
                    while(i < j && nums[i] != 0) {
                        i++; //   0 1 1 0
                    }
                    i++;
                     zero--;
                    ans = Math.max(ans, j-i+1-zero);
                   //  System.out.println(i+"  if " + j+"  "+ans); for debugging purpose
                    j++;
                } else if(zero == 0) {
                    ans = Math.max(ans, j-i);
                    j++;
                } else {
                    // if(zero == 0 || zero == 1)
                    // j will move
                    
                    ans = Math.max(ans, j-i+1-zero);
                   // System.out.println(i+"  else " + j+"  "+ans); // for debugging purpose
                    j++;
                }
          }

          return ans;
    }
}
