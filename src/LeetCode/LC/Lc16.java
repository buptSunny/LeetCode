package LeetCode.LC;

import sun.misc.MetaIndex;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Lc16 {
    public static void main(String[] args) {
        int[] nums = {1,2,4,8,16,32,64,128};
        Arrays.sort(nums);
        int target = 82;
        int res = ThreeSum(nums,target);
        System.out.println(res);
    }

    private static int ThreeSum(int[] nums, int target) {
        int MinDiff = 1000000;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = sum - target;
                if(diff>0){
                    right--;
                    if(Math.abs(diff) < Math.abs(MinDiff)){
                        MinDiff = diff;
                    }
                }
                if(diff<0){
                    left++;
                    if(Math.abs(diff) < Math.abs(MinDiff)){
                        MinDiff = diff;
                    }
                }
                if (diff ==0 ) {
                    return target;
                }
            }
        }
            return target +MinDiff;
        }
}

