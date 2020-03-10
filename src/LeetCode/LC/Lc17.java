package LeetCode.LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Lc17 {
    static ArrayList res = new ArrayList();
    public static void main(String[] args) {
        String digits = "23";
        HashMap<String,String> map = new HashMap();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        ArrayList<Character> temp = new ArrayList<>();
        int start = 0;
        composed(digits,map,temp,start);
        System.out.println(res.toString());
    }

    private static void composed(String digits, HashMap<String, String> map, ArrayList<Character> temp, int start) {
        if(start == digits.length()){
            ArrayList<Character> t = (ArrayList<Character>) temp.clone();
            res.addAll(Arrays.asList(t));
            return;
        }
        String value = map.get(String.valueOf(digits.charAt(start)));
        for(int i=0;i<value.length();i++){
            temp.add(value.charAt(i));
            composed(digits,map,temp,start+1);
            temp.remove(temp.size()-1);
        }
    }
}
