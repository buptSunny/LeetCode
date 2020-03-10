package LeetCode.Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
    dp
 */
public class offer46 {
    public static void main(String[] args) {
        int nums = 12258;
        int index = 0;
        char[] strs = String.valueOf(nums).toCharArray();
        int res = TypeOfTranslateToAlpha(strs,index);
        System.out.println(res);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=strs.length-1;i>=0;i--){
            int temp = (int) strs[i]-'0';
            list.add(temp);
        }

        int[] sub = new int[strs.length+1];
        int n = 1 ;
        sub[0] = 0;
        sub[1] = 1;
        for(int i=1;i<list.size();i++){
            int temp = list.get(i)*10+list.get(i-1);
            if(temp<26){
                sub[i+1] = sub[i]+sub[i-1];
            }
            else{
                sub[i+1] = sub[i];
            }
        }
        System.out.println(Arrays.toString(sub));
        System.out.println(sub[sub.length-1]);
    }

    private static int TypeOfTranslateToAlpha(char[] nums, int index) {
        if(index==nums.length-1){
            return 1;
        }
        if(index>nums.length-1){
            return 0;
        }
        return TypeOfTranslateToAlpha(nums,index+1)+TypeOfTranslateToAlpha(nums,index+2)*Weight(nums[index],nums[index+1]);
    }

    private static int Weight(char num, char num1) {
        if((int) num -'0' <2){
            return 1;
        }
        else if((int) num-'0'==2&&(int) num1-'0'<6){
            return 1;
        }
        else{
            return 0;
        }
    }
}
