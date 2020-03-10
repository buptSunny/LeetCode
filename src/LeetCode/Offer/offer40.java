package LeetCode.Offer;

import LeetCode.sort.BubbleSort;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
    数组中最小的K个值
 */
public class offer40 {
    public static void main(String[] args) {
        int[] arrays = {1,3,4,5,6,2,7,10};
        int k = 3;
        /*
            冒泡排k个，复杂度O(kn)
         */
        int[] res = BubbleKsort(arrays,k);
        ArrayList<Integer> res1 = MaxHeapGetKmin(arrays,k);
        System.out.println(Arrays.toString(res));
        System.out.println(res1.toString());
    }
    /*
        用优先队列代替最大堆；
     */
    private static ArrayList<Integer> MaxHeapGetKmin(int[] arrays, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(k==0)
            return res;
        if(arrays==null || arrays.length==0)
            return res;
        if(arrays.length<k)
            return res;

        PriorityQueue<Integer> pq = new PriorityQueue<>(k, new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                return o2 - o1;
            }
        });
        for(int i=0; i<arrays.length; i++){
            if(pq.isEmpty() || pq.size()<k)
                pq.add(arrays[i]);
            else{
                if(arrays[i]<pq.peek()){
                    pq.poll();
                    pq.add(arrays[i]);
                }
            }
        }
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        return res;

    }

    private static int[] BubbleKsort(int[] arrays, int k) {
        if(arrays.length<=k){
            return arrays;
        }
        for(int i = 0;i<k;i++){
            for(int j=i+1;j<arrays.length;j++){
                if(arrays[i]>arrays[j]){
                        int temp = arrays[i];
                        arrays[i] = arrays[j];
                        arrays[j] = temp;
                }
            }
        }
        int[] res = Arrays.copyOfRange(arrays,0,k);
        return res;
    }
}
