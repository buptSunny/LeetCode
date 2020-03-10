package LeetCode.LC;

import java.util.*;

public class Lc49 {
    private static Collection<ArrayList<String>> ValueSet;

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String,ArrayList<String>> map = new HashMap();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            /*
                map.containsKey: 比较的是key的hashMap值。
                如果key是数组，即使数组的内容一样，引用并不一定相同；
                如果key是String，则会好点？
             */
            if(map.containsKey(key)){
                ArrayList list =  map.get(key);
                list.add(s);
                map.put(key,list);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue().toString());
        }
        System.out.println(map.values());
    }

}
