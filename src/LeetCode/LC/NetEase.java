package LeetCode.LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NetEase {
    public static void main(String[] args) {
        int n = 6;
        int[] arrays = {1,3,2,4,5,2,1,1};
        ArrayList res = new ArrayList();
        for(int k=1;k<=n;k++){
            int i = 0;
            int maxValue = maxV(arrays,i,k);
            i+=k;
            while(i<=n){
                if(arrays[i]>=maxValue){
                    i += k;
                    continue;
                }
                if(maxV(arrays,i-k,k)<maxValue){
                    maxValue = maxV(arrays,i-k,k);
                };
                i++;
            }
            res.add(maxValue);
        }
        System.out.println(res.toString());
    }

    private static int maxV(int[] arrays, int i, int k) {
        int maxValue = arrays[i];
        for(int j=i;j<i+k;j++){
            if(maxValue<arrays[j]){
                maxValue = arrays[j];
            }
        }
        return maxValue;
    }
}
