package LeetCode.Offer;

import java.util.Comparator;
import java.util.PriorityQueue;
/*
    优先队列做最大堆和最小堆
 */
public class offer41 {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
        /*
            左边是最大堆，右边是最小堆，最大堆中所有数字都要<最小堆的堆顶；
            奇数给最大堆，偶数给最小堆。
            如果奇数的数字大于最小堆的堆顶，则把该数字给最小堆，并从最小堆中拿出堆顶给最大堆，作用最大堆的堆顶。
            这样位置左右两个堆数字平衡。
         */
    public  void Insert(int nums){
       if(((minHeap.size()+maxHeap.size())&1)==0){
            /*
                偶数加入最小堆
             */
            if(!maxHeap.isEmpty()&&maxHeap.peek()>nums){
                maxHeap.offer(nums);
                nums = maxHeap.poll();
            }
            minHeap.offer(nums);
       }
       else{
           if(!minHeap.isEmpty()&&minHeap.peek()<nums){
               minHeap.offer(nums);
               nums = minHeap.poll();
           }
            minHeap.offer(nums);
       }
    }
}
