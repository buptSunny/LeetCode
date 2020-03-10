package LeetCode.LC;

import java.util.*;

public class Lc39 {
    static ArrayList res = new ArrayList();
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        Arrays.sort(candidates);
        System.out.println(Arrays.toString(candidates));
        int target = 8;
        ArrayList temp = new ArrayList();
        int start = 0;
        combanationSum(candidates,target,temp,start);
        HashMap map = new HashMap();
        map.put(1,1);

        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            Integer key = (Integer) entry.getKey();
            System.out.println(key);
        }
        System.out.println(res.toString());
    }
    private static void  combanationSum(int[] candidates, int target, ArrayList temp, int start) {
        if(target==0){
            ArrayList t = (ArrayList) temp.clone();
            res.add(t);
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start&&candidates[i]==candidates[i-1]){
                continue;
            } // start=0,i=1;此时要是两者相同，则continue；

            /*
            if(i!=start&&candidates[i]==candidates[i-1]){
                continue;
            } // start=0,i=1;此时要是两者相同，则continue；

             */

            temp.add(candidates[i]);
            combanationSum(candidates,target-candidates[i],temp,i+1);
            temp.remove(temp.size()-1);
        }


    }
}
