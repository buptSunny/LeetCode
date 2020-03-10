package LeetCode.LC;

import java.util.Arrays;

public class Lc300 {
    public static void main(String[] args) {
        int[] nums =    {10,9,2,5,3,7,101,18};
        int res = lengthOfLIS(nums);
        System.out.println(res);
    }

    private static int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];

         for(int i=0;i<res.length;i++){
             res[i] = 1;
         }

        for(int i=1;i<nums.length;i++){
            int maxValue = 0;
            for(int j=0;j<i;j++){
                if(nums[j]>nums[i]){
                    continue;
                }else{
                    if(maxValue<res[j]){
                        maxValue = res[j];
                    }
                }
            }
            res[i] = maxValue+1;
        }
        System.out.println(Arrays.toString(res));
        //返回res中的最大
        return 0;
  }
}
