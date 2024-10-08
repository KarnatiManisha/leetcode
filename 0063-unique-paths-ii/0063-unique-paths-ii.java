class Solution {

    public int uniquePathsWithObstacles(int[][] arr) {   
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1); // Initialize each cell of the array individually
        }
        return f(arr, m - 1, n - 1, dp);
    }

    public int f(int[][] arr, int r, int c, int[][] dp) {
        if (r < 0 || c < 0 || arr[r][c] == 1) {
            return 0; // If current cell is out of bounds or an obstacle, return 0
        }
        if (r == 0 && c == 0) {
            return 1; // Base case: top-left cell
        }
        if (dp[r][c] != -1) {
            return dp[r][c];
        }
        int up = f(arr, r - 1, c, dp);
        int left = f(arr, r, c - 1, dp);
        return dp[r][c] = up + left;
    }

    // giving some issue , CBL
//     public int uniquePathsWithObstacles(int[][] arr) {   
//         int m= arr.length;
//         int n= arr[0].length;
//         int[][] dp= new int[m][n];
        

//         for(int i=0; i< m; i++){
//             for(int j=0; j< n; j++){
//                 if(i==0 && j==0) {
//                     dp[0][0]= 1;
//                     continue;
//                 }
//                 if(arr[i][j] == 1){
//                     dp[i][j]= 0;
//                     continue;
//                 }
//                 int up= 0;
//                 int left=0;
//                 if(i>0) up= dp[i-1][j];
//                 if(j>0) left= dp[i][j-1];
//                 dp[i][j]= up + left;            
//             }
//         }
//         return dp[m-1][n-1];
//    }
}