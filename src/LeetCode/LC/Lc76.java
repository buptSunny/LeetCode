package LeetCode.LC;

import netscape.javascript.JSUtil;

import java.util.HashMap;

public class Lc76 {
    class Solution {
        public String minWindow(String s, String t) {
            int left = 0;
            int right = 0;
            int result = s.length();
            int lastLeft = 0;
            if(!containsT(s,0,s.length()-1,t)){
                String a = "";
                return a;
            }
            while (right < s.length()) {
                if (containsT(s, left, right, t)) {
                    if (result > right - left + 1) {
                        lastLeft = left;
                        result = right - left + 1;
                    }
                    left++;
                } else {
                    right++;
                }
            }
            return s.substring(lastLeft,lastLeft+result);
        }

        public boolean containsT(String s, int left, int right, String t) {

            HashMap<Character, Integer> map = new HashMap<>();
            while (left <= right) {
                if(!map.containsKey(s.charAt(left))){
                    map.put(s.charAt(left), 1);}
                else{
                    map.put(s.charAt(left),map.get(s.charAt(left))+1);
                }
                left++;
            }
            for (int i = 0; i < t.length(); i++) {
                if (!map.containsKey(t.charAt(i))) {
                    return false;
                }else{
                    int count = map.get(t.charAt(i));
                    if(count>0) {
                        map.put(t.charAt(i), count - 1);
                    }
                    else{
                        return false;
                    }
                }
            }
            return true;
        }


    }

}
