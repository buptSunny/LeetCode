package LeetCode.Offer;

public class offer10 {
    public static void main(String[] args) {
        int n = 10;
        int res;
        res = finb2(n);
        System.out.println(res);
    }
    public static int finb(int n){
        if(n==0 || n==1){
            return 1;
        }
        return finb(n-1)+finb(n-2);
    }

    public static int finb2(int n){
        /*
            a,b = b,a+b
         */

        int[] fib = new int[10];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2; i < n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[9];

    }



}
