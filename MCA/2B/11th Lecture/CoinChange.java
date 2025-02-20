// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV-AAAAAAABXKp-eYako79rQn-jfq6gsw?e=5cVa6I
// https://leetcode.com/problems/coin-change/description/

class CoinChange {
    static int ans=Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        coinChange(coins,0,amount,0,0);
        
        System.out.println((ans==Integer.MAX_VALUE?-1:ans));
    }
    
    public static void coinChange(int[] coins,int sum,int amount,int count,int idx)
    {
        if(sum==amount)
        {
            ans=Math.min(ans,count);
            return;
        }
        
        if(idx>=coins.length || sum>amount)
            return;
        
        if(coins[idx]<=amount)
        {
            coinChange(coins,sum+coins[idx],amount,count+1,idx);
        }
        coinChange(coins,sum,amount,count,idx+1);
    }
}