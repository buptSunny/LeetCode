package LeetCode.LC;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Lc20 {
    public static void main(String[] args) {
        String s = "()";
        Stack<Character> sups = new Stack();
        Map<Character,Character> map = new HashMap<Character,Character>(){{
            put('{','}'); put('[',']'); put('(',')'); put('?','?');
        }};
        for(int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))) {
                sups.push(s.charAt(i));
            } else {

                if (!sups.isEmpty()) {
                    Character temp = sups.pop();
                    if (map.get(temp) != s.charAt(i)) {
                        //return false;
                        System.out.println(false);
                    }
                } else {
                    //return false;
                    System.out.println(false);
                }

            }
        }
        if(sups.size()==0){
            System.out.println("True");
        }else{
            System.out.println("false");
        }


    }
}
