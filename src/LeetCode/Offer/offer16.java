package LeetCode.Offer;

import java.util.Stack;

public class offer16 {
    public static void main(String[] args) {
        double base = 2;
        int exp = 12;
        int res = power((int) base, exp);
    }


    private static int power(int base, int exp) {
        if(exp ==1 ){
            return base;
        }
        else if(exp%2==0){
            return power(base,exp/2)*power(base,exp/2);
        }
        else{
            return base*power(base,(exp-1)/2)*power(base,(exp-1)/2);
        }
    }



}
