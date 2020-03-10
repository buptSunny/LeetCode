package LeetCode.LC;

import java.util.ArrayList;
import java.util.Collections;

/*
    n个数[1~n]，第k个排列;
    [1,2,3]
    4%(2)!=2,当其实应该取第2个数，Num[1];
    因此，将k--;
        0，1 取第1个数；2，3取第2个数；符合规律
    k%(n-1)！,可以确定第一个数
    依次类推
 */
public class Lc60 {
    public static void main(String[] args) {
        int n = 3;
        int k = 4;
        k--;
        if(k>factorial(n)){
            k = k%n;
        }

        ArrayList nums = new ArrayList();
        for (int i = 0; i < n; i++) {
            nums.add(String.valueOf(i+1));
        }
        int temp = n;
        ArrayList<String> list = new ArrayList();
        while (temp > 0) {
            int index = (int)  k/factorial(temp-1);
            System.out.println(index);
            list.add((String) nums.get(index));
            nums.remove(index);
            k = k%factorial(temp-1);
            temp--;
        }
        System.out.println(list.toString());
        String res = "";
        for(String s:list){
            res += s;
        }
        System.out.println(res);
    }

    private static int factorial(int n) {

        int res = 1;
        if (n == 0) {
            return res;
        }
        while (n > 0) {
            res = res * n;
            n--;
        }
        return res;
    }

}
