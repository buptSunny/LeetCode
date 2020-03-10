package LeetCode.LC;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lc1282 {
    public static void main(String[] args) {
        int[] groupSizes = {2,1,3,3,3,2};
        /*
            把相同的value的集合加到同一个数组里去；
         */
        HashMap<Integer, ArrayList<Integer>> map2 = new HashMap();
        for(int i=0;i<groupSizes.length;i++){
            if(map2.containsKey(groupSizes[i])){
                ArrayList list = map2.get(groupSizes[i]);
                list.add(i);
                System.out.println(list);
                map2.put(groupSizes[i],list);
            }
            else{
                ArrayList list = new ArrayList();
                list.add(i);
                map2.put(groupSizes[i],list);
            }
        }

        ArrayList res = new ArrayList();
        Iterator<Map.Entry<Integer, ArrayList<Integer>>> entries = map2.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, ArrayList<Integer>> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            Integer k  = entry.getKey();
            ArrayList temp = entry.getValue();
            int size = temp.size();
            int n = size/k;
            for(int i=0;i<n;i++){
                res.add(temp.subList(i*k+0,i*k+k));
            }
        }
        System.out.println(res);


        int[][] m = new int[5][5];



    }
}
