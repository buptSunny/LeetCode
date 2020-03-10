package LeetCode.LC;

import java.util.Arrays;
import java.util.Comparator;

public class Lc14 {
    public static void main(String[] args) {
        String[] strs = {"abab","aba",""};
        /*
            先找到strs[0]和strs[1]的公共子串；后用该公共子串与后面的字符匹配；
         */

        StringBuffer c = new StringBuffer();
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        String a = strs[0];
        String b = strs[1];

        System.out.println(Arrays.toString(strs));

        for(int i=0;i<Math.min(a.length(),b.length());i++){
            if(a.charAt(i)==b.charAt(i)){
                c.append(a.charAt(i));
            }
            else{
                break;
            }
        }
        StringBuffer res = new StringBuffer();
        System.out.println("c="+c);
        for(int j=0;j<c.length();j++){
            for(int i = 2;i<strs.length;i++){
                if(c.charAt(j)!=strs[i].charAt(j)){
                    System.out.println(res);
                    break;
                }
            }
            res.append(c.charAt(j));
        }
        System.out.println(res);

    }
}
