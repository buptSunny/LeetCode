package LeetCode.Offer;

import java.util.ArrayList;

/*
    连续子数组的最大和
 */
public class offer42 {
    public static void main(String[] args) {
        int[] arrays = {1,-2,3,10,-4,7,2,-5};
        int res = MaxSumOfContinueArrays(arrays);
        System.out.println(res);
    }

    private static int MaxSumOfContinueArrays(int[] arrays) {
        if(arrays.length==1&&arrays.length==0){
            return arrays[0];
        }
        ArrayList<Integer> list = new ArrayList<>();
        /*
            如果i-1之前的数最大和也是负数，那么抛弃之前的数，现有的数就是最大和；
            如果i-1之前的数最大和是正数，那么之前的数+现在的数是最大和；
         */
        list.add(arrays[0]);
        for(int i = 1;i<arrays.length;i++){
            if(list.get(i-1)<0){
                list.add(arrays[i]);
            }
            else{
                list.add(arrays[i]+list.get(i-1));
            }
        }
        int res = 0;
        System.out.println(list.toString());

        for(int i:list){
            if(i>res){
                res = i;
            }
        }
        return res;
    }
}
