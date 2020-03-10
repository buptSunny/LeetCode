package LeetCode.Offer;

import java.util.*;

public class offer59 {
    public static void main(String[] args) {
        /*
            滑动窗口的最大值；
            滑动窗口==队列；
         */
        int[] nums = {2, 3, 4, 2, 6, 2, 5, 1};
        int width = 3;
        ArrayList<Integer> list2 = MaxInQueue2(nums, width);
        System.out.println(list2.toString());
    }

    private static ArrayList<Integer> MaxInQueue2(int[] nums, int width) {
        /*
            优先队列（最小堆）；改成最大堆
         */

        PriorityQueue<tmp> queue = new PriorityQueue<tmp>(new Comparator<tmp>() {
            @Override
            public int compare(tmp o1, tmp o2) {
                /**以下是对比较器升序、降序的理解.
                 *(1) 写成return o1.compareTo(o2) 或者 return o1-o2表示升序
                 *(2) 写成return o2.compareTo(o1) 或者return o2-o1表示降序
                 */
                return o2.num.compareTo(o1.num);
            }
        });
        int index = 0;
        while (queue.size() < width-1) {
            tmp temp = new tmp(nums[index], index);
            queue.offer(temp);
            index++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = width - 1; i <= nums.length - 1; i++) {
            queue.offer(new tmp(nums[i], i));
            tmp p = queue.peek();
            while (p.getPos() <= i - width) {
                queue.poll();
                p = queue.peek();
            }
            res.add(p.getNum());
        }
        return res;
    }
}

class tmp{
    public tmp() {
    }
    public tmp(Integer num,Integer pos) {
        this.pos = pos;
        this.num = num;
    }

    public Integer pos;
    public Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

}

