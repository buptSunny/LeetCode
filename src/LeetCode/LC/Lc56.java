package LeetCode.LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Lc56 {
    static ArrayList res1 = new ArrayList();
    public static void main(String[] args) {
        int[][] intervals = {{2,6},{1,3},{8,10},{15,18}};
        /*
             先根据数组前面排序。
         */

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        ArrayList<int[] > list = new ArrayList();
        list.add(intervals[0]);
        int index = 0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>list.get(index)[1]){
                index++;
                list.add(intervals[i]);
            }else{
                int[] res = {list.get(index)[0],Math.max(list.get(index)[1],intervals[i][1])};
                list.set(index,res);
            }
        }

        System.out.println(Arrays.deepToString(intervals));
        for(int i=0;i<list.size();i++){
            System.out.println(Arrays.toString(list.get(i)));
        }
        int[][] result = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }

    }

    private static int[] mergeTwoNums(int[] nums1, int[] nums2) {
        if(nums1[0]<nums2[0]){
            if(nums1[1]<nums2[0]){
                // 两个矩阵不能合并

                System.out.println("两个矩阵不能合并，返回该两个矩阵即可");
                return nums1;
            }
            if(nums1[1]>=nums2[0]){
                int[] res = {nums1[0],Math.max(nums1[1],nums2[1])};
                // 合并
                return res;
            }
        }
        return null;
    }
}
