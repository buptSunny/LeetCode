package LeetCode.Offer;

import java.util.Arrays;

public class offer38 {
    public static void main(String[] args) {
        String[] strs = {"a","b","c"};
        int start = 0;
        String s = "abc";
        char[] a= s.toCharArray();
        System.out.println(s);
        System.out.println();
        //permutations(strs,start);
    }

    private static void permutations(String[] strs, int start) {
        if(start == strs.length){
            System.out.println(Arrays.toString(strs));
            return;
        }
        for(int i = start;i<strs.length;i++){
            String temp = strs[i];
            strs[i] = strs[start];
            strs[start] = temp;

            permutations(strs,start+1);

            String tem = strs[i];
            strs[i] = strs[start];
            strs[start] = tem;

        }
    }
}
