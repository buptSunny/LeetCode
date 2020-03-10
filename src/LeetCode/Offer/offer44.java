package LeetCode.Offer;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;

public class offer44 {
    public static void main(String[] args) {
        int nums = 1001;
        int n = nums;
        int temp = 0;
        int i = 1;
        while(n>0){
            temp = (int) (i*(Math.pow(10,i)-Math.pow(10,i-1)));
            n = n - temp;
            i++;
        }
        n += temp-1;
        i--;
        int order1 = n/i;
        int order2 = n%i;
        int number = (int) Math.pow(10,i-1)+order1;
        System.out.println(number);
        char[] strs = String.valueOf(number).toCharArray();
        System.out.println(strs[order2]);

    }
}
