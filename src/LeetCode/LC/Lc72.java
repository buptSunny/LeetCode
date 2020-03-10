package LeetCode.LC;

public class Lc72 {
    public static void main(String[] args) {
        String words1 = "horse";
        String words2 = "ros";
        int minEditDistance = minDistance(words1,words2);
        System.out.println(minEditDistance);
    }

    private static int minDistance(String words1, String words2) {
        int m = words1.length();
        int n = words2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            dp[i][0] = i;
        }
        for(int j=0;j<n+1;j++){
            dp[0][j] = j;
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(words1.charAt(i-1)==words2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = min(dp[i-1][j-1],dp[i-1][j],dp[i][j-1])+1;
                }
            }
        };
        return dp[m][n];

    }

    private static int min(int i, int i1, int i2) {
        int min = Math.min(i,i1);
        return Math.min(min,i2);
    }
}
