class Solution {
    public int LCS(int i,int j,int n1,int n2,String t1,String t2,int[][] dp)
    {
        if(i>=n1 || j>=n2)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j)) 
            return 1+LCS(i+1,j+1,n1,n2,t1,t2,dp);
        else
            return dp[i][j] = Math.max(LCS(i,j+1,n1,n2,t1,t2,dp),LCS(i+1,j,n1,n2,t1,t2,dp));
    }
    public int longestCommonSubsequence(String t1, String t2) {
        int n1 = t1.length();
        int n2 = t2.length();
        int[][] dp = new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++)
        Arrays.fill(dp[i],-1);
        return LCS(0,0,n1,n2,t1,t2,dp);

        
    }
}