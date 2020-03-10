package LeetCode.LC;

import java.util.ArrayList;

public class Lc22 {
    static ArrayList<String> res = new ArrayList<>();
    public static void main(String[] args) {
        int n = 3;
        String s = "";
        int left = n;
        int right = n;
        generateParenthesis(n,s,left,right);
        System.out.println(res.toString());
    }

    private static void generateParenthesis(int n, String s, int left, int right) {
        if(left==0&&right==0){
            res.add(s);
            System.out.println(s);
            return;
        }

        /*
            左右括号的数目；如果右括号剩余的多，则可以+左/右括号
                           如果左括号剩余的多，则只能+左括号。加右括号一定违法
         */
        if(left>0){
            generateParenthesis(n,s+"(",left-1,right);
        }
        if(right>0&&right>left){
            generateParenthesis(n,s+")",left,right-1);
        }
    }
}
