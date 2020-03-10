package LeetCode.Offer;

import java.util.*;

public class offer63 {
    public static void main(String[] args) {
        int[] arrays = {7,1,5,0,3,6,4};
        int[] dp = new int[arrays.length+1];
        dp[0] =  0;
        int min = 100;
        for(int i=1;i<arrays.length;i++){
            if(arrays[i-1]<min){
                min = arrays[i-1];
            }
            dp[i] = arrays[i] - min;
        }
        System.out.println(Arrays.toString(dp));
        List<Integer> resultList = new ArrayList<>();
        for(int i:dp){
            resultList.add(i);
        }
        System.out.println(Collections.max(resultList));
    }
}
