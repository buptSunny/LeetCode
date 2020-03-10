package LeetCode.Offer;

public class No2 {
    public static void main(String[] args) {
        int x = 1534236469;
        Solution2 s = new Solution2();
        int res = s.reverse(x);
        System.out.println(res);
    }
}

class Solution2 {
     public int reverse(int x) {
         try {
             if(x > 0) {
                 StringBuilder str = new StringBuilder().append(x);
                 return Integer.parseInt(str.reverse().toString());
             }else {
                 StringBuilder str = new StringBuilder().append(-x);
                 return Integer.parseInt(str.reverse().toString())*(-1);
             }
         }catch (NumberFormatException e) {
             return 0;
         }
     }
}


