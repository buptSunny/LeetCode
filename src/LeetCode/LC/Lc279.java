package LeetCode.LC;

import java.util.Arrays;

/*
给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 */
public class Lc279 {
    public static void main(String[] args) {
        int n = 13;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        int count = 1;
        for(int j=1;j*j<n;j++){
            dp[j*j]=1;
            count++;
        }

        for(int i=2;i<dp.length;i++){
            int minValue = 100;
            for(int j=1;j*j<=i;j++){
                int temp = dp[i-j*j];
                if(temp<minValue){
                    minValue = temp;
                }
            }
            dp[i] = minValue+1;
        }

        System.out.println(Arrays.toString(dp));

    }
}
