package LeetCode.Offer;

import java.util.Arrays;
import java.util.HashMap;

public class offer48 {
    public static void main(String[] args) {
        String strs = "arabcacfr";
        int[] dp = new int[strs.length()+1];
        dp[0] = 0;
        /*
            arabcacfr;

            abcb
         */
        HashMap<Character, Integer> map = new HashMap<>();
        /*
            如果新字母没有出现，则直接+1；并加入hashmap中；
            如果新字母已经出现，则看新字母与上一个字母的距离在不在当前最大的字字符串当中，如果在，更新子字符串，如果不在，更新Map，并距离+1
         */
        int d = 0;

        for(int i=0;i<strs.length();i++){
            if(!map.containsKey(strs.charAt(i))){
                d++;
                dp[i+1] = dp[i]+1;
            }
            else{

                int distance = i-map.get(strs.charAt(i));
                if(distance>dp[i]){
                    dp[i+1] = dp[i]+1;
                }else{
                    dp[i+1] = i-map.get(strs.charAt(i));
                }
            }
            map.put(strs.charAt(i),i);
        }
        System.out.println(dp[dp.length-1]);
        System.out.println(Arrays.toString(dp));
    }
}
