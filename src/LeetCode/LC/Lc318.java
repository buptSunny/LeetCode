package LeetCode.LC;

import java.util.HashMap;

public class Lc318 {
    public static void main(String[] args) {
        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        int res = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                System.out.println(NotHasCommonLetters(words[i],words[j]));
                if (NotHasCommonLetters(words[i],words[j])){
                    int temp = words[i].length()*words[j].length();
                    if(temp>res){
                        res = temp;
                    }
                }
            }
        }
        System.out.println(res);
    }

    private static boolean NotHasCommonLetters(String word, String word1) {
        HashMap map = new HashMap();
        for(int i=0;i<word.length();i++){
            if(!map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),1);
            }
        }

        for(int i=0;i<word1.length();i++){
            if(map.containsKey(word1.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
