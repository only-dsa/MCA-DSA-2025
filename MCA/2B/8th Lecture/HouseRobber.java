// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV-AAAAAAABXKp-eYako79rQn-jfq6gsw?e=5cVa6I
// https://leetcode.com/problems/house-robber/description/

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int ans = rob(0, nums);
        System.out.println(ans);
    }
    
    public static int rob(int idx,int[] nums)
    {
        if(idx>=nums.length)
        {
            return 0;
        }
        
        // accept 
        int op1=nums[idx]+rob(idx+2,nums);
        
        // don't accept
        int op2=rob(idx+1,nums);
        
        return Math.max(op1,op2);
    }
}
