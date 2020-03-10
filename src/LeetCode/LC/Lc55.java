package LeetCode.LC;

import java.util.Arrays;

public class Lc55 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        //int[] nums = {1,2,3};
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(dp[i-1]>=i){
                dp[i] = Math.max(dp[i-1],i + nums[i]);
            }else{
                //return false;
                System.out.println(false);
            }
        }
        System.out.println(Arrays.toString(dp));
    }
}
