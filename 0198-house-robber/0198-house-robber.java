class Solution {
    int[] dp;
    private int robb(int[] nums,int i,int n) {
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        return dp[i]=Math.max(robb(nums,i+1,n),robb(nums,i+2,n)+nums[i]);
        
    }
    public int rob(int[] nums){
        int n = nums.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return robb(nums,0,n);
    }
}