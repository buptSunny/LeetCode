package LeetCode.Offer;

import java.util.HashMap;

public class offer50 {
    public static void main(String[] args) {
        String strs = "abaccdeff";
        HashMap<Character,Object> map = new HashMap<>();
        char res = strs.charAt(0);
        for(int i=0;i<strs.length();i++){
            char alpha = strs.charAt(i);
            if(map.containsKey(strs.charAt(i))){
                map.put(strs.charAt(i),false);
            }else{
                map.put(strs.charAt(i),i);
            }
        }
        int min = 100;
        for(Object i:map.values()){
            if(i instanceof Integer){
                if(min>(int) i){
                    min =(int) i;
                }
            }
        }
        System.out.println(strs.charAt(min));
    }
}
