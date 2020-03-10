package LeetCode.LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lc313 {
    public static void main(String[] args) {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        int[] res = new int[n];
        int[] index = new int[primes.length];
        res[0] = 1;
        int i=1;
        while(i<n){
            int minValue = min(primes,res,index);
            if(minValue>res[i-1]){
                res[i] = minValue;
                i++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
    public static int min(int[] primes,int[]res,int[] index){
        ArrayList list = new ArrayList();
        for(int i=0;i<primes.length;i++){
            list.add(primes[i]*res[index[i]]);
        }
        int minValue =  (int) Collections.min(list);
        int minValueIndex = list.indexOf(minValue);
        index[minValueIndex]++;
        return minValue;
    }

}
