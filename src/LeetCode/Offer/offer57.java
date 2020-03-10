package LeetCode.Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class offer57 {
    public static void main(String[] args) {
        int[] nums = {1,2,4,7,11,15};
        int target = 15;
        int[] res = SumOftwoNumInnums(nums,target);
        ArrayList res2 = SumOfcontinueNums(target);
    }
    private static ArrayList SumOfcontinueNums(int target) {
        int left = 1;
        int right = 2;
        ArrayList list = new ArrayList<>();
        while((left<(target+1)/2)&&left<right){
            double mid =  (left+right)/2.0;
            double sum = mid*(right-left+1);
            if(sum>target){
                left++;
            }
            else if(sum<target){
                right++;
            }
            else{
                int[] res = new int[right-left+1];
                for(int i=left;i<=right;i++){
                    res[i-left] = i;
                }
                System.out.println(Arrays.toString(res));
                list.add(res);
                right++;
            }
        }
        return list;
    }

    private static int[] SumOftwoNumInnums(int[] nums, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = nums.length-1;
        while(left<right) {
            int sum = nums[left]+nums[right];
            if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }
            else{
                res[0] = nums[left];
                res[1] = nums[right];
                break;
            }
        }
        return res;
    }
}
