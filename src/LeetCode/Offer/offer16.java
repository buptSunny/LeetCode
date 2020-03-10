package LeetCode.Offer;

public class offer16 {
    public static void main(String[] args) {
        int base = 2;
        int exp = 12;
        int res = power(base, exp);
        if(exp>0){
        System.out.println(res);}
        else if(exp<0){
            double re = 1/res;
            System.out.println(res);
        }
        else{
            System.out.println(1);
        }
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
